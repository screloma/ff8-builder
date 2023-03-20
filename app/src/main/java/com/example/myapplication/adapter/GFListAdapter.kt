package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemGfBinding
import com.example.myapplication.model.GFModel
import com.example.myapplication.viewmodel.GlobalStateViewModel

class GFListAdapter(
    private val viewModel: GlobalStateViewModel,
    private val slotId: String,
    private val onGfSelectionChange: (Int) -> Unit
) : ListAdapter<GFModel, GFListAdapter.GFViewHolder>(Differ) {

    inner class GFViewHolder(val binding: ItemGfBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(
            title: String,
            selected: Boolean,
            occupied: Boolean
        ) {
            binding.name = title
            binding.isSelected = selected
            binding.isSelectedByAnother = occupied
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GFViewHolder {
        return GFViewHolder(
            ItemGfBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: GFViewHolder, position: Int) {
        val currentGf = currentList[position]
        val currentGfOwnerSlot = viewModel.gfToSlotMap.value?.get(currentGf)

        val characterSlots = viewModel.slots.value
        val currentSlot = characterSlots?.find { it.id == slotId }

        val gfIsTakenByAnotherSlot =
            (currentGfOwnerSlot != null) && currentGfOwnerSlot != currentSlot
        val gfIsTakenByMe =
            currentSlot == currentGfOwnerSlot

        val currentGfName = currentGf?.name ?: ""
        val currentGfOwnerSlotName = if (currentGfOwnerSlot?.id != null) "(${currentGfOwnerSlot.id})" else ""
        val currentGfTitle = "${currentGfName}$currentGfOwnerSlotName"

        holder.bind(
            title = currentGfTitle,
            selected = gfIsTakenByMe,
            occupied = gfIsTakenByAnotherSlot
        )

        holder.binding.root.setOnClickListener {
            characterSlots?.apply {
                if (gfIsTakenByMe) {
                    currentSlot?.selectedGF = null
                } else {
                    currentGfOwnerSlot?.selectedGF = null
                    currentSlot?.selectedGF = currentGf
                }
                viewModel.slots.value = this
                onGfSelectionChange(position)
            }
        }
    }
}

object Differ : ItemCallback<GFModel>() {
    override fun areItemsTheSame(oldItem: GFModel, newItem: GFModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: GFModel, newItem: GFModel): Boolean {
        return oldItem == newItem
    }
}
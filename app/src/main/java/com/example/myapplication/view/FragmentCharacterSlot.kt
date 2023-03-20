package com.example.myapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.distinctUntilChanged
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.adapter.GFListAdapter
import com.example.myapplication.databinding.FragmentCharacterSlotBinding
import com.example.myapplication.util.livedata.LiveDataUtils.combineWith
import com.example.myapplication.viewmodel.GlobalStateViewModel
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class FragmentCharacterSlot : Fragment() {

    lateinit var binding: FragmentCharacterSlotBinding

    private val globalState : GlobalStateViewModel by activityViewModels()

    lateinit var gfListAdapter : GFListAdapter

    lateinit var slotId: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentCharacterSlotBinding.inflate(layoutInflater, null, false)
        if(savedInstanceState != null){
            savedInstanceState.getString(SLOT_ID_BUNDLE_KEY)?.let {
                slotId = it
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(SLOT_ID_BUNDLE_KEY, slotId)
        super.onSaveInstanceState(outState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gfListAdapter = GFListAdapter(globalState, slotId){
            lifecycleScope.launch {
                globalState.gfAdapterRefreshBus.emit(it)
            }
        }

        binding.gfList.adapter = gfListAdapter
        binding.gfList.layoutManager = GridLayoutManager(requireContext(), 2)

        lifecycleScope.launch {
            globalState.gfAdapterRefreshBus.onEach {
                gfListAdapter.notifyItemChanged(it)
            }.collect()
        }

        globalState.gfList.distinctUntilChanged().observe(viewLifecycleOwner){
            gfListAdapter.submitList(it)
        }
    }

    companion object {
        const val SLOT_ID_BUNDLE_KEY = "slotId"

        fun newInstance(slotId: String) : FragmentCharacterSlot {
            return FragmentCharacterSlot().apply {
                this.slotId = slotId
            }
        }
    }

}
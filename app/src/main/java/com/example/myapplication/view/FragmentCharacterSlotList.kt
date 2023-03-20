package com.example.myapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.App
import com.example.myapplication.databinding.FragmentCharacterSlotListBinding
import com.example.myapplication.viewmodel.GlobalStateViewModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FragmentCharacterSlotList : Fragment() {

    private lateinit var binding: FragmentCharacterSlotListBinding

    private val globalState: GlobalStateViewModel by activityViewModels()

    private lateinit var adapter: CharacterSlotsPagerAdapter

    private lateinit var pager: ViewPager2
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentCharacterSlotListBinding.inflate(layoutInflater, null, false)
        binding.let {
            pager = it.pager
            tabs = it.tabs
        }

        adapter = CharacterSlotsPagerAdapter(childFragmentManager, lifecycle)
        pager.adapter = adapter
        pager.offscreenPageLimit = SLOT_COUNT

        TabLayoutMediator(tabs, pager){ tab, position ->
            tab.text = "Slot ${position+1}"
        }.attach()

        (requireActivity().application as App).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = viewLifecycleOwner

        globalState.gfToSlotMap.observe(viewLifecycleOwner){}
    }

    companion object {
        @JvmStatic
        val SLOT_COUNT = 3
    }

}

class CharacterSlotsPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return FragmentCharacterSlotList.SLOT_COUNT
    }

    override fun createFragment(position: Int): Fragment {
        return FragmentCharacterSlot.newInstance("slot${position+1}")
    }
}

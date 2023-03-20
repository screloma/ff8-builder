package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.CharacterSlot
import com.example.myapplication.datasource.GfRepository
import com.example.myapplication.model.GFModel
import com.example.myapplication.util.livedata.LiveDataUtils.combineWith
import com.example.myapplication.view.FragmentCharacterSlotList
import kotlinx.coroutines.flow.MutableSharedFlow

class GlobalStateViewModel : ViewModel() {

    val gfList: LiveData<List<GFModel>> = GfRepository.gfList

    val slots = MutableLiveData(
        MutableList(
            FragmentCharacterSlotList.SLOT_COUNT){
            CharacterSlot("slot${it+1}")
        }
    )

    val gfToSlotMap = gfList.combineWith(slots){ list, slots ->
        list?.associateWith { gf -> slots?.find { it.selectedGF == gf } }
    }

    val gfAdapterRefreshBus = MutableSharedFlow<Int>(0)


}
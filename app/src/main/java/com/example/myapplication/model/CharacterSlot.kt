package com.example.myapplication.model

data class CharacterSlot(
    val id: String,
    var selectedGF: GFModel? = null,
    var selectedGfTag: String? = null,
    var selectedSkills: MutableList<String> = mutableListOf()
)
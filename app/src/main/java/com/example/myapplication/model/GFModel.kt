package com.example.myapplication.model

data class GFModel(
    val name: String,
    val abilities: List<GFAbility>,
    val currentSlotTag: String? = null
)



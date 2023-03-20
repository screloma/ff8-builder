package com.example.myapplication.datasource

import androidx.lifecycle.liveData
import com.example.myapplication.model.GFModel


object GfRepository {

    val gfList = liveData {
        emit(_gf)
    }

    private val _gf = listOf(
        GFModel(
            name = "Ifrit",
            skills = listOf("HP-J", "Elem-Atk-J", "Str+20%")
        ),
        GFModel(
            name = "Quezacotl",
            skills = listOf("Vit-J", "Elem-Atk-J", "Vit+20%")
        ),
        GFModel(
            name = "Shiva",
            skills = listOf("Str-J", "Elem-Def-J", "Doom")
        ),
        GFModel(
            name = "Siren",
            skills = listOf("Mag-J", "St-Atk-J", "St-Def-J", "Mag Bonus")
        ),
        GFModel(
            name = "Brothers",
            skills = listOf("HP-J", "Elem-Def-J", "HP Bonus")
        ),
        GFModel(
            name = "Diablos",
            skills = listOf("Mag-J", "Ability x3", "Mug", "Enc-Half")
        ),
        GFModel(
            name = "Carbuncle",
            skills = listOf("Vit-J", "St-Atk-J", "Ability x3", "Auto-Reflect")
        ),
        GFModel(
            name = "Leviathan",
            skills = listOf("Spr-J", "Elem-Def x2", "Spr+20%")
        ),
        GFModel(
            name = "Pandemona",
            skills = listOf("Str-J", "Spd-J", "Absorb", "Spd+20%")
        ),
        GFModel(
            name = "Cerberus",
            skills = listOf("Mag-J", "St-Def-J x4", "Ability x3", "Auto-Haste")
        ),
        GFModel(
            name = "Doomtrain",
            skills = listOf("Elem-Atk-J", "Darkside", "Absorb", "Auto-Shell")
        ),
        GFModel(
            name = "Alexander",
            skills = listOf("Spr-J", "Elem-Def-J x4", "Revive")
        ),
        GFModel(
            name = "Bahamuth",
            skills = listOf("Ability x4", "Mug", "Auto-Protect", "Rare Items")
        ),
        GFModel(
            name = "Cactuar",
            skills = listOf("Eva-J", "Luck-J", "Str-Bonus", "Initiative")
        ),
        GFModel(
            name = "Tonberry",
            skills = listOf("LV Down", "LV Up", "Initiative", "Familiar")
        ),
        GFModel(
            name = "Eden",
            skills = listOf("Spd-J", "Darkside", "Devour")
        )
    )
}
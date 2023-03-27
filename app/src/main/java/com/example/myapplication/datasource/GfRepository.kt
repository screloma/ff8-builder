package com.example.myapplication.datasource

import com.example.myapplication.model.GFAbility
import com.example.myapplication.model.GFAbilityType
import com.example.myapplication.model.GFModel


object GfRepository {

    private val GFAbilityList = mapOf(
        //////////////////////////JUNCTION abilities////////////////////////////
        //
        "hpJ" to GFAbility(name = "HP-J", type = GFAbilityType.ABILITY_JUNCTION),
        "strJ" to GFAbility(name = "Str-J", type = GFAbilityType.ABILITY_JUNCTION),
        "vitJ" to GFAbility(name = "Vit-J", type = GFAbilityType.ABILITY_JUNCTION),
        "magJ" to GFAbility(name = "Mag-J", type = GFAbilityType.ABILITY_JUNCTION),
        "sprJ" to GFAbility(name = "Spr-J", type = GFAbilityType.ABILITY_JUNCTION),
        "spdJ" to GFAbility(name = "Spd-J", type = GFAbilityType.ABILITY_JUNCTION),
        "evaJ" to GFAbility(name = "Eva-J", type = GFAbilityType.ABILITY_JUNCTION),
        "hitJ" to GFAbility(name = "Hit-J", type = GFAbilityType.ABILITY_JUNCTION),
        "luckJ" to GFAbility(name = "Luck-J", type = GFAbilityType.ABILITY_JUNCTION),
        //
        "elemAtkJ" to GFAbility(name = "Elem-Atk-J", type = GFAbilityType.ABILITY_JUNCTION),
        "elemDefJ" to GFAbility(name = "Elem-Def-J", type = GFAbilityType.ABILITY_JUNCTION),
        "elemDefJ2" to GFAbility(name = "Elem-Def x2", type = GFAbilityType.ABILITY_JUNCTION),
        "elemDefJ4" to GFAbility(name = "Elem-Def x4", type = GFAbilityType.ABILITY_JUNCTION),
        //
        "stAtkJ" to GFAbility(name = "St-Atk-J", type = GFAbilityType.ABILITY_JUNCTION),
        "stDefJ" to GFAbility(name = "St-Def-J", type = GFAbilityType.ABILITY_JUNCTION),
        "stDefJ2" to GFAbility(name = "St-Def x2", type = GFAbilityType.ABILITY_JUNCTION),
        "stDefJ4" to GFAbility(name = "St-Def x4", type = GFAbilityType.ABILITY_JUNCTION),
        //
        "abilityX3" to GFAbility(name = "Ability x3", type = GFAbilityType.ABILITY_JUNCTION),
        "abilityX4" to GFAbility(name = "Ability x4", type = GFAbilityType.ABILITY_JUNCTION),
        //
        ////////////////////////COMMAND(active) abilities////////////////////////
        //
        "magic" to GFAbility(name = "Magic", type = GFAbilityType.ABILITY_COMMAND),
        "draw" to GFAbility(name = "Draw", type = GFAbilityType.ABILITY_COMMAND),
        "summonGf" to GFAbility(name = "GF", type = GFAbilityType.ABILITY_COMMAND),
        "item" to GFAbility(name = "Item", type = GFAbilityType.ABILITY_COMMAND),
        //
        "card" to GFAbility(name = "Card", type = GFAbilityType.ABILITY_COMMAND),
        "doom" to GFAbility(name = "Doom", type = GFAbilityType.ABILITY_COMMAND),
        "madRush" to GFAbility(name = "Mad Rush", type = GFAbilityType.ABILITY_COMMAND),
        "treatment" to GFAbility(name = "Treatment", type = GFAbilityType.ABILITY_COMMAND),
        "defend" to GFAbility(name = "Defend", type = GFAbilityType.ABILITY_COMMAND),
        "darkside" to GFAbility(name = "Darkside", type = GFAbilityType.ABILITY_COMMAND),
        "recover" to GFAbility(name = "Recover", type = GFAbilityType.ABILITY_COMMAND),
        "absorb" to GFAbility(name = "Absorb", type = GFAbilityType.ABILITY_COMMAND),
        "revive" to GFAbility(name = "Revive", type = GFAbilityType.ABILITY_COMMAND),
        "kamikaze" to GFAbility(name = "Kamikaze", type = GFAbilityType.ABILITY_COMMAND),
        "devour" to GFAbility(name = "Devour", type = GFAbilityType.ABILITY_COMMAND),
        "miniMog" to GFAbility(name = "MiniMog", type = GFAbilityType.ABILITY_COMMAND),
        //
        "lvDown" to GFAbility(name = "LV Down", type = GFAbilityType.ABILITY_COMMAND),
        "lvUp" to GFAbility(name = "LV UP", type = GFAbilityType.ABILITY_COMMAND),
        //
        ///////////////////////CHARACTER(char-passive) abilities///////////////////////////
        //
        "hp20" to GFAbility(name = "HP+20%", type = GFAbilityType.ABILITY_CHARACTER),
        "hp40" to GFAbility(name = "HP+40%", type = GFAbilityType.ABILITY_CHARACTER),
        "hp80" to GFAbility(name = "HP+80%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "str20" to GFAbility(name = "Str+20%", type = GFAbilityType.ABILITY_CHARACTER),
        "str40" to GFAbility(name = "Str+40%", type = GFAbilityType.ABILITY_CHARACTER),
        "str60" to GFAbility(name = "Str+60%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "vit20" to GFAbility(name = "Vit+20%", type = GFAbilityType.ABILITY_CHARACTER),
        "vit40" to GFAbility(name = "Vit+40%", type = GFAbilityType.ABILITY_CHARACTER),
        "vit60" to GFAbility(name = "Vit+60%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "mag20" to GFAbility(name = "Mag+20%", type = GFAbilityType.ABILITY_CHARACTER),
        "mag40" to GFAbility(name = "Mag+40%", type = GFAbilityType.ABILITY_CHARACTER),
        "mag60" to GFAbility(name = "Mag+60%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "spr20" to GFAbility(name = "Spr+20%", type = GFAbilityType.ABILITY_CHARACTER),
        "spr40" to GFAbility(name = "Spr+40%", type = GFAbilityType.ABILITY_CHARACTER),
        "spr60" to GFAbility(name = "Spr+60%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "spd20" to GFAbility(name = "Spd+20%", type = GFAbilityType.ABILITY_CHARACTER),
        "spd40" to GFAbility(name = "Spd+40%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "eva30" to GFAbility(name = "Eva+30%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "luck50" to GFAbility(name = "Luck+50%", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "mug" to GFAbility(name = "Mug", type = GFAbilityType.ABILITY_CHARACTER),
        "medData" to GFAbility(name = "Med Data", type = GFAbilityType.ABILITY_CHARACTER),
        "counter" to GFAbility(name = "Counter", type = GFAbilityType.ABILITY_CHARACTER),
        "returnDamage" to GFAbility(name = "Return Damage", type = GFAbilityType.ABILITY_CHARACTER),
        "cover" to GFAbility(name = "Cover", type = GFAbilityType.ABILITY_CHARACTER),
        "ribbon" to GFAbility(name = "Ribbon", type = GFAbilityType.ABILITY_CHARACTER),
        "initiative" to GFAbility(name = "Initiative", type = GFAbilityType.ABILITY_CHARACTER),
        "moveHpUp" to GFAbility(name = "Move HP-Up", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "expendX2" to GFAbility(name = "Expend x2-1", type = GFAbilityType.ABILITY_CHARACTER),
        "expendX3" to GFAbility(name = "Expend x3-1", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "hpBonus" to GFAbility(name = "HP Bonus", type = GFAbilityType.ABILITY_CHARACTER),
        "strBonus" to GFAbility(name = "Str Bonus", type = GFAbilityType.ABILITY_CHARACTER),
        "vitBonus" to GFAbility(name = "Vit Bonus", type = GFAbilityType.ABILITY_CHARACTER),
        "magBonus" to GFAbility(name = "Mag Bonus", type = GFAbilityType.ABILITY_CHARACTER),
        "sprBonus" to GFAbility(name = "Spr Bonus", type = GFAbilityType.ABILITY_CHARACTER),
        //
        "autoReflect" to GFAbility(name = "Auto-Reflect", type = GFAbilityType.ABILITY_CHARACTER),
        "autoShell" to GFAbility(name = "Auto-Shell", type = GFAbilityType.ABILITY_CHARACTER),
        "autoProtect" to GFAbility(name = "Auto-Protect", type = GFAbilityType.ABILITY_CHARACTER),
        "autoHaste" to GFAbility(name = "Auto-Haste", type = GFAbilityType.ABILITY_CHARACTER),
        "autoPotion" to GFAbility(name = "Auto-Potion", type = GFAbilityType.ABILITY_CHARACTER),
        //
        ///////////////////////////PARTY(party-passive) abilities/////////////////////////
        //
        "alert" to GFAbility(name = "Alert", type = GFAbilityType.ABILITY_PARTY),
        "encHalf" to GFAbility(name = "Enc-Half", type = GFAbilityType.ABILITY_PARTY),
        "encNone" to GFAbility(name = "Enc-None", type = GFAbilityType.ABILITY_PARTY),
        "rareItem" to GFAbility(name = "Rare Item", type = GFAbilityType.ABILITY_PARTY),
        "moveFind" to GFAbility(name = "Move-Find", type = GFAbilityType.ABILITY_PARTY),
        //
        /////////////////////////////////GF(GF-passive) abilities//////////////////////////
        //
        "sumMag10" to GFAbility(name = "SumMag+10%", type = GFAbilityType.ABILITY_GF),
        "sumMag20" to GFAbility(name = "SumMag+20%", type = GFAbilityType.ABILITY_GF),
        "sumMag30" to GFAbility(name = "SumMag+30%", type = GFAbilityType.ABILITY_GF),
        "sumMag40" to GFAbility(name = "SumMag+40%", type = GFAbilityType.ABILITY_GF),
        //
        "gfHp10" to GFAbility(name = "GFHP+10%", type = GFAbilityType.ABILITY_GF),
        "gfHp20" to GFAbility(name = "GFHP+20%", type = GFAbilityType.ABILITY_GF),
        "gfHp30" to GFAbility(name = "GFHP+30%", type = GFAbilityType.ABILITY_GF),
        "gfHp40" to GFAbility(name = "GFHP+40%", type = GFAbilityType.ABILITY_GF),
        //
        "boost" to GFAbility(name = "Boost", type = GFAbilityType.ABILITY_GF),
        //
        ////////////////////////////////////MENU abilities//////////////////////////////
        //
        "haggle" to GFAbility(name = "Haggle", type = GFAbilityType.ABILITY_MENU),
        "sellHigh" to GFAbility(name = "Sell-High", type = GFAbilityType.ABILITY_MENU),
        "familliar" to GFAbility(name = "Familliar", type = GFAbilityType.ABILITY_MENU),
        "callShop" to GFAbility(name = "Call Shop", type = GFAbilityType.ABILITY_MENU),
        "junkShop" to GFAbility(name = "Junk Shop", type = GFAbilityType.ABILITY_MENU),
        //
        "thunderMagRf" to GFAbility(name = "T Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "iceMagRf" to GFAbility(name = "I Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "fireMagRf" to GFAbility(name = "F Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "lifeMagRf" to GFAbility(name = "L Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "timeMagRf" to GFAbility(name = "Time Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "stMagRf" to GFAbility(name = "ST Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "suptMagRf" to GFAbility(name = "Supt Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "forbidMagRf" to GFAbility(name = "Forbid Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "midMagRf" to GFAbility(name = "Mid Mag-RF", type = GFAbilityType.ABILITY_MENU),
        "highMagRf" to GFAbility(name = "High Mag-RF", type = GFAbilityType.ABILITY_MENU),
        //
        "recovMedRf" to GFAbility(name = "Recov Med-RF", type = GFAbilityType.ABILITY_MENU),
        "stMedRf" to GFAbility(name = "ST Med-RF", type = GFAbilityType.ABILITY_MENU),
        "forbidMedRf" to GFAbility(name = "Forbid Med-RF", type = GFAbilityType.ABILITY_MENU),
        "gfRecovMedRf" to GFAbility(name = "GFRecov Med-RF", type = GFAbilityType.ABILITY_MENU),
        "gfAblMedRf" to GFAbility(name = "GFAbl Med-RF", type = GFAbilityType.ABILITY_MENU),
        "medLvUp" to GFAbility(name = "Med LV Up", type = GFAbilityType.ABILITY_MENU),
        //
        "ammoRf" to GFAbility(name = "Ammo-RF", type = GFAbilityType.ABILITY_MENU),
        "toolRf" to GFAbility(name = "Tool-RF", type = GFAbilityType.ABILITY_MENU),
        "cardMod" to GFAbility(name = "Card Mod", type = GFAbilityType.ABILITY_MENU)
    )

     val gfList = listOf(
        GFModel(
            name = "Ifrit",
            abilities = listOf(
                GFAbilityList["hpJ"]!!,
                GFAbilityList["strJ"]!!,
                GFAbilityList["elemAtkJ"]!!,
                GFAbilityList["elemDefJ"]!!,
                GFAbilityList["elemDefJ2"]!!,
                GFAbilityList["magic"]!!,
                GFAbilityList["summonGf"]!!,
                GFAbilityList["draw"]!!,
                GFAbilityList["item"]!!,
                GFAbilityList["madRush"]!!,
                GFAbilityList["str20"]!!,
                GFAbilityList["str40"]!!,
                GFAbilityList["strBonus"]!!,
                GFAbilityList["sumMag10"]!!,
                GFAbilityList["sumMag20"]!!,
                GFAbilityList["sumMag30"]!!,
                GFAbilityList["gfHp10"]!!,
                GFAbilityList["gfHp20"]!!,
                GFAbilityList["gfHp30"]!!,
                GFAbilityList["boost"]!!,
                GFAbilityList["fireMagRf"]!!,
                GFAbilityList["ammoRf"]!!
            )
        ),
        GFModel(
            name = "Quezacotl",
            abilities = listOf(
                GFAbilityList["hpJ"]!!,
                GFAbilityList["vitJ"]!!,
                GFAbilityList["magJ"]!!,
                GFAbilityList["elemAtkJ"]!!,
                GFAbilityList["elemDefJ"]!!,
                GFAbilityList["elemDefJ2"]!!,
                GFAbilityList["magic"]!!,
                GFAbilityList["summonGf"]!!,
                GFAbilityList["draw"]!!,
                GFAbilityList["item"]!!,
                GFAbilityList["card"]!!,
                GFAbilityList["mag20"]!!,
                GFAbilityList["mag40"]!!,
                GFAbilityList["sumMag10"]!!,
                GFAbilityList["sumMag20"]!!,
                GFAbilityList["sumMag30"]!!,
                GFAbilityList["gfHp10"]!!,
                GFAbilityList["gfHp20"]!!,
                GFAbilityList["boost"]!!,
                GFAbilityList["thunderMagRf"]!!,
                GFAbilityList["midMagRf"]!!,
                GFAbilityList["cardMod"]!!
            )
        ),
        GFModel(
            name = "Shiva",
            abilities = listOf()
        ),
        GFModel(
            name = "Siren",
            abilities = listOf(
                GFAbilityList["magJ"]!!,
                GFAbilityList["stAtkJ"]!!,
                GFAbilityList["stDefJ"]!!,
                GFAbilityList["stDefJ2"]!!,
                GFAbilityList["magic"]!!,
                GFAbilityList["summonGf"]!!,
                GFAbilityList["draw"]!!,
                GFAbilityList["item"]!!,
                GFAbilityList["treatment"]!!,
                GFAbilityList["mag20"]!!,
                GFAbilityList["mag40"]!!,
                GFAbilityList["magBonus"]!!,
                GFAbilityList["moveFind"]!!,
                GFAbilityList["sumMag10"]!!,
                GFAbilityList["sumMag20"]!!,
                GFAbilityList["sumMag30"]!!,
                GFAbilityList["gfHp10"]!!,
                GFAbilityList["gfHp20"]!!,
                GFAbilityList["boost"]!!,
                GFAbilityList["lifeMagRf"]!!,
                GFAbilityList["stMedRf"]!!,
                GFAbilityList["toolRf"]!!,
            )
        ),
        GFModel(
            name = "Brothers",
            abilities = listOf()
        ),
        GFModel(
            name = "Diablos",
            abilities = listOf()
        ),
        GFModel(
            name = "Carbuncle",
            abilities = listOf()
        ),
        GFModel(
            name = "Leviathan",
            abilities = listOf()
        ),
        GFModel(
            name = "Pandemona",
            abilities = listOf()
        ),
        GFModel(
            name = "Cerberus",
            abilities = listOf()
        ),
        GFModel(
            name = "Doomtrain",
            abilities = listOf()
        ),
        GFModel(
            name = "Alexander",
            abilities = listOf()
        ),
        GFModel(
            name = "Bahamuth",
            abilities = listOf()
        ),
        GFModel(
            name = "Cactuar",
            abilities = listOf()
        ),
        GFModel(
            name = "Tonberry",
            abilities = listOf()
        ),
        GFModel(
            name = "Eden",
            abilities = listOf()
        )
    )


}
package com.example.lesson6.Services

import com.example.lesson6.Model.Category
import com.example.lesson6.Model.Product

object DataService {

    val categories = listOf(
        Category("WEAPONS", "weaponimage"),
        Category("FOODS", "foodimage"),
        Category("MISCS", "miscimage")
    )

    val foods = listOf(
        Product("Alcohol", "15 Gold", "Food-Alcohol"),
        Product("Egg", "3 Gold", "Food-Egg"),
        Product("Meat", "10 Gold", "Food-Meat"),
        Product("Moonshine", "20 Gold", "Food-Moonshine"),
        Product("Pineapple", "8 Gold", "Food-Pineapple"),
        Product("Soup", "5 Gold", "Food-Soup")
    )

    val weapons = listOf(
        Product("Bow", "45 Gold", "Weapon-Bow"),
        Product("Broadsword", "60 Gold", "Weapon-Broadsword"),
        Product("Staff", "40 Gold", "Weapon-Staff"),
        Product("Sword", "50 Gold", "Weapon-Sword"),
        Product("Waraxe", "55 Gold", "Weapon-Waraxe")
    )
    val misc = listOf(
        Product("Axe", "20 Gold", "Misc-Axe"),
        Product("Beads", "8 Gold", "Misc-Beads"),
        Product("Fryingpan", "10 Gold", "Misc-Fryingpan"),
        Product("Present", "15 Gold", "Misc-Present"),
    )
}
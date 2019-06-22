package com.example.lesson6.Services

import com.example.lesson6.Model.Category
import com.example.lesson6.Model.Product

object DataService {


    val categories = listOf(
        Category("WEAPONS", "weapons_bubble"),
        Category("FOODS", "food_bubble"),
        Category("MISCS", "misc_bubble")
    )

    val foods = listOf(
        Product("Alcohol", "15 Gold", "food-alcohol"),
        Product("Egg", "3 Gold", "food-egg"),
        Product("Meat", "10 Gold", "food-meat"),
        Product("Moonshine", "20 Gold", "food-moonshine"),
        Product("Pineapple", "8 Gold", "food-pineapple"),
        Product("Soup", "5 Gold", "food-soup")
    )

    val weapons = listOf(
        Product("Bow", "45 Gold", "weapon-bow"),
        Product("Broadsword", "60 Gold", "weapon-broadsword"),
        Product("Staff", "40 Gold", "weapon-staff"),
        Product("Sword", "50 Gold", "weapon-sword"),
        Product("Waraxe", "55 Gold", "weapon-waraxe")
    )
    val misc = listOf(
        Product("Axe", "20 Gold", "misc-axe"),
        Product("Beads", "8 Gold", "misc-beads"),
        Product("Fryingpan", "10 Gold", "misc-fryingpan"),
        Product("Present", "15 Gold", "misc-present")
    )
}
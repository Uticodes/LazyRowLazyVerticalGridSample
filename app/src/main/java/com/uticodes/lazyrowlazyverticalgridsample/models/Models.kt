package com.uticodes.lazyrowlazyverticalgridsample.models

import com.uticodes.lazyrowlazyverticalgridsample.R

data class YourFavouriteItem(var icon: Int, var name: String)

var dummyYourFavouriteItem = listOf(
    YourFavouriteItem(R.drawable.ic_quick_order_idea, "Pringles, Sprite \nCan, Fries, Chicken \nBurger &amp; Red Bull \nEnergy."),
    YourFavouriteItem(R.drawable.ic_quick_order_idea, "Pringles, Sprite \nCan, Fries, Chicken \nBurger &amp; Red Bull \nEnergy."),
    YourFavouriteItem(R.drawable.ic_quick_order_idea, "Pringles, Sprite \nCan, Fries, Chicken \nBurger &amp; Red Bull \nEnergy."),
    YourFavouriteItem(R.drawable.ic_quick_order_idea, "Pringles, Sprite \nCan, Fries, Chicken \nBurger &amp; Red Bull \nEnergy."),
    YourFavouriteItem(R.drawable.ic_quick_order_idea, "Pringles, Sprite \nCan, Fries, Chicken \nBurger &amp; Red Bull \nEnergy."),
    YourFavouriteItem(R.drawable.ic_quick_order_idea, "Pringles, Sprite \nCan, Fries, Chicken \nBurger &amp; Red Bull \nEnergy."),
)

data class SearchItem(var icon: Int, var title: Int, var kind: Int)

var dummyQuickOrder = listOf(
    SearchItem(R.drawable.ic_burger, R.string.burger, R.string.fast_foods),
    SearchItem(R.drawable.ic_kitkat, R.string.kitkat_choco, R.string.chocolates),
    SearchItem(R.drawable.ic_burger, R.string.burger, R.string.fast_foods),
    SearchItem(R.drawable.ic_kitkat, R.string.kitkat_choco, R.string.chocolates),
    SearchItem(R.drawable.ic_burger, R.string.burger, R.string.fast_foods),
    SearchItem(R.drawable.ic_kitkat, R.string.kitkat_choco, R.string.chocolates),
)
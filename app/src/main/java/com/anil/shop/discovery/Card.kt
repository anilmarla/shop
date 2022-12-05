package com.anil.shop.discovery

data class Card(
    val image: String,
    val name: String,
    val discountedPrice: String,
    val originalPrice: String,
    val discountedPercentage: String,
    val totalPercentage: String
) : BaseItem() {
}
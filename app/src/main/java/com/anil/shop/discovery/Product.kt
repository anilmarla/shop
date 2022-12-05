package com.anil.shop.discovery

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    var image: String,
    var name: String,
    var discountedPrice: String,
    var originalPrice: String,
    var discountedPercentage: String,
    var totalPercentage: String
) : BaseItem(), Parcelable
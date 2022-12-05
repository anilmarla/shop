package com.anil.shop.productdetails

import android.graphics.Paint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anil.shop.databinding.ActivityProductDetailsBinding
import com.anil.shop.discovery.Product
import com.bumptech.glide.Glide

class ProductDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // receiving intent data
        val product = intent?.getParcelableExtra<Product>("product")

        product?.let {
            binding.textImageName.text = it.name
            binding.textDiscountedPrice.text = it.discountedPrice
            binding.txtOriginalPrice.text = it.originalPrice
            binding.txtTotalPercentage.text = it.totalPercentage
            binding.txtDiscountedPercentage.text = it.discountedPercentage
            binding.txtOriginalPrice.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            Glide.with(binding.root.context).load(it.image).centerCrop().into(binding.productImage)

        }
    }
}
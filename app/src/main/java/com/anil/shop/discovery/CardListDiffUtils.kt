package com.anil.shop.discovery

import androidx.recyclerview.widget.DiffUtil

class CardListDiffUtils: DiffUtil.ItemCallback<BaseItem>() {
    override fun areItemsTheSame(oldItem: BaseItem, newItem: BaseItem): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: BaseItem, newItem: BaseItem): Boolean {
        return oldItem == newItem
    }

}

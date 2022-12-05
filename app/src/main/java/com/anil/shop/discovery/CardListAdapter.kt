package com.anil.shop.discovery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.shop.databinding.ListItemCardBinding
import com.anil.shop.databinding.ListItemHeadingBinding
import com.bumptech.glide.Glide

const val VIEW_HEADING = 1
const val VIEW_CARD = 2

class CardListAdapter(private val listener: CardListAdapterListener) :
    ListAdapter<BaseItem, RecyclerView.ViewHolder>(CardListDiffUtils()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_HEADING) return HeadingViewHolder(
            binding = ListItemHeadingBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        ) else {
            return CardViewHolder(
                binding = ListItemCardBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                ), listener = listener
            )
        }
    }

    class CardViewHolder(val binding: ListItemCardBinding, val listener: CardListAdapterListener) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Card) {
            binding.textImageName.text = item.name
            binding.textDiscountedPrice.text = item.discountedPrice
            binding.txtOriginalPrice.text = item.originalPrice
            binding.txtDiscountedPercentage.text = item.discountedPercentage
            binding.txtTotalPercentage.text = item.totalPercentage

            Glide.with(binding.root.context).load(item.image).centerCrop().into(binding.image)

            binding.root.setOnClickListener {
                listener.onCardClicked(card = item)
            }

        }

    }

    inner class HeadingViewHolder(val binding: ListItemHeadingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Heading) {
            binding.headerTitle.text = item.title
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HeadingViewHolder) {
            holder.bind(getItem(position) as Heading)
        } else if (holder is CardViewHolder) {
            holder.bind(getItem(position) as Card)
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)

        if (item is Heading) {
            return VIEW_HEADING
        } else {
            return VIEW_CARD
        }
    }


}
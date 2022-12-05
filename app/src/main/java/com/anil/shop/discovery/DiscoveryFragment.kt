package com.anil.shop.discovery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.anil.shop.R
import com.anil.shop.databinding.DiscoveryFragmentBinding


class DiscoveryFragment : Fragment(), CardListAdapterListener {
    private lateinit var binding: DiscoveryFragmentBinding
    private lateinit var adapter: CardListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DiscoveryFragmentBinding.inflate(inflater, container, false)

        renderList()

        return binding.root
    }

    private fun renderList() {
        adapter = CardListAdapter(this)

        binding.recyclerview.adapter = adapter

        binding.recyclerview.layoutManager = GridLayoutManager(context, 2)

        binding.recyclerview.addItemDecoration(
            MarginItemDecoration(resources.getDimensionPixelSize(R.dimen.grid_margin), 2)
        )

        val items = mutableListOf<BaseItem>()

        items.add(Heading("Most Popular"))

        items.add(
            Card(
                "https://media.istockphoto.com/id/1302767680/photo/natural-beauty-podium-backdrop-for-product-display-with-pink-rose-flower.jpg?s=612x612&w=0&k=20&c=KmiheD4Hk7t75hZgbtLh_1YA4d-Z5Z4S_CeXdaZr2Co=",
                "Natural Beauty Podium Back Drop",
                "19.99 \$US",
                "39.99 \$US",
                "48% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://img.freepik.com/premium-photo/podium-product-photo-background-with-roses-geometric-objects-flowers_406597-1746.jpg",
                "Roses Geometric Floral Display Images",
                "19.99\$US",
                "39.99\$US",
                "48% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://www.shutterstock.com/image-photo/empty-podium-boxes-presentation-cosmetic-260nw-1902127186.jpg",
                "Floral Display Images Roses Display Images",
            "19.99\$US",
                "39.99\$US",
                "50% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://media.istockphoto.com/id/1302767680/photo/natural-beauty-podium-backdrop-for-product-display-with-pink-rose-flower.jpg?s=612x612&w=0&k=20&c=KmiheD4Hk7t75hZgbtLh_1YA4d-Z5Z4S_CeXdaZr2Co=",
                "Pink Rose Flower Floral Display Images",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://c8.alamy.com/comp/M0BNAW/natural-cosmetic-product-bottle-on-pink-pale-background-with-plant-M0BNAW.jpg",
                "Natural Cosmetic Product Bottel",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://d1hjkbq40fs2x4.cloudfront.net/2020-05-11/files/eos-m10-sample-image_1563-2c.jpg",
                "Natural Cosmetic Product Bottel",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "85% OFF"
            )
        )

        items.add(
            Heading("Top Rated")
        )

        items.add(
            Card(
                "https://media.istockphoto.com/id/1302767680/photo/natural-beauty-podium-backdrop-for-product-display-with-pink-rose-flower.jpg?s=612x612&w=0&k=20&c=KmiheD4Hk7t75hZgbtLh_1YA4d-Z5Z4S_CeXdaZr2Co=",
                "Natural Beauty Podium Back Drop",
                "19.99 \$US",
                "39.99 \$US",
                "48% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://img.freepik.com/premium-photo/podium-product-photo-background-with-roses-geometric-objects-flowers_406597-1746.jpg",
                "Roses Geometric Objects Floral Display Images",
                "19.99\$US",
                "39.99\$US",
                "48% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://www.shutterstock.com/image-photo/empty-podium-boxes-presentation-cosmetic-260nw-1902127186.jpg",
                "Floral Display Images Floral Display Images",
                "19.99\$US",
                "39.99\$US",
                "50% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://media.istockphoto.com/id/1302767680/photo/natural-beauty-podium-backdrop-for-product-display-with-pink-rose-flower.jpg?s=612x612&w=0&k=20&c=KmiheD4Hk7t75hZgbtLh_1YA4d-Z5Z4S_CeXdaZr2Co=",
                "Pink Rose Flower Floral Display Images",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "85% OFF"
            )
        )
        items.add(
            Card(
                "https://c8.alamy.com/comp/M0BNAW/natural-cosmetic-product-bottle-on-pink-pale-background-with-plant-M0BNAW.jpg",
                "Natural Cosmetic Product Bottel",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "35% OFF"
            )
        )
        items.add(
            Card(
                "https://d1hjkbq40fs2x4.cloudfront.net/2020-05-11/files/eos-m10-sample-image_1563-2c.jpg",
                "Natural Cosmetic Product Bottel",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "65% OFF"
            )
        )
        items.add(
            Card("https://i.pinimg.com/736x/bb/b1/99/bbb19923b8b2f83184bb695706597b8e.jpg",
            "Paper FLowers and Leaves Frame",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "65% OFF"
            )
        )
        items.add(
            Card(
                "https://sc04.alicdn.com/kf/HTB1dTwuXyDxK1RjSsph762HrpXay.png",
                "Artificial RoseBud Small Rose Flower",
                "19.99\$US",
                "37.88\$US",
                "40% OFF",
                "80% OFF"
            )
        )

        adapter.submitList(items)


    }


    companion object {

        @JvmStatic
        fun newInstance() =
            DiscoveryFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCardClicked(card: BaseItem) {
        Toast.makeText(context, "you are Clicked the card  ", Toast.LENGTH_SHORT).show()
    }
}
package com.myanmarit.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmarit.recyclerview.R
import com.myanmarit.recyclerview.model.OnlineShop
import kotlinx.android.synthetic.main.item_flower.view.*

class OnlineShopAdapter(var flowerList: ArrayList<OnlineShop>):
    RecyclerView.Adapter<OnlineShopAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(flower: OnlineShop) {
            itemView.txtName.text = flower.name
            itemView.imgFlower.setImageResource(flower.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.online_shop_user_layout,parent,false)
        return FlowerViewHolder(view)
    }

    override fun getItemCount(): Int = flowerList.size

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerList[position])
    }

}
package com.myanmarit.recyclerview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.myanmarit.recyclerview.adapter.OnlineShopAdapter
import com.myanmarit.recyclerview.model.OnlineShop
import kotlinx.android.synthetic.main.online_shop_recycler_view.*

class OnlineShopMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.online_shop_recycler_view)
        var flowerList = ArrayList<OnlineShop>()
        flowerList.add(OnlineShop(R.drawable.ic_wish_list,"My Wishlist"))
        flowerList.add(OnlineShop(R.drawable.ic_follow_seller,"My Followed Sellers"))
        flowerList.add(OnlineShop(R.drawable.ic_purchase_item,"My Purchased item"))
        flowerList.add(OnlineShop(R.drawable.ic_coupon,"My Coupons"))
        flowerList.add(OnlineShop(R.drawable.ic_card_wallet,"My Cards Wallet"))
        flowerList.add(OnlineShop(R.drawable.ic_coupon,"My Exp Points"))
        flowerList.add(OnlineShop(R.drawable.ic_wish_list,"My Given Feedbacks"))
        flowerList.add(OnlineShop(R.drawable.ic_search_history,"Searched History"))
        flowerList.add(OnlineShop(R.drawable.ic_event_calender,"Events & Calander"))
        var flowerAdapter = OnlineShopAdapter(flowerList)

        online_shop_Recycle.layoutManager = GridLayoutManager(this,3)
        online_shop_Recycle.adapter = flowerAdapter

    }
}

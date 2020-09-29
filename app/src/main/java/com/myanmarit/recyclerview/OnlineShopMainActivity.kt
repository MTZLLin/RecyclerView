package com.myanmarit.recyclerview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmarit.recyclerview.adapter.OnlineShopAdapter
import com.myanmarit.recyclerview.model.OnlineShop
import kotlinx.android.synthetic.main.online_shop_recycler_view.*
import kotlinx.android.synthetic.main.recycler_view.*

class OnlineShopMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.online_shop_recycler_view)
        var flowerList = ArrayList<OnlineShop>()
        flowerList.add(OnlineShop("My Wishlist",R.drawable.ic_wish_list))
        flowerList.add(OnlineShop("My Followed Sellers",R.drawable.ic_follow_seller))
        flowerList.add(OnlineShop("My Purchased item",R.drawable.ic_purchase_item))
        flowerList.add(OnlineShop("My Coupons",R.drawable.ic_coupon))
        flowerList.add(OnlineShop("My Cards Wallet",R.drawable.ic_card_wallet))
        flowerList.add(OnlineShop("My Exp Points",R.drawable.ic_coupon))
        flowerList.add(OnlineShop("My Given Feedbacks",R.drawable.ic_wish_list))
        flowerList.add(OnlineShop("Searched History",R.drawable.ic_search_history))
        flowerList.add(OnlineShop("Events & Calander",R.drawable.ic_event_calender))
        var flowerAdapter = OnlineShopAdapter(flowerList)

        online_shop_Recycle.layoutManager = GridLayoutManager(this,3)
        online_shop_Recycle.adapter = flowerAdapter

    }
}

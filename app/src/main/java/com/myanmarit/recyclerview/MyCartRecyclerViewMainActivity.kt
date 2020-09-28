package com.myanmarit.recyclerview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmarit.recyclerview.adapter.FlowerAdapter
import com.myanmarit.recyclerview.adapter.MyCartAdapter
import com.myanmarit.recyclerview.model.Flower
import com.myanmarit.recyclerview.R
import kotlinx.android.synthetic.main.my_cart_recycler_view.*
import kotlinx.android.synthetic.main.recycler_view.*

class MyCartRecyclerViewMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_cart_recycler_view)

        var flowerList = ArrayList<Flower>()
        flowerList.add(Flower("Fine Grain Sugar",20.00, R.drawable.sugar))
        flowerList.add(Flower("Peanuts",20.000, R.drawable.peanut))
        flowerList.add(Flower("Dawat Rice",80.00, R.drawable.dawat_rice))

        var flowerAdapter = MyCartAdapter(flowerList)
        mycartRecycler.layoutManager = LinearLayoutManager(this)

        //flowerRecycler.layoutManager = LinearLayoutManager(
        //     this,LinearLayoutManager.HORIZONTAL,true
        // )
        //flowerRecycler.layoutManager = GridLayoutManager(this,2)
        mycartRecycler.adapter = flowerAdapter
    }
}
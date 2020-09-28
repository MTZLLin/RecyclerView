package com.myanmarit.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmarit.recyclerview.adapter.FlowerAdapter
import com.myanmarit.recyclerview.model.Flower
import com.myanmarit.recyclerview.R
import kotlinx.android.synthetic.main.recycler_view.*

class RecyclerViewMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view)

        var flowerList = ArrayList<Flower>()
        flowerList.add(Flower("Daisy",32.0,R.drawable.daisy))
        flowerList.add(Flower("Rose",32.0,R.drawable.rose))

        var flowerAdapter = FlowerAdapter(flowerList)
        flowerRecycler.layoutManager = LinearLayoutManager(this)

        //flowerRecycler.layoutManager = LinearLayoutManager(
       //     this,LinearLayoutManager.HORIZONTAL,true
       // )
        //flowerRecycler.layoutManager = GridLayoutManager(this,2)
        flowerRecycler.adapter = flowerAdapter
    }
}
package com.example.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.placesofinterest.PlaceAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val places = arrayListOf<Place>()
    private val placeAdapter = PlaceAdapter(places)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        full_list.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        full_list.adapter = placeAdapter

        for(i in Place.PLACE_NAMES.indices){
            places.add(Place(Place.PLACE_NAMES[i], Place.PLACE_RES_DRAWABLE_IDS[i]))
        }
        placeAdapter.notifyDataSetChanged()
    }
}

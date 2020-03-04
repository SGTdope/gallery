package com.example.placesofinterest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.Place
import com.example.gallery.R
import kotlinx.android.synthetic.main.item_layout.view.*

public class  PlaceAdapter(private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place : Place) {
            itemView.placePic.setImageResource(place.imageResId)
            itemView.placeName.text = place.placeName
        }
    }
}
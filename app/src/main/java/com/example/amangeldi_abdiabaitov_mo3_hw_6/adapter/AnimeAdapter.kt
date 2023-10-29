package com.example.amangeldi_abdiabaitov_mo3_hw_6.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.amangeldi_abdiabaitov_mo3_hw_6.R
import com.example.amangeldi_abdiabaitov_mo3_hw_6.model.AnimeModel
import kotlinx.android.synthetic.main.item_anime_layout.view.img_poster
import kotlinx.android.synthetic.main.item_anime_layout.view.tv_description
import kotlinx.android.synthetic.main.item_anime_layout.view.tv_title

class AnimeAdapter : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    private var animeList = emptyList<AnimeModel>()

    class AnimeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_anime_layout, parent, false)
        return AnimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.itemView.tv_title.text = animeList[position].title
        holder.itemView.tv_description.text = animeList[position].description
        val anime = animeList[position]
        Glide.with(holder.itemView.img_poster).load(anime.image).into(holder.itemView.img_poster)
    }

    override fun getItemCount(): Int {
        return animeList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<AnimeModel>) {
        animeList = list
        notifyDataSetChanged()
    }
}
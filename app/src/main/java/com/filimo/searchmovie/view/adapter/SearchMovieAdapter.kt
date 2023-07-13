package com.filimo.searchmovie.view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.filimo.data.dataModel.SearchMovie
import com.filimo.searchmovie.R
import com.filimo.searchmovie.databinding.ItemRowSearchMovieAdapterBinding


class SearchMovieAdapter(private val context: Context) : RecyclerView.Adapter<SearchMovieAdapter.CustomViewHolder>() {

    var mContext: Context = context
    var itemResults : ArrayList<SearchMovie> = arrayListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(itemResults: ArrayList<SearchMovie>) {
        this.itemResults = itemResults
        notifyDataSetChanged()
    }
   @SuppressLint("NotifyDataSetChanged")
    fun clearData() {
        this.itemResults.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflatedView =
            ItemRowSearchMovieAdapterBinding.inflate(LayoutInflater.from(mContext), parent, false)

        return CustomViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = itemResults.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val itemData = itemResults[position]
        holder.itemBinding.item = itemData
        holder.bindItems(itemData, mContext)
    }


    class CustomViewHolder(var itemBinding: ItemRowSearchMovieAdapterBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bindItems(itemModel: SearchMovie, context: Context) {
            itemModel.attributes?.pic?.movieImgM?.let {
                Glide.with(context).load(it)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_filimo))
                    .into(itemBinding.ivService)
            }

        }

    }
}
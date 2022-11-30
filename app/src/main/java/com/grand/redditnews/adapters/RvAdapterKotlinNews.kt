package com.grand.redditnews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.grand.redditnews.R
import com.grand.redditnews.data.models.received.KotlinNewsModel
import com.grand.redditnews.databinding.RvItemKotlinNewsBinding

class RvAdapterKotlinNews (
    private val items: List<KotlinNewsModel.Data.Children?>, private val listenerId: (id: String) -> Unit,
) : RecyclerView.Adapter<RvAdapterKotlinNews.ViewHolder>(){


     class ViewHolder(binding: RvItemKotlinNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val imageView = binding.imageView
        val textView = binding.textView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvItemKotlinNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items[position]

        val context = holder.itemView.context


        holder.textView.text = item?.data?.title

        if (!item?.data?.secureMedia?.oembed?.thumbnailUrl.isNullOrEmpty()){
            holder.imageView.visibility = View.VISIBLE
            Glide.with(context).load(item?.data?.secureMedia?.oembed?.thumbnailUrl).error(R.drawable.no_image).into(holder.imageView)
        }else{
            holder.imageView.visibility = View.GONE
        }


        holder.itemView.setOnClickListener {
            listenerId(item?.data?.title.toString())
        }

    }


    override fun getItemCount(): Int {
        return items.size
    }

}
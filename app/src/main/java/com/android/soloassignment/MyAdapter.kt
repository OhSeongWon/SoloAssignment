package com.android.soloassignment

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dataList: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {
    interface ItemClick{
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        Log.d("recyclerview", "onCreateViewHolder()")
        return Holder(itemView)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Log.d("recyclerview", "position = $position")
        holder.itemView.setOnClickListener{
            itemClick?.onClick(it, position)
        }
        holder.picture.setImageResource(dataList[position].picture)
        holder.title.text = dataList[position].title
        holder.address.text = dataList[position].address
        holder.price.text = dataList[position].price
        holder.chat.text = dataList[position].chat
        holder.like.text = dataList[position].like
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class Holder(view : View) : RecyclerView.ViewHolder(view){
        val picture : ImageView = view.findViewById(R.id.iv_1)
        val title : TextView = view.findViewById(R.id.tv_title)
        val address : TextView = view.findViewById(R.id.tv_address)
        val price : TextView = view.findViewById(R.id.tv_price)
        val chat : TextView = view.findViewById(R.id.tv_chat_num)
        val like : TextView = view.findViewById(R.id.tv_heart_num)
    }
}


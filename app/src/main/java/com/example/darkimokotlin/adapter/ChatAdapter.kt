package com.example.darkimokotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.darkimokotlin.R
import com.example.darkimokotlin.model.Chat
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var item: ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var chat = item[position]

        if (holder is ChatViewHolder) {
            var iv_profile= holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_count = holder.tv_count

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text=chat.fullname
            tv_count.text=chat.count.toString()
            if(chat.count>0){
                tv_count.visibility=View.VISIBLE
            }else{tv_count.visibility=View.GONE}
            if(chat.count>9){
                tv_count.text="+9"
            }
            else{tv_count.text=chat.count.toString()}
        }
    }

    class ChatViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_count: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_count = view.findViewById(R.id.tv_count)
        }
    }
}
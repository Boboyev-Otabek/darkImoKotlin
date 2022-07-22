package com.example.darkimokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.darkimokotlin.adapter.ChatAdapter
import com.example.darkimokotlin.model.Chat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(recyclerView, getAllChats())
    }

    fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Chat>) {
        var adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats= ArrayList<Chat>()
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",1))
        chats.add(Chat(R.drawable.imo_2,"Boboyev Otabek",0))
        chats.add(Chat(R.drawable.imo_3,"Boboyev Otabek",3))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",1))
        chats.add(Chat(R.drawable.imo_3,"Boboyev Otabek",0))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",10))
        chats.add(Chat(R.drawable.imo_2,"Boboyev Otabek",1))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",7))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",1))
        chats.add(Chat(R.drawable.imo_2,"Boboyev Otabek",0))
        chats.add(Chat(R.drawable.imo_3,"Boboyev Otabek",3))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",1))
        chats.add(Chat(R.drawable.imo_3,"Boboyev Otabek",0))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",10))
        chats.add(Chat(R.drawable.imo_2,"Boboyev Otabek",1))
        chats.add(Chat(R.drawable.imo_1,"Boboyev Otabek",7))

        return chats
    }}
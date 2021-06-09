package com.example.kotlin_06_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val chatAdapter = ChatAdapter()
    private val chats = ArrayList<Chat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chats.add(Chat("리본", "안녕"))
        chats.add(Chat("리본", "반가워"))
        chats.add(Chat("다리우스", "ㅎㅇㅎㅇ"))
        chats.add(Chat("다리우스", "반가워2"))

        chatAdapter.addChats(chats)
        chatAdapter.addChat(Chat("레넥톤", "내가 살아있는한 모두 죽을 것 이다."))

        rv_main_chat.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = chatAdapter
        }
    }
}
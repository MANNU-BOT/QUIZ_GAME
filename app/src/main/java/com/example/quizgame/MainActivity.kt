package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.introduction.*
import kotlinx.android.synthetic.main.startmenu.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introduction)
        val button :Button=introbutton

        button.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)


        }



    }




}

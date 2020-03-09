package com.example.quizgame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.feedback.*
import kotlinx.android.synthetic.main.game.*
import kotlinx.android.synthetic.main.introduction.*
import kotlinx.android.synthetic.main.retry.*
import kotlinx.android.synthetic.main.startmenu.*
import kotlinx.android.synthetic.main.web_view.*
import kotlinx.android.synthetic.main.you_won.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startmenu)
        rollStartMenu()
    }

    private fun rollStartMenu()
    {
        javaid.setOnClickListener { rollJavaQuiz(it) }

        cssid.setOnClickListener { rollCssQuiz(it) }

        jsid.setOnClickListener { rollJsQuiz(it) }

        pythonid.setOnClickListener { rollPythonQuiz(it) }

        webid.setOnClickListener { rollWebBrowser(it) }

        helpid.setOnClickListener { rollHelpMenu(it) }
    }

    private fun rollHelpMenu(v:View) {
        setContentView(R.layout.feedback)
        FeedbackButtionsId.visibility=View.VISIBLE
      //Instructions
        insID.setOnClickListener{
            FeedbackButtionsId.visibility=View.GONE
            InstructionLayoutId.visibility=View.VISIBLE

              BackButtonID2.setOnClickListener {
                  startActivity(intent) }
               }
       //Feedback
        feedID.setOnClickListener{
            FeedbackButtionsId.visibility=View.GONE
            FeedbackId.visibility=View.VISIBLE
            finishid.setOnClickListener {
                Toast.makeText(this,"Feedback Sent",Toast.LENGTH_SHORT).show()
                startActivity(intent) }
              }
         //Report bugs
        reportID.setOnClickListener{
            FeedbackButtionsId.visibility=View.GONE
            BugsLayoutId.visibility= View.VISIBLE

            sendbuttonid.setOnClickListener {
                Toast.makeText(this,"Report Sent",Toast.LENGTH_SHORT).show()
                  startActivity(intent) }
               }
        //Back button
        BackButtonID.setOnClickListener{
            startActivity(intent)
        }
    }

    private fun rollWebBrowser(v: View) {
        setContentView(R.layout.game)
    }

    private fun rollJsQuiz(v: View) {
        setContentView(R.layout.game)
        println("GAY")
    }

    private fun rollPythonQuiz(v: View) {
        setContentView(R.layout.game)
    }

    private fun rollCssQuiz(v: View) {
        setContentView(R.layout.game)
    }

    private fun rollJavaQuiz(v:View) {
        setContentView(R.layout.game)

        ButtonID1.setOnClickListener{
            ButtonID1.visibility=View.GONE
            ButtonID2.visibility=View.VISIBLE
            TextID.text=getString(R.string.jq2)
            ImageID.setImageResource(R.drawable.two)
        }

        ButtonID2.setOnClickListener{
            ButtonID2.visibility=View.GONE
            ButtonID3.visibility=View.VISIBLE
            TextID.text=getString(R.string.jq3)
            ImageID.setImageResource(R.drawable.three)
        }

        ButtonID3.setOnClickListener{
            ButtonID3.visibility=View.GONE
            ButtonID4.visibility=View.VISIBLE
            TextID.text=getString(R.string.jq4)
            ImageID.setImageResource(R.drawable.four)
        }

        ButtonID4.setOnClickListener{
            ButtonID4.visibility=View.GONE
            ButtonID5.visibility=View.VISIBLE
            TextID.text=getString(R.string.jq5)
            ImageID.setImageResource(R.drawable.five)
        }

        ButtonID5.setOnClickListener{
            setContentView(R.layout.you_won)
            PABID.setOnClickListener {startActivity(intent)}
            LGID.setOnClickListener { finishAffinity()}
        }
    }
    }




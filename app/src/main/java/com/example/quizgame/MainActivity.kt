package com.example.quizgame

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
            rollstartmenu(it)

        }



    }

    private fun rollstartmenu(v:View) {
        ST2.text=editnamebutton.text
        setContentView(R.layout.startmenu)


        when(v)
        {
            javaid->rollJavaQuiz()
            cssid->rollCssQuiz()
            pythonid->rollPythonQuiz()
            jsid->rollJsQuiz()
            webid->rollWebBrowser()
            helpid->rollHelpMenu()
            else->rollstartmenu(v)

        }

    }

    private fun rollHelpMenu() {
        setContentView(R.layout.game)
    }

    private fun rollWebBrowser() {
        setContentView(R.layout.game)
    }

    private fun rollJsQuiz() {
        setContentView(R.layout.game)
    }

    private fun rollPythonQuiz() {
        setContentView(R.layout.game)
    }

    private fun rollCssQuiz() {
        setContentView(R.layout.game)

    }

    private fun rollJavaQuiz() {

        setContentView(R.layout.game)


    }
}

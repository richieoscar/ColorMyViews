package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    lateinit var boxOne:TextView
    lateinit var boxTwo:TextView
    lateinit var boxThree:TextView
    lateinit var boxFour:TextView
    lateinit var boxFive: TextView
    lateinit var cL:ConstraintLayout
    lateinit var redBtn: Button
    lateinit var yellowBtn: Button
    lateinit var greenBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        setListeners()


    }

    private fun bindViews() {
        boxOne = findViewById(R.id.box_one)
        boxTwo = findViewById(R.id.text_box2)
        boxThree = findViewById(R.id.text_box3)
        boxFour = findViewById(R.id.text_box4)
        boxFive = findViewById(R.id.text_box5)
        cL = findViewById(R.id.constraint)
        redBtn = findViewById(R.id.button_red)
        yellowBtn = findViewById(R.id.button_yellow)
        greenBtn = findViewById(R.id.button_green)

    }

    private fun setListeners() {
        val clickable:List<View> = listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, cL, redBtn, yellowBtn, greenBtn)

        for (item in clickable){
            item.setOnClickListener{colorView(it)}
        }
    }

    private fun colorView(view: View?) {
        when(view?.id){
            R.id.box_one -> view.setBackgroundColor(Color.BLUE)
            R.id.text_box2 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.text_box3 -> view.setBackgroundColor(Color.RED)
            R.id.text_box4 -> view.setBackgroundColor(Color.GRAY)
            R.id.text_box5 -> view.setBackgroundColor(Color.YELLOW)
            R.id.button_red -> boxTwo.setBackgroundColor(Color.RED)
            R.id.button_green ->boxThree.setBackgroundColor(Color.GREEN)
            R.id.button_yellow -> boxFour.setBackgroundColor(Color.YELLOW)
            else -> view?.setBackgroundColor(Color.GRAY)

        }

    }
}
package com.example.colormyviews1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn10 = findViewById<Button>(R.id.btn10)

        val clickableViews : List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout,
                                                boxSixText, boxSevenText, boxEightText, boxNineText, boxTenText,
                                                btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10)

        for(item in clickableViews)
            item.setOnClickListener{
                makeColored(it)
            }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_six_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_seven_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_eight_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_nine_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_ten_text -> view.setBackgroundColor(Color.DKGRAY)

            // Boxes using custom colors for background
            R.id.btn1 -> box_one_text.setBackgroundResource(R.color.black)
            R.id.btn2 -> box_two_text.setBackgroundResource(R.color.purple_200)
            R.id.btn3 -> box_three_text.setBackgroundResource(R.color.red)
            R.id.btn4 -> box_four_text.setBackgroundResource(R.color.yellow)
            R.id.btn5 -> box_five_text.setBackgroundResource(R.color.green)
            R.id.btn6 -> box_six_text.setBackgroundResource(R.color.purple_200)
            R.id.btn7 -> box_seven_text.setBackgroundResource(R.color.red)
            R.id.btn8 -> box_eight_text.setBackgroundResource(R.color.yellow)
            R.id.btn9 -> box_nine_text.setBackgroundResource(R.color.green)
            R.id.btn10 -> box_ten_text.setBackgroundResource(R.color.black)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}
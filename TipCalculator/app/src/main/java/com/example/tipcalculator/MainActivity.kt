package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoText.visibility= View.INVISIBLE


        //TIp percentage

        calc.setOnClickListener {
            //think abut flowcharts, pseudo code , algorithms
            //Bill
            val bill= billbro.text.toString().toDouble()
            val tipPercent= tipPercentage.text.toString().toDouble() / 100
            //tip
            val tip=bill * tipPercent
            //TOtal
            val total = tip + bill

            //make info text visible when button clicked

            infoText.visibility= View.VISIBLE
            infoText.text="Tip: ${doubleToDollar(tip)} Total: ${doubleToDollar(total)}"
        }

    }
    //function for two decimal points, Converting to dollar
    fun doubleToDollar(number:Double): String{
        return "$"+ String.format("%.2f",number)
    }
}

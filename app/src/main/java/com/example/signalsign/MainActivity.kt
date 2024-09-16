 package com.example.signalsign

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnApply = findViewById<Button>(R.id.btnApply)
        var description = findViewById<TextView>(R.id.description)

        val ratioRed = findViewById<RadioButton>(R.id.ratioRed)
        val ratioYellow = findViewById<RadioButton>(R.id.ratioYellow)
        val ratioGreen = findViewById<RadioButton>(R.id.ratioGreen)


        //Update Radio Button Value
        ratioRed.text = TrafficLight.RED.sign
        ratioYellow.text = TrafficLight.YELLOW.sign
        ratioGreen.text = TrafficLight.GREEN.sign

        btnApply.setOnClickListener {
            if (ratioRed.isChecked) {
                description.text = TrafficLight.RED.description
            } else if (ratioYellow.isChecked) {
                description.text = TrafficLight.YELLOW.description
            } else if(ratioGreen.isChecked){
                description.text = TrafficLight.GREEN.description
            } else {
                description.text = "Please click on Ratio Button"
            }
        }
    }

}


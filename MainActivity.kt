package com.aubijuan.dinnerpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Pizza", "Indian","Burgers","Nandos","McD's","Korean Bbq" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebutton.setOnClickListener{

            val random = Random()
            val randomFood = random.nextInt (foodList.count())
            Selectedfoodtext.text = foodList [randomFood]
        }

        addfoodbtn.setOnClickListener {
            val newFood = addfoodtext.text.toString()
            foodList.add(newFood)
            addfoodtext.text.clear()
            println(foodList)

        }

    }
}

package com.polito.chiarapoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    var poop_counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val poopCounterTV = findViewById<TextView>(R.id.poop_counter)
        val poopAdder = findViewById<FloatingActionButton>(R.id.poop_adder)

        poopAdder.setOnClickListener {
            poop_counter++
            poopCounterTV.text = "Oggi hai fatto $poop_counter poop!"
        }
    }
}
package com.example.m4l6t1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    private var playerNames = arrayOf("Cristiano Ronaldo", "Joao Felix", "Bernado Silva", "Andre    Silve", "Bruno Fernandez", "William Carvalho", "Nelson Semedo", "Pepe", "Rui Patricio")
            private var playerImages = intArrayOf(R.drawable.img, R.drawable.img, R.drawable.img,
        R.drawable.img,
        R.drawable.img, R.drawable.img, R.drawable.img, R.drawable.img, R.drawable.img)
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        gridView = findViewById(R.id.gridView)
        val mainAdapter = GridViewAdapter(this@MainActivity, playerNames, playerImages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = OnItemClickListener { _, _, position, _ ->
            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
                Toast.LENGTH_SHORT).show()
        }
    }
}
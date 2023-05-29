package com.example.familyplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Vignal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vignal)
        var  but: Button = findViewById(R.id.button)
        but.setOnClickListener {
            val intent = Intent(this, Meathods::class.java)
            startActivity(intent)
        }
    }
}
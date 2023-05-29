package com.example.familyplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var but: Button = findViewById(R.id.button_home)
        but.setOnClickListener {
            val intent = Intent(this, Birth_Control::class.java)
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.birth_control -> {
                val intent = Intent(this, Birth_Control::class.java)
                startActivity(intent)
                return true
            }

            R.id.general_info -> {
                val intent = Intent(this, contraceptives::class.java)
                startActivity(intent)
                return true
            }

            R.id.method_works -> {
                val intent = Intent(this, Meathods::class.java)
                startActivity(intent)
                return true
            }

            R.id.method_chooser -> {
                val intent = Intent(this, Qus_Choose::class.java)
                startActivity(intent)
                return true
            }

            R.id.faq -> {
                val intent = Intent(this, FQA::class.java)
                startActivity(intent)
                return true
            }

            R.id.question -> {
                val intent = Intent(this,FQA::class.java)
                startActivity(intent)
                return true
            }

            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}
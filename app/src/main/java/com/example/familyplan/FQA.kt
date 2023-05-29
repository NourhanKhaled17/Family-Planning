package com.example.familyplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FQA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fqa)
        var  but: ImageButton = findViewById(R.id.fqa)
        but.setOnClickListener {
            val intent = Intent(this, Birth_Control::class.java)
            startActivity(intent)
        }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        WindowCompat.setDecorFitsSystemWindows(window, false)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        var  res: RecyclerView = findViewById(R.id.recyclerView)
        res.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        res.adapter = QuestionsAdapter(questionsList)
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
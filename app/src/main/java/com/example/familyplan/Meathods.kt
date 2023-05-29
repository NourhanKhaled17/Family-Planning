package com.example.familyplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class Meathods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meathods)

        var  but: Button = findViewById(R.id.button)
        but.setOnClickListener {
            val intent = Intent(this, FQA::class.java)
            startActivity(intent)
        }
        var  tx_vig: TextView = findViewById(R.id.vignal)
        tx_vig.setOnClickListener {
            val intent = Intent(this, Vignal::class.java)
            startActivity(intent)
        }

        var  pi: TextView = findViewById(R.id.pil)
        pi.setOnClickListener {
            val intent = Intent(this, Pill::class.java)
            startActivity(intent)
        }

        var j:TextView = findViewById(R.id.inject)
        j.setOnClickListener {
            val intent = Intent (this, Injection::class.java)
            startActivity(intent)
        }


        var im:TextView = findViewById(R.id.implan)
        im.setOnClickListener {
            val intent = Intent (this, Implant::class.java)
            startActivity(intent)
        }


        var p:TextView = findViewById(R.id.pach)
        p.setOnClickListener {
            val intent = Intent (this, Patch::class.java)
            startActivity(intent)
        }

        var h:TextView = findViewById(R.id.hormonal)
        h.setOnClickListener {
            val intent = Intent (this, Hormonal::class.java)
            startActivity(intent)
        }

        var v:TextView = findViewById(R.id.diaphram)
        v.setOnClickListener {
            val intent = Intent (this, Vaginal::class.java)
            startActivity(intent)
        }


        var m:TextView = findViewById(R.id.male)
        m.setOnClickListener {
            val intent = Intent (this, Male_condom::class.java)
            startActivity(intent)
        }


        var c:TextView = findViewById(R.id.co)
        c.setOnClickListener {
            val intent = Intent (this, copper::class.java)
            startActivity(intent)
        }

        var f:TextView = findViewById(R.id.female)
        f.setOnClickListener {
            val intent = Intent (this, surgical_family::class.java)
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
package com.compileit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.compileit.androidmaster.R
import com.compileit.firstapp.FirstAppActivity
import com.compileit.imccalculator.ImcCalculatorActivity
import com.compileit.settings.SettingsActivity
import com.compileit.superheroapp.SuperHeroListActivity
import com.compileit.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODOApp = findViewById<Button>(R.id.btnTODO)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludarApp.setOnClickListener {
            navigateSaludarApp()
        }

        btnIMCApp.setOnClickListener {
            navigateIMCApp()
        }

        btnTODOApp.setOnClickListener {
            navigateTODOApp()
        }

        btnSuperhero.setOnClickListener {
            navigateSuperhero()
        }

        btnSettings.setOnClickListener {
            navigateSettings()
        }
    }

    private fun navigateSettings() {
        val intent = Intent(this, SettingsActivity::class.java)

        startActivity(intent)
    }

    private fun navigateSuperhero() {
        val intent = Intent(this, SuperHeroListActivity::class.java)

        startActivity(intent)
    }

    private fun navigateTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)

        startActivity(intent)
    }

    private fun navigateIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)

        startActivity(intent)
    }

    private fun navigateSaludarApp() {
        val intent = Intent(this, FirstAppActivity::class.java)

        startActivity(intent)
    }
}
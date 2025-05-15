package com.example.observar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        val elecCard = findViewById<CardView>(R.id.elecCard)
        val homeCard = findViewById<CardView>(R.id.homeCard)
        val beautyCard = findViewById<CardView>(R.id.beautyCard)
        val pharmCard = findViewById<CardView>(R.id.pharmCard)
        val grocCard = findViewById<CardView>(R.id.grocCard)

        /*btnPaisaje1 = findViewById(R.id.btnPaisaje1)
        btnPaisaje2 = findViewById(R.id.btnPaisaje2)
        btnPaisaje3 = findViewById(R.id.btnPaisaje3)*/

        // Abrir la actividad de paisaje 1
        clothingCard.setOnClickListener {
            val intent = Intent(this, PanoramaActivity::class.java)
            intent.putExtra("panorama", "panorama.html")
            startActivity(intent)
        }

        // Abrir la actividad de paisaje 2
        elecCard.setOnClickListener {
            val intent = Intent(this, PanoramaActivity::class.java)
            intent.putExtra("panorama", "panorama2.html")
            startActivity(intent)
        }

        // Abrir la actividad de paisaje 3
        homeCard.setOnClickListener {
            val intent = Intent(this, PanoramaActivity::class.java)
            intent.putExtra("panorama", "panorama3.html")
            startActivity(intent)
        }

        beautyCard.setOnClickListener {
            val intent = Intent(this, PanoramaActivity::class.java)
            intent.putExtra("panorama", "panorama4.html")
            startActivity(intent)
        }

        pharmCard.setOnClickListener {
            val intent = Intent(this, PanoramaActivity::class.java)
            intent.putExtra("panorama", "panorama5.html")
            startActivity(intent)
        }

        grocCard.setOnClickListener {
            val intent = Intent(this, PanoramaActivity::class.java)
            intent.putExtra("panorama", "panorama6.html")
            startActivity(intent)
        }
    }
}

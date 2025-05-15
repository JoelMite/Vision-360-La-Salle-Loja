package com.example.observar

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Establece la vista del layout
        setContentView(R.layout.activity_splash)

        // Encuentra el ImageView
        val splashImageView: ImageView = findViewById(R.id.splashImage)

        // Redimensiona la imagen
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.logo)

        // Calcula las dimensiones del dispositivo (puedes ajustar el tamaño a tus necesidades)
        val width = 400 // Ancho deseado en dp
        val height = 230 // Alto deseado en dp
        val scale = resources.displayMetrics.density

        // Convierte de dp a píxeles
        val newWidth = (width * scale).toInt()
        val newHeight = (height * scale).toInt()

        // Redimensiona la imagen
        val resizedBitmap = Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, false)

        // Establece la imagen redimensionada en el ImageView
        splashImageView.setImageBitmap(resizedBitmap)

        // Espera 2 segundos y luego lanza la MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2000)  // 2 segundos
    }
}

package com.example.observar

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class PanoramaActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panorama)

        webView = findViewById(R.id.panoramaWebView)

        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.allowFileAccess = true
        webView.settings.allowFileAccessFromFileURLs = true
        webView.settings.allowUniversalAccessFromFileURLs = true

        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()

        val panoramaFile = intent.getStringExtra("panorama")
        webView.loadUrl("file:///android_asset/$panoramaFile")
    }
}

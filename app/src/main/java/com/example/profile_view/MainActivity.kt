package com.example.profile_view

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val githubProfileUrl = "https://github.com/2202devraj"
        val webView = findViewById<WebView>(R.id.webView)

        // Enable JavaScript (if needed)
        webView.settings.javaScriptEnabled = true

        // Load the GitHub profile URL
        webView.loadUrl(githubProfileUrl)

        // Set a WebViewClient to handle page navigation within the WebView
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                // Load links within the WebView, not in an external browser
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
    }
}


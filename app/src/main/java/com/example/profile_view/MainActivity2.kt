package com.example.profile_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val slackNameTextView = findViewById<TextView>(R.id.slackName)
        val displayPictureImageView = findViewById<ImageView>(R.id.displayPicture)
        val openGitHubButton = findViewById<Button>(R.id.openGitHubButton)

        // To Set Slack name
        slackNameTextView.text = "Devraj Singh"

        // To Link Slack Image
        val slackProfileImageUrl = "https://ca.slack-edge.com/T05FFAA91JP-U05RA3JB9HQ-6f68cdfb5245-512"
        Picasso.get()
            .load(slackProfileImageUrl)
            .placeholder(R.drawable.placeholder_image) // A placeholder image while loading
            .error(R.drawable.error_image) // An error image to display if the load fails
            .into(displayPictureImageView)

        // To Open Web View
        openGitHubButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
            }
        }
    }

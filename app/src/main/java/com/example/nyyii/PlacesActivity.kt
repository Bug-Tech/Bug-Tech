package com.example.nyyii

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PlacesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)

        val morePlacesButton: Button = findViewById(R.id.Button2)

        // Set an OnClickListener to handle the click event
        morePlacesButton.setOnClickListener {
            // Start the MorePlacesActivity
            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)
        }
    }
}
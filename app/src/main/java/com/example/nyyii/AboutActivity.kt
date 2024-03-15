package com.example.nyyii

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val viewMapButton: Button = findViewById(R.id.Maps)

        // Set an OnClickListener to handle the click event
        viewMapButton.setOnClickListener {
            // Start the "map" activity
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
        val morePlacesButton: Button = findViewById(R.id.Button1)

        // Set an OnClickListener to handle the click event
        morePlacesButton.setOnClickListener {
            // Start the MorePlacesActivity
            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)
        }




        }


    }







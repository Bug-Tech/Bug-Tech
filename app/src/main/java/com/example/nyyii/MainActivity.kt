package com.example.nyyii

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var dbHelper: Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerTextView: Button = findViewById(R.id.RegisterButton)

        registerTextView.setOnClickListener {
            // Start the registration activity
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        dbHelper = Database(this)

        usernameEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_btn)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()


            val loginButton: Button = findViewById(R.id.login_btn)

            loginButton.setOnClickListener {
                // Perform login validation here...

                // For demonstration purposes, let's assume the login is successful
                // Start the "about" activity
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                val result = dbHelper.checkUser(username, password)
                if (result) {
                    Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
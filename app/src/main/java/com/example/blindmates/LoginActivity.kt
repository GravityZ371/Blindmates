package com.example.blindmates

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val createAccount= findViewById<Button>(R.id.create_account_btn)

        createAccount.setOnClickListener{
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
            }
        }
    }

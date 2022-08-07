package com.example.med11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialisation des widgets

        val btn_login =findViewById<Button>(R.id.btn_login_main)
        val btn_signup =findViewById<Button>(R.id.btn_signup_main)

        //switch of fragments

        btn_login.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView_login,login()).addToBackStack("").commit()
        }
        btn_signup.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView_login,sign_up()).addToBackStack("").commit()
        }

    }
}
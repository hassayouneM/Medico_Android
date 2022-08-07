package com.example.med11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signUp_patient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_patient)

        //declaration des variables
        var btn_signUp = findViewById<Button>(R.id.btn_signup_patient)

        btn_signUp.setOnClickListener {
            //go to acceuil patient
        }
    }
}
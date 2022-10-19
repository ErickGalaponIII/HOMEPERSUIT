package com.homepursuitlogin.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        val BtnLogin = findViewById<Button>(R.id.btnlogin)

        BtnLogin.setOnClickListener{
            val loginintent= Intent(this, HelloWorld::class.java)
            startActivity(loginintent)

        }
    }

    fun onMatch(view: View) {
        // 2nd, Name and password matching function.
        val textName = findViewById<EditText>(R.id.editTextName)
        val textPass = findViewById<EditText>(R.id.editTextTextPassword)
        val textView = findViewById<TextView>(R.id.textViewTitle)

        if (textName.text.toString() == "admin" && textPass.text.toString() == "admin") {


            Toast.makeText(this, "login Successfully.", Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(this, "login failed", Toast.LENGTH_LONG).show()
        }
    
    }
}
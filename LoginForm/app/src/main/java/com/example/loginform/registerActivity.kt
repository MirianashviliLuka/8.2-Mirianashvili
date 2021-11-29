package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class registerActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var pass: EditText
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var username: EditText
    lateinit var register: Button
    lateinit var goToLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        email = findViewById(R.id.REmail)
        pass = findViewById(R.id.RPassword)
        firstName = findViewById(R.id.FirstName)
        lastName = findViewById(R.id.LastName)
        username = findViewById(R.id.Username)
        register = findViewById(R.id.register)
        goToLogin = findViewById(R.id.linkTologin)

        email.setText(intent?.extras?.getString("EMAIL","none"))

        goToLogin.setOnClickListener{
            val mail: String = email.text.toString()
            val intent = Intent(this, loginActivity::class.java)
            intent.putExtra("EMAIL",mail)
            startActivity(intent)
        }
    }
}
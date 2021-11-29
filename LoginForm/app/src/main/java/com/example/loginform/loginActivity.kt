package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class loginActivity : AppCompatActivity() {
    val userEmail = "admin"
    val userPassword = "admin"
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var log: Button
    lateinit var GoToRegister: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.Email)
        password = findViewById(R.id.Password)
        log = findViewById(R.id.login)
        GoToRegister = findViewById(R.id.linkToReg)

        email.setText(intent?.extras?.getString("EMAIL","none"))

        GoToRegister.setOnClickListener{
            val mail: String = email.text.toString()
            val intent = Intent(this, registerActivity::class.java)
            intent.putExtra("EMAIL",mail)
            startActivity(intent)
        }

        log.setOnClickListener {

            if(userEmail == email.getText().toString() && userPassword == password.getText().toString()){
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Email Or Password Is Incorrect", Toast.LENGTH_SHORT).show()
            }

        }

    }

}
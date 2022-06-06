package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_after_login.*

class After_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        val take_message = intent.getStringExtra("usernamekey")
        afterlogin_username.text = take_message

        //val take_message2 = intent.getStringExtra("namekey")
        //afterlogin_username.text = take_message2



    }


    override fun onBackPressed() {
        val newIntent = Intent(this@After_Login, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        startActivity(newIntent)
    }
}
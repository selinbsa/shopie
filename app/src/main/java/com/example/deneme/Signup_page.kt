package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup_page.*

class Signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        singup_button.setOnClickListener {

            //val take_name = signup_name.text.toString()

            //val newIntent=Intent(this@Signup_page, MainActivity::class.java)

            //newIntent.putExtra("namekey",take_name)

            Snackbar.make(it,"You are a member now. Please go back to the login page and login to your account.", Snackbar.LENGTH_LONG).show()

            //startActivity(newIntent)

        }

        signuphelp.setOnClickListener {
            Snackbar.make(it,"Please wait for help", Snackbar.LENGTH_SHORT).show()
        }




        gotologinbutton.setOnClickListener {
            val newIntent=Intent(this@Signup_page, MainActivity::class.java)
            finish()
            startActivity(newIntent)
        }
    }


    override fun onBackPressed() {
        val newIntent = Intent(this@Signup_page, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(newIntent)
    }




}
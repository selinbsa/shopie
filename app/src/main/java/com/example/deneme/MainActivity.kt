package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        loginbutton.setOnClickListener {

            val take_username = editTextUserName.text.toString()

            val newIntent = Intent(this@MainActivity,After_Login::class.java)

            newIntent.putExtra("usernamekey",take_username)


            Snackbar.make(it,"Welcome to SHOPIE", Snackbar.LENGTH_SHORT).show()



            startActivity(newIntent)



        }

        textsignup.setOnClickListener {

            val newIntent = Intent(this@MainActivity,Signup_page::class.java)
            startActivity(newIntent)

        }
        helptext.setOnClickListener {
            Snackbar.make(it,"Please wait for help", Snackbar.LENGTH_SHORT).show()
        }




    }
}
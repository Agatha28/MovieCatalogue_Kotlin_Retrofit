package com.example.moviecatalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_three.*

class ThreeActivity : AppCompatActivity() {

    var btnStartPageTiga: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        btnStartPageTiga = findViewById(R.id.btnStartPageThree)

        btnStartPageThree.setOnClickListener {
            val intentStartPageToMain = Intent(this,MainActivity::class.java)
            startActivity(intentStartPageToMain)
            finish()
        }
    }
}
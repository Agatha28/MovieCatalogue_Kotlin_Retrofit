package com.example.moviecatalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_two.*

class OneActivity : AppCompatActivity() {

    var btnNext: Button? = null
    var btnSkip: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

         btnNext = findViewById(R.id.btnNexPageOne)
         btnSkip = findViewById(R.id.btnSkipPageOne)

            btnNexPageOne.setOnClickListener {
                val intentToPagetwo = Intent(this,TwoActivity::class.java)
                startActivity(intentToPagetwo)
                finish()
            }

            btnSkipPageOne.setOnClickListener {
                val intentToMainActivity = Intent(this,MainActivity::class.java)
                startActivity(intentToMainActivity)
                finish()
            }
    }
}
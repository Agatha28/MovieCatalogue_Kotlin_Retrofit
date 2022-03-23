package com.example.moviecatalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : AppCompatActivity() {

    var btnNextTwo: Button? = null
    var btnSkipTwo: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        btnNextTwo = findViewById(R.id.btnNextPageTwo)
        btnSkipTwo = findViewById(R.id.btnSkipPageTwo)

        btnNextPageTwo.setOnClickListener {
            val intentNextToPageThree = Intent(this,ThreeActivity::class.java)
            startActivity(intentNextToPageThree)
            finish()
        }
        btnSkipPageTwo.setOnClickListener {
            val intentToPageMain = Intent(this,MainActivity::class.java)
            startActivity(intentToPageMain)
            finish()
        }
    }
}
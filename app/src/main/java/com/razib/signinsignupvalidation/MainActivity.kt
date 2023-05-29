package com.razib.signinsignupvalidation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    lateinit var cdvtext: TextView
    lateinit var card1 : CardView
    lateinit var card2 : CardView
    lateinit var cdvtextreset : TextView
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvid).setOnClickListener {
            startActivity(Intent(this, DouaList::class.java))
        }

        cdvtext = findViewById(R.id.cdvtext)
        card1 = findViewById(R.id.card1)
        card2 = findViewById(R.id.card2)
        cdvtextreset = findViewById(R.id.cdvtextreset)

        card1.setOnClickListener(View.OnClickListener {
            count++
            cdvtext.setText(""+count)

        })
        card2.setOnClickListener(View.OnClickListener {
            count--
            cdvtext.setText(""+count)

        })
        cdvtextreset.setOnClickListener(View.OnClickListener {
            count = 0
            cdvtext.setText(""+count)

        })
    }
}
package com.example.maksimnedyalkov.cryptobg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Activity
import android.view.View
import android.R.attr.button
import android.R.attr.button
import android.provider.Settings
import android.widget.Toast


class MyActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.id.content_layout_id)
        setContentView(R.layout.activity_main)

        //val button_buy = findViewById<Button>(R.id.button_buy);
        //val Button button_buy = findViewById(R.id.button_buy


        button_buy.setOnClickListener({
            Toast.makeText(this, "Choosen one", Toast.LENGTH_LONG).show()
        })
    }
}

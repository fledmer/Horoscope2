package com.example.horoscope2

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getResources().getStringArray(R.array.signs);

        val zodiacSign = resources.getStringArray(R.array.signs)
        val zodiacDescription = resources.getStringArray(R.array.signs_disc)

        val spinner = findViewById<View>(R.id.spinner) as Spinner
        val editTxt = findViewById<View>(R.id.informationMsg) as TextView

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) {
                editTxt.text = zodiacDescription[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        }
    }
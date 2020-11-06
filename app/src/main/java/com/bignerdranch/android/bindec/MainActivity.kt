package com.bignerdranch.android.bindec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bin_input: EditText = findViewById(R.id.binary_input)
        val decimal_textview: TextView = findViewById(R.id.decimal_textview)
        val convert_btn: Button = findViewById(R.id.convert_btn)


        bin_input.transformationMethod = null

        convert_btn.setOnClickListener {_: View ->
            decimal_textview.text = (Integer.parseInt(bin_input.text.toString(),2)).toString()
        }
        decimal_textview.text=bin_input.text


    }
}
package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this
        ArrayAdapter.createFromResource(
            this,
            R.array.spinner,
            android.R.layout.simple_spinner_item
        ).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = it
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
        val text = parent?.getItemAtPosition(position).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}

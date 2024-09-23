package com.example.heighttracker

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.heighttracker.databinding.ActivityMainBinding
import com.google.firebase.Firebase
import com.google.firebase.database.database

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//
        findViewById<Button>(R.id.confirmbutton).setOnClickListener {
            val database = Firebase.database
            val myRef = database.getReference(""+System.currentTimeMillis())

            myRef.setValue(findViewById<EditText>(R.id.heightInput).getText().toString())
        }

    }
}
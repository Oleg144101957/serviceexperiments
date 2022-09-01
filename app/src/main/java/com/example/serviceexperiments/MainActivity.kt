package com.example.serviceexperiments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serviceexperiments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.apply {

            btnStart.setOnClickListener {

                startService(Intent(this@MainActivity, MyService::class.java))

            }

            btnStop.setOnClickListener {

                stopService(Intent(this@MainActivity, MyService::class.java))

            }

        }




    }
}
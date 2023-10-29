package com.example.amangeldi_abdiabaitov_mo3_hw_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fl_anime, AnimeFragment()).commit()
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        supportFragmentManager.beginTransaction().add(R.id.fl)

    }
}
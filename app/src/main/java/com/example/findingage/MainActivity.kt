package com.example.findingage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.findingage.databinding.ActivityMainBinding
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            getAge()
        }
    }

    fun getAge(){
        val userDOB = Integer.parseInt(binding.etd.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val usersAgeinYears = currentYear - userDOB
        binding.age.text = "Your age is $usersAgeinYears years old"
    }
}
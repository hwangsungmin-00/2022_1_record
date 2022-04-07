package com.example.shapeup1

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.shapeup1.databinding.ActivityMainBinding
import com.example.shapeup1.databinding.ActivityTodolistBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class todolistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_todolist)

        val binding = ActivityTodolistBinding.inflate(layoutInflater)
        val binding2 = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setContentView(binding2.root)




        binding.Btngo.setOnClickListener {
            val nextIntent = Intent(this, calendarActivity::class.java)
            startActivity(nextIntent)
        }

        binding.button.setOnClickListener{
            binding.button.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button10.setOnClickListener{
            binding.button10.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button11.setOnClickListener{
            binding.button11.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button13.setOnClickListener{
            binding.button13.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button3.setOnClickListener{
            binding.button3.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button4.setOnClickListener{
            binding.button4.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button5.setOnClickListener{
            binding.button5.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button6.setOnClickListener{
            binding.button6.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button7.setOnClickListener{
            binding.button7.setBackgroundColor(Color.parseColor("#ff9966"))
        }
        binding.button8.setOnClickListener{
            binding.button8.setBackgroundColor(Color.parseColor("#ff9966"))
        }

    }
}
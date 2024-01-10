package com.android.soloassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.soloassignment.databinding.ActivityMainBinding
import com.android.soloassignment.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<MyItem>("data")
        Log.d("DATA", "${data?.address}")

        binding.secondIv1.setImageResource(data?.picture as Int)
        binding.tvNickname.text = data.nickname
        binding.secondTvTitle.text = data.title
        binding.introduce.text = data.detail
        binding.tvAddress2.text = data.address
        binding.secondPrice.text = data.price

        binding.btnBack.setOnClickListener{
            Toast.makeText(this, "잘 작동합니다", Toast.LENGTH_SHORT).show()
            finish()
        }


    }
}
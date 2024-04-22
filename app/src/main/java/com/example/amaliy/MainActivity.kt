package com.example.amaliy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.amaliy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.ivNote.setImageResource(R.drawable._471363_2388493)
//        binding.ivNote.alpha = 0f
//        binding.ivNote.animate().setDuration(1500).alpha(1f).withEndAction{
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//            finish()
//        }

//        binding.animationView.postDelayed({
//            startActivity(Intent(this@MainActivity, MainActivity::class.java))
//            finish()
//        },4000)
    }
}
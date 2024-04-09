package com.birdcodef

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.birdcodef.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome : String = binding.editName.text.toString()
            // binding.textResultado.text = "Olá " + nome
            // binding.textResultado.text = "Olá ${nome}"
            binding.textResultado.setText("Olá ${nome}")
        }
    }
}
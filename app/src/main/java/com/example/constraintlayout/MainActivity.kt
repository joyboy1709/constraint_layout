package com.example.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main) //

        val openPetFormButton = findViewById<Button>(R.id.openEmailFormButton)
        openPetFormButton.setOnClickListener {
           // val intent = Intent(this, PetFormulario::class.java)
            //startActivity(intent)

            val intent = Intent(this, Email::class.java)
            startActivity(intent)
        }




    }
}
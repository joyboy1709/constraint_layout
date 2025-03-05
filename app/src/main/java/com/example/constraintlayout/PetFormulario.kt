package com.example.constraintlayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PetFormulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formulario)

        val petName = findViewById<EditText>(R.id.petName)
        val petBreed = findViewById<EditText>(R.id.petBreed)
        val petAge = findViewById<EditText>(R.id.petAge)
        val petWeight = findViewById<EditText>(R.id.petWeight)
        val petDescription = findViewById<EditText>(R.id.petDescription)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            val name = petName.text.toString()
            val breed = petBreed.text.toString()
            val age = petAge.text.toString()
            val weight = petWeight.text.toString()
            val description = petDescription.text.toString()

            if (name.isNotEmpty() && breed.isNotEmpty() && age.isNotEmpty() && weight.isNotEmpty()) {
                val message = "Mascota Registrada:\nNombre: $name\nRaza: $breed\nEdad: $age años\nPeso: $weight kg\nDescripción: $description"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Llene todos los campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
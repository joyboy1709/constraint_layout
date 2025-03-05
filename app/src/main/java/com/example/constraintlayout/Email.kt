package com.example.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Email: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email)

        val emailTo = findViewById<EditText>(R.id.emailTo)
        val emailSubject = findViewById<EditText>(R.id.emailSubject)
        val emailMessage = findViewById<EditText>(R.id.emailMessage)
        val sendButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            val to = emailTo.text.toString()
            val subject = emailSubject.text.toString()
            val message = emailMessage.text.toString()

            if (to.isNotEmpty() && subject.isNotEmpty() && message.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "message/rfc822"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf(to))
                    putExtra(Intent.EXTRA_SUBJECT, subject)
                    putExtra(Intent.EXTRA_TEXT, message)
                }

                try {
                    startActivity(Intent.createChooser(intent, "Choose an email client"))
                } catch (e: Exception) {
                    Toast.makeText(this, "No email client installed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

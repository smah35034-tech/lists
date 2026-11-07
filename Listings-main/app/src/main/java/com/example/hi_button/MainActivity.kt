package com.example.hi_button

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text : TextView = findViewById(R.id.tvGreeting)
        val button : Button = findViewById(R.id.button)
        val buttonRes : Button = findViewById(R.id.buttonres)
        val buttonBye : Button = findViewById(R.id.buttonbye)
        val sayBye = Toast.makeText(this , "До встречи!" , Toast.LENGTH_LONG)

        button.setOnClickListener {
            text.text = "Привет, Android!"
        }
        buttonRes.setOnClickListener {
            text.text = "Привет"
        }
        buttonBye.setOnClickListener {
            text.text = "Пока"
            sayBye.show()
        }

    }
}
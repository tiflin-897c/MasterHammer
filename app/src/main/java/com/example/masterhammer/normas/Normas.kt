package com.example.masterhammer.normas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.masterhammer.MainActivity
import com.example.masterhammer.R




class Normas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_normas)

        val botonVolver: Button = findViewById(R.id.botonIrAMain)
        botonVolver.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }





        //  botones
        val btnCreacionPersonajes: Button = findViewById(R.id.btnCreacionPersonajes)
        val btnCombate: Button = findViewById(R.id.btnCombate)
        val btnSubidaDeNivel: Button = findViewById(R.id.btnSubidaDeNivel)
        val btnEstados: Button = findViewById(R.id.btnEstados)

        // listeners para los botones
        btnCreacionPersonajes.setOnClickListener {
            startActivity(Intent(this, CreacionPersonajes::class.java))
        }

        btnCombate.setOnClickListener {
            startActivity(Intent(this, Combate::class.java))
        }

        btnSubidaDeNivel.setOnClickListener {
            startActivity(Intent(this, DestinoyResilencia::class.java))
        }

        btnEstados.setOnClickListener {
            startActivity(Intent(this, Estados::class.java))
        }

        // margenes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.normasLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}





package com.example.masterhammer.elmundo

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

class ElMundo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_el_mundo)

        val botonVolver: Button = findViewById(R.id.botonIrAMain)
        botonVolver.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // botones

        val btnGeografia: Button = findViewById(R.id.btnGeografia)
        val btnOrganizaciones: Button = findViewById(R.id.btnTransfondo)
        val btnCulturas: Button = findViewById(R.id.btnCaos)
        val btnRazas: Button = findViewById(R.id.btnFacciones)



        btnGeografia.setOnClickListener {
            startActivity(Intent(this, Geografia::class.java))
        }

        btnOrganizaciones.setOnClickListener {
            startActivity(Intent(this, Transfondo::class.java))
        }

        btnCulturas.setOnClickListener {
            startActivity(Intent(this, Caos::class.java))
        }

        btnRazas.setOnClickListener {
            startActivity(Intent(this, Facciones::class.java))
        }

        // margenes insert
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.elMundoLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }




}

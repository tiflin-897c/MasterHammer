package com.example.masterhammer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.masterhammer.Armas.Armas
import com.example.masterhammer.elmundo.ElMundo
import com.example.masterhammer.normas.Normas

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // barra visible
        window.statusBarColor = android.graphics.Color.parseColor("#FFF5E1")
        window.decorView.systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        // Botones
        val botonArmas: Button = findViewById(R.id.botonArmas)
        val botonNormas: Button = findViewById(R.id.botonNormas)
        val botonTiradas: Button = findViewById(R.id.botonTiradas)
        val botonElMundo: Button = findViewById(R.id.botonElMundo)
        val botonSemilla: Button = findViewById(R.id.botonSemilla)
        val botonCuaDefe: Button = findViewById(R.id.botonCuaDefe)

        // configuracion
        botonArmas.setOnClickListener {
            val intent = Intent(this, Armas::class.java)
            startActivity(intent)
        }

        botonNormas.setOnClickListener {
            val intent = Intent(this, Normas::class.java)
            startActivity(intent)
        }

        botonTiradas.setOnClickListener {
            val intent = Intent(this, Tiradas::class.java)
            startActivity(intent)
        }

        botonElMundo.setOnClickListener {
            val intent = Intent(this, ElMundo::class.java)
            startActivity(intent)
        }

        botonSemilla.setOnClickListener {
            val intent = Intent(this, Semillas::class.java)
            startActivity(intent)
        }

        botonCuaDefe.setOnClickListener {
            val intent = Intent(this, CuaDefe::class.java)
            startActivity(intent)
        }
    }
}



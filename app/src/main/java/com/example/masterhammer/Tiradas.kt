package com.example.masterhammer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Tiradas : AppCompatActivity() {

    private lateinit var numeroInput: EditText
    private lateinit var resultadoTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiradas)

        // barra superior
        window.statusBarColor = android.graphics.Color.parseColor("#FFF5E1")
        window.decorView.systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR



        numeroInput = findViewById(R.id.numeroInput)
        val botonTirar: Button = findViewById(R.id.botonTirar)
        val botonVolver: Button = findViewById(R.id.botonIrAMain)  // Botón para volver a MainActivity
        resultadoTexto = findViewById(R.id.resultadoTexto)

        botonTirar.setOnClickListener {
            realizarTirada()
        }

        botonVolver.setOnClickListener {
            // vuelve  MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // finaliza la actividad actual
        }
    }

    private fun realizarTirada() {
        val inputTexto = numeroInput.text.toString()
        val numeroinput = inputTexto.toIntOrNull()

        if (inputTexto.isEmpty()) {
            Toast.makeText(this, "Introduce un número válido", Toast.LENGTH_SHORT).show()
            return
        }

        if (numeroinput == null || numeroinput < 1 || numeroinput > 100) {
            Toast.makeText(this, "El número debe estar entre 1 y 100", Toast.LENGTH_SHORT).show()
            return
        }

        val resultadoDado = tirarDado()
        val exito = verificarResultado(numeroinput, resultadoDado)

        val mensaje = if (exito) "¡Éxito!: $resultadoDado"
        else "Fracaso: $resultadoDado"

        resultadoTexto.text = mensaje
    }

    private fun tirarDado(): Int {
        return (1..100).random()
    }

    private fun verificarResultado(numeroIntroducido: Int, resultadoDado: Int): Boolean {
        return resultadoDado <= numeroIntroducido
    }
}


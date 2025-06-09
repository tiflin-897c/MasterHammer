package com.example.masterhammer.normas;

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.masterhammer.R

class CreacionPersonajes : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_creacion_personajes)


        val botonVolver_3: Button = findViewById(R.id.botonIrAtras)
        botonVolver_3.setOnClickListener {

            val intent = Intent(this, Normas::class.java)
            startActivity(intent)
            finish()
        }


        // TextView
        val textView = findViewById<TextView>(R.id.textView)

        // Contenido HTML
        val htmlContent = """
                            
                            
                                <h2> Creación de Personajes</h2>
                                <p><font size="18"><b>En "Warhammer"</b></font> los personajes suelen comenzar como habitantes comunes del Imperio, lo que les da un trasfondo realista y accesible. Aunque pueden estar destinados a la grandeza, su inicio es humilde. La creación de personajes se realiza utilizando una Hoja de Personaje, que es esencial para registrar las habilidades, atributos y otros detalles importantes del personaje.</p>
                                
                                <h2>Pasos para Crear un Personaje</h2>
                                <p>La creación de un personaje se divide en nueve pasos, cada uno de los cuales es crucial para definir las características y habilidades del personaje. Estos pasos guían al jugador desde la elección de la especie hasta la personalización final del personaje, asegurando que cada aspecto esté bien considerado.</p>
                                
                                <h2>Especie</h2>
                                <p><font size="18"><b>Elección de especie</b></font> Los jugadores deben elegir entre cinco especies: humano, enano, halfling, alto elfo o elfo silvano. Cada especie tiene sus propias características, habilidades y trasfondos culturales.</p>
                                
                                <h2>Clase y Carrera</h2>
                                <p><font size="18"><b>Determinación del rol</b></font> La clase del personaje determina su rol general en la sociedad, como académico, burgués, campesino, cortesano, guerrero, pícaro, ribereño o rural.</p>
                                
                                <h2>Atributos</h2>
                                <p><font size="18"><b>Capacidades del personaje</b></font> Los atributos son características innatas que describen las capacidades del personaje, como fuerza, agilidad, resistencia, inteligencia, entre otros.</p>
                                
                                <h2>Habilidades y Talentos</h2>
                                <p><font size="18"><b>Especialización</b></font> Las habilidades representan áreas de conocimiento o experiencia que el personaje ha adquirido, mientras que los talentos son aptitudes especiales que otorgan ventajas en situaciones específicas.</p>
                                
                                <h2>Accesorios</h2>
                                <p><font size="18"><b>Equipamiento inicial</b></font> Los accesorios son el equipo, armas y objetos que el personaje lleva consigo al inicio del juego.</p>
                                
                                <h2>Detalles Personales</h2>
                                <p><font size="18"><b>Personalización</b></font> En esta etapa, los jugadores eligen detalles como el nombre, la edad, el color del cabello y de los ojos, y la altura del personaje.</p>
                                
                                <h2>El Grupo</h2>
                                <p><font size="18"><b>Interacción entre personajes</b></font> Es importante considerar la dinámica del grupo de jugadores y cómo se relacionan los personajes entre sí.</p>
                                
                                <h2>Dar Vida al Personaje</h2>
                                <p><font size="18"><b>Desarrollo de historia</b></font> Para dar profundidad al personaje, se recomienda desarrollar su historia y personalidad a través de una serie de preguntas clave.</p>
                                
                                
                            <br><br><br>
                            
        """.trimIndent()

        // contenido HTML en  TextView
        textView.text = Html.fromHtml(htmlContent)

        // margenes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}



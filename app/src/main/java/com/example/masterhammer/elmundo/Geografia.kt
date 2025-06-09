package com.example.masterhammer.elmundo

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

class Geografia : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_geografia)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val botonVolver_2: Button = findViewById(R.id.botonIrAtras)
        botonVolver_2.setOnClickListener {

            val intent = Intent(this, ElMundo::class.java)
            startActivity(intent)
            finish()
        }



        val textView = findViewById<TextView>(R.id.textView)

        // Contenido HTML
        val htmlContent = """              
                                       
                    
                        
                    
                
                       <h1>Geografía </h1>
                        
                        <h2>Ulthuan</h2>
                        <p>Ulthuan es un majestuoso continente isleño donde los Altos Elfos viven en armonía con la naturaleza, rodeados de impresionantes paisajes y ciudades resplandecientes. </p>

                        <h2>Norsca</h2>
                        <p>Norsca es una tierra salvaje y fría donde los bárbaros luchan por sobrevivir, adorando a los dioses del Caos mientras combaten en crueles batallas por el honor, el poder y la gloria, enfrentándose a los elementos y a criaturas aterradoras, todo mientras buscan ganar la eternidad a través de su fuerza y coraje.</p>

                        <h2>Tilea</h2>
                        <p>Tilea se encuentra al sur del Imperio y, en muchos aspectos, es como una jungla política. Aquí, el comercio fluye y las ciudades-estado están sumidas en una constante lucha por el poder. Inspirada en la Italia renacentista, Tilea es el lugar perfecto para mercenarios, diplomáticos y comerciantes, donde las intrigas y alianzas juegan un papel tan importante como las batallas. Las ciudades como Luccini o Miragliano son centros de riqueza, pero también de conspiraciones y secretos.</p>
                        
                        <h2>El Viejo Mundo</h2>
                        <p>El Viejo Mundo es, por mucho, el continente más poblado y complejo de todos. Aquí conviven grandes imperios como el del Imperio de los Hombres, la noble Bretonia y las tierras plagadas de Skaven. Es una tierra en la que la lucha por el control de territorios nunca cesa. En este lugar, cada batalla cuenta, cada civilización está en constante riesgo de caer. Es el escenario principal de todas las grandes historias de Warhammer Fantasy, donde los héroes, villanos y criaturas míticas siguen sus propios destinos entrelazados con los de todo el mundo.</p>
                        
                        
                        <h2>Tierras del Sur </h2>
                        <p>Las Tierras del Sur están tan alejadas y misteriosas que muchos han olvidado que existen. Situadas al sur del Viejo Mundo y Tilea, estas tierras son un vasto paisaje de desiertos abrasadores, selvas oscuras y sabanas peligrosas.</p>
                        
                        
                        <br><br><br>




                
                
                
            """.trimIndent()
        //  contenido HTML en el TextView
        textView.text = Html.fromHtml(htmlContent)

        // margenes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
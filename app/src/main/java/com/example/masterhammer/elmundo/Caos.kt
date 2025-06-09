package com.example.masterhammer.elmundo

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

class Caos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_caos)
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
               
                                 
                                        <h1>El Caos</h1>
                                        <p>En Warhammer Fantasy, el Caos es una de las fuerzas más peligrosas y locas que existen. Viene del Reino del Caos, un lugar de pura energía y descontrol. Tiene cuatro dioses principales, cada uno con sus seguidores fanáticos que quieren meter su locura en el mundo real.</p>
                                        
                                        <h2>Khorne, el Dios de la Sangre</h2>
                                        <p>Khorne es todo sobre guerra y destrucción. Sus seguidores viven para el combate, odian la magia y respetan solo la fuerza. Si escuchás "¡Sangre para el Dios de la Sangre, cráneos para el Trono de Khorne!", probablemente estás por meterte en un lío grande. No tienen piedad, solo quieren ver correr la sangre.</p>
                                        
                                        <h2>Tzeentch, el Dios del Cambio</h2>
                                        <p>Tzeentch es el dios de la magia, los secretos y los planes enrevesados. Sus cultistas suelen ser hechiceros o manipuladores que siempre están moviendo los hilos desde las sombras. Nada con él es directo: todo es doble intención y mil vueltas. Ni sus fieles entienden qué quiere realmente.</p>
                                        
                                        <h2>Nurgle, el Dios de la Plaga</h2>
                                        <p>Nurgle representa enfermedades, podredumbre... pero también resistencia y aceptación. Es raro, pero sus seguidores lo ven como una figura paternal. Aunque estén llenos de peste y se estén cayendo a pedazos, están felices. Donde va Nurgle, la vida cambia, aunque sea en su forma más asquerosa.</p>
                                        
                                        <h2>Slaanesh, el Príncipe del Placer</h2>
                                        <p>Slaanesh es todo sobre el exceso. Placer, belleza, dolor, arte... todo llevado al límite. Sus seguidores buscan sensaciones extremas y nunca se conforman. Una vez que caés en su red, terminás atrapado en una espiral de deseo sin fin. Y cuanto más lejos llegás, peor se pone.</p>
                                        
                                        <h2>La Adoración y las Sectas del Caos</h2>
                                        <p>Los cultos del Caos están por todos lados. Algunos actúan escondidos en ciudades humanas, mientras que otros, como los bárbaros del norte, rinden culto abiertamente y sin vergüenza. Cuanto más fiel sos, más regalos raros podés recibir: poderes, mutaciones o cosas mucho peores.</p>
                                        
                                        <h2>Los Demonios del Caos</h2>
                                        <p>Además de sus seguidores humanos, cada dios tiene ejércitos enteros de demonios, hechos a su imagen. Normalmente viven en el Reino del Caos, pero pueden aparecer en el mundo real si alguien abre la puerta correcta. Desde los Desangradores de Khorne hasta los demonios sensuales de Slaanesh, son enemigos que no se enfrentan así nomás.</p>
                                        
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
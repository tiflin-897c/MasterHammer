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
import com.example.masterhammer.MainActivity
import com.example.masterhammer.R

class DestinoyResilencia : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_destinoyresilencia)


        val botonVolver_3: Button = findViewById(R.id.botonIrAtras)
        botonVolver_3.setOnClickListener {

            val intent = Intent(this, Normas::class.java)
            startActivity(intent)
            finish()
        }


        //  TextView
        val textView = findViewById<TextView>(R.id.textView)

        // Contenido HTML
        val htmlContent = """
                    </head>
                    <body>
                        <h1>Destino y Resiliencia</h1>
                        <p>Ya se trate de agallas, de suerte o del favor de los dioses, los personajes en el universo de Warhammer poseen algo especial que les permite destacar. El Destino y la Resiliencia representan las diferentes formas en que los personajes se separan de la masa, ya sea por fuerzas cósmicas o por su propia determinación. Ambos son conceptos cruciales que tienen un impacto directo sobre las reservas de puntos, los cuales se gestionan y gastan a lo largo del juego.</p>
        
                        <h2>Destino y Fortuna</h2>
                        <p>Los personajes están predestinados para algo importante, aunque no se garantiza que este destino sea glorioso, heroico o agradable. El Destino refleja esa conexión especial que un personaje tiene con fuerzas más allá de su control, permitiéndole sobrevivir a lo imposible. Los puntos de Destino están relacionados directamente con la reserva de puntos de Fortuna, que representan la suerte y la capacidad de aprovechar momentos críticos para obtener pequeños beneficios.</p>
        
                        <p><strong>Cómo gastar Fortuna:</strong> Los puntos de Fortuna se gastan para obtener bonificaciones menores que pueden cambiar el curso de un enfrentamiento, como repetir Chequeos fallidos o tener ventaja en momentos clave. Estas son las tres formas principales en las que puedes gastar un punto de Fortuna:</p>
                        <ul>
                            <li><strong>Repetir un Chequeo fallido:</strong> Si no tienes éxito en un Chequeo, puedes gastar un punto de Fortuna para volver a intentarlo.</li>
                            <li><strong>Sumar +1 NE a un Chequeo:</strong> Puedes añadir +1 al resultado de un Chequeo después de haber tirado los dados, mejorando tus posibilidades de éxito.</li>
                            <li><strong>Elegir el orden de acción en el Asalto:</strong> Puedes decidir cuándo actuar al principio de un Asalto, independientemente del orden de iniciativa.</li>
                        </ul>
        
                        <p><strong>Cómo gastar Destino:</strong> Los puntos de Destino son mucho más poderosos, pero al ser utilizados de forma permanente, reducen de forma permanente tu reserva de Fortuna. Existen dos formas principales de gastar un punto de Destino para evitar situaciones fatales:</p>
                        <ul>
                            <li><strong>Muere otro día:</strong> Tu personaje evita la muerte, pero queda fuera de combate. Puede quedar inconsciente, ser arrastrado por un río o ser dejado por muerto, pero sigue vivo, aunque no puede participar en el combate actual.</li>
                            <li><strong>¿Cómo ha podido fallar eso?:</strong> El golpe de suerte impide que el daño te afecte por completo, como si algo improbable ocurriese para salvarte. Tu personaje sigue en combate, pero no hay garantía de que sobreviva en los siguientes asaltos.</li>
                        </ul>
        
                        <p><strong>Cómo recuperar Destino y Fortuna:</strong> Los puntos de Fortuna se recuperan al inicio de cada sesión de juego hasta llegar al máximo de Destino. Los puntos de Destino, sin embargo, se recuperan rara vez. El DJ puede otorgar puntos de Destino por actos heroicos o significativos al final de una aventura importante.</p>
        
                        <h2>Resiliencia y Resolución</h2>
                        <p>Si el Destino está vinculado a una fuerza externa, la Resiliencia refleja la determinación personal de un personaje para superar adversidades. La Resiliencia está ligada a la reserva de Resolución, la cual se puede gastar para sobreponerse a obstáculos menores o situaciones difíciles, como ignorar los efectos de una herida crítica o eliminar un estado negativo.</p>
        
                        <p><strong>Cómo gastar Resolución:</strong> Los puntos de Resolución se utilizan para superar problemas menores que puedan obstaculizar tus acciones. Aquí tienes algunas maneras en las que puedes gastar puntos de Resolución:</p>
                        <ul>
                            <li><strong>Inmunidad a la Psicología:</strong> Puedes hacerte inmune a los efectos de la Psicología hasta el final del siguiente Asalto, lo que te permite resistir miedos o manipulación mental.</li>
                            <li><strong>Ignorar Heridas Críticas:</strong> Puedes ignorar los efectos de las Heridas Críticas hasta el principio del siguiente Asalto, lo que te permite continuar luchando sin penalizaciones graves.</li>
                            <li><strong>Eliminar un Estado:</strong> Puedes eliminar un estado negativo, como el estado Tumbado, lo que también te permite recuperar una Herida al levantarte.</li>
                        </ul>
        
                        <p><strong>Cómo gastar Resiliencia:</strong> Los puntos de Resiliencia permanentes son poderosos y te permiten superar obstáculos que de otro modo serían imposibles. Aquí tienes las dos formas en las que puedes gastar Resiliencia de manera permanente:</p>
                        <ul>
                            <li><strong>¡Yo te rechazo!</strong> Puedes evitar el desarrollo de una mutación debido a la influencia de la corrupción. Esto significa que no pierdes puntos de Corrupción, pero la amenaza de mutación sigue presente.</li>
                            <li><strong>¡No fallaré!</strong> En lugar de tirar los dados para un Chequeo, puedes decidir el resultado, garantizando el éxito en una situación crítica. En un Chequeo Enfrentado, siempre ganas con al menos +1 NE. También puedes elegir el impacto en un Chequeo crítico.</li>
                        </ul>
        
                        <p><strong>Cómo recuperar Resiliencia y Resolución:</strong> La Resolución se recupera cada vez que actúas de acuerdo con tu Motivación. Si el DJ considera que has actuado de manera acorde con tu Motivación, podrás recuperar puntos de Resolución. Por otro lado, el DJ también puede conceder un punto de Resiliencia por un acto de gran importancia para tu Motivación, aunque esto es mucho más raro.</p>
        
                        <p>Ambos sistemas, Destino y Resiliencia, son esenciales para la supervivencia y el éxito de un personaje en el mundo de Warhammer. Usarlos con sabiduría puede ser la clave para superar los retos más duros y vivir para contar la historia.</p>
                    <br><br><br>
            
        """.trimIndent()

        //  HTML en el TextView
        textView.text = Html.fromHtml(htmlContent)

        // margenes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


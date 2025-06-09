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

class Combate : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_combate)

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
                <h2>Combate</h2>
            
                <h3>Inicio del Combate</h3>
                <p>El combate comienza cuando un conflicto se vuelve inevitable. En este momento, los participantes determinan el orden de actuación mediante un chequeo de <b>Iniciativa (INI)</b>. Se tiran 1d10 y se suma la INI del personaje. Actúan en orden descendente, y en caso de empate, actúa primero quien tenga la mayor Agilidad.</p>
                
                <h3>Cadencia del Combate</h3>
                <p>El tiempo en combate se organiza en dos unidades principales:</p>
                <ul>
                    <li><b>Asaltos:</b> Un Asalto es el tiempo necesario para que todos los personajes realicen un Chequeo y se muevan. Generalmente, un Asalto dura unos pocos segundos, y el DJ puede decidir la duración exacta si es necesario.</li>
                    <li><b>Turnos:</b> Durante un Asalto, cada combatiente tiene un Turno para llevar a cabo una Acción y un Movimiento. El orden en que los personajes actúan se determina por la Iniciativa.</li>
                </ul>
                
                <h3>Pasos del Combate</h3>
                <p>El combate sigue estos pasos hasta que uno de los bandos huye o es derrotado:</p>
                <ul>
                    <li><b>Determinación de Sorpresa:</b> El DJ determina si algún personaje está sorprendido, lo cual generalmente ocurre en el primer asalto del combate.</li>
                    <li><b>Inicio del Asalto:</b> Se resuelven eventos que deben ocurrir al inicio del Asalto.</li>
                    <li><b>Turnos de los Personajes:</b> Cada personaje actúa en su Turno según el orden de Iniciativa. En su Turno, cada personaje puede realizar un Movimiento y una Acción.</li>
                    <li><b>Fin del Asalto:</b> El Asalto se concluye cuando todos los combatientes han llevado a cabo sus respectivos Turnos.</li>
                    <li><b>Repetición:</b> Se repiten los pasos hasta que se resuelve el combate.</li>
                </ul>
                
                <h3>Sorpresa</h3>
                <p>Tomar por sorpresa a un enemigo otorga ventajas significativas. Se puede lograr mediante:</p>
                <ul>
                    <li><b>Ocultación:</b> Realizando un Chequeo de Movimiento silencioso si se tiene la cobertura adecuada. Los enemigos pueden intentar detectarlo con un Chequeo de Percepción.</li>
                    <li><b>Tácticas furtivas:</b> Atacar desde posiciones ventajosas, como desde atrás o en la oscuridad.</li>
                    <li><b>Distracciones:</b> Usar ruidos o eventos para ocultar el ataque.</li>
                    <li><b>Defensores desprevenidos:</b> Si un enemigo está distraído, los atacantes sorprenden automáticamente.</li>
                </ul>
                
                <h3>Acciones en el Turno</h3>
                <p>Durante tu Turno, puedes realizar un Movimiento y una Acción en cualquier orden. Las descripciones vívidas de tus acciones pueden otorgar bonificadores. Por ejemplo, en lugar de simplemente declarar un ataque, puedes describir cómo realizas una maniobra táctica.</p>
                
                <h3>Movimiento</h3>
                <p>El Movimiento se basa en la Característica de Movimiento del personaje. Puedes usarlo para cargar y obtener ventajas. Si no estás en combate, puedes usar tu Movimiento para acercarte a un enemigo.</p>
                
                <h3>Acciones</h3>
                <p>Las acciones pueden ser variadas, desde atacar hasta realizar maniobras tácticas. La acción se limita por la imaginación y las habilidades del personaje. Si deseas realizar una acción que requiere un Chequeo, el DJ te informará si tienes éxito.</p>
                
                <h3>Ataques</h3>
                <p>Los ataques se resuelven mediante Chequeos:</p>
                <ul>
                    <li><b>Cuerpo a Cuerpo:</b> Se realiza un Chequeo Enfrentado de Cuerpo a cuerpo. Ambos combatientes tiran y el que obtiene el NE mayor gana.</li>
                    <li><b>A Distancia:</b> Se realiza un Chequeo de A distancia. Si tienes éxito, aciertas a tu oponente.</li>
                </ul>
                
                <h3>Dificultad del Combate</h3>
                <p>Las Dificultades de los Chequeos en combate se modifican según la situación. A continuación, se detallan los modificadores de combate:</p>
                <ul>
                    <li><b>Muy fácil (+60):</b> Disparar contra un objetivo monstruoso (del tamaño de un gigante) o a una multitud (13 o más objetivos).</li>
                    <li><b>Fácil (+40):</b> Disparar a quemarropa o contra un objetivo enorme (del tamaño de un grifo). Atacar a un oponente al que superas 3 a 1.</li>
                    <li><b>Normal (+20):</b> Disparar contra un objetivo grande (del tamaño de un ogro) o a corta distancia (menos de la mitad del alcance del arma).</li>
                    <li><b>Desafiante (+0):</b> Un ataque estándar contra un objetivo normal (del tamaño de un humano).</li>
                    <li><b>Complicado (-10):</b> Atacar cuando estás tumbado o en terreno difícil. Disparar a largo alcance (hasta el doble del alcance del arma).</li>
                    <li><b>Difícil (-20):</b> Atacar a una ubicación específica o en condiciones adversas como niebla o lluvia intensa.</li>
                    <li><b>Muy difícil (-30):</b> Atacar en terreno muy complicado, como nieve profunda o disparar a un objetivo muy pequeño (del tamaño de un ratón).</li>
                </ul>
                
                <h3>Cómo Combinar Dificultades</h3>
                <p>Cuando múltiples factores afectan la dificultad de un Chequeo, se deben seguir estas directrices:</p>
                <ul>
                    <li><b>Múltiples Penalizadores:</b> Si se aplican dos o más penalizadores, súmalos hasta un máximo de -30 o "Muy difícil". Por ejemplo, si hay niebla y se intenta disparar a una parte específica del cuerpo, el Chequeo sería "Muy difícil" (-30) en lugar de -40.</li>
                    <li><b>Múltiples Bonificadores:</b> Si se aplican dos o más bonificadores, súmalos hasta un máximo de +60 o "Muy fácil".</li>
                    <li><b>Combinación de Bonificadores y Penalizadores:</b> Si hay un bonificador y un penalizador, súmalos para calcular la nueva dificultad. Por ejemplo, atacar a un oponente en nieve profunda (-30) mientras está tumbado (+20) resultaría en un Chequeo "Complicado" (-10).</li>
                </ul>
                
                <h3>Ventaja</h3>
                <p>La Ventaja representa el ímpetu en combate y se obtiene al ganar Chequeos Enfrentados. Cada Ventaja otorga un +10 a cualquier Chequeo de combate. Se pierde si se pierde un Chequeo Enfrentado o si se acaba el combate.</p>
                
                <h3>Críticos y Pifias</h3>
                <ul>
                    <li><b>Críticos:</b> Ocurren con un doble en un Chequeo exitoso, causando un impacto significativo. El oponente sufre una Herida crítica.</li>
                    <li><b>Pifias:</b> Ocurren con un doble en un Chequeo fallido, resultando en un efecto negativo. Se consulta la Tabla ¡Huy! para determinar el resultado.</li>
                </ul>
                
                <h3>Combate con Dos Armas</h3>
                <p>Se puede luchar con un arma en cada mano, pero los ataques con la mano secundaria tienen un penalizador de -20. Si se tiene el Talento "Empuñar dos armas", se pueden realizar ataques con ambas.</p>
                
                <h3>Combate Montado</h3>
                <p>Los jinetes utilizan las características de su montura para el Movimiento y obtienen bonificadores al atacar a objetivos más pequeños. Los ataques cuerpo a cuerpo de un jinete contra un objetivo de tamaño menor que su montura obtienen un bonificador de +20 al impacto.</p> <br><br><br>
            """.trimIndent()
        // contenido HTML en el TextView
        textView.text = Html.fromHtml(htmlContent)

        // margenes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
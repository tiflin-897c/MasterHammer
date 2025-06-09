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

class Estados : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_estados)


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
                                                 <h1>Estados</h1>
                            <p>Los Estados representan efectos que pueden ocurrir durante tus aventuras en Warhammer. Estos efectos alteran tus capacidades y pueden tener consecuencias graves. A continuación, se detalla la lista de los diferentes estados y sus efectos:</p>
                            <ul>
                                <li><strong>Ardiendo:</strong> Estás en llamas, ya sea por un fuego provocado por un hechizo o por estar en contacto con un objeto inflamable. Al final de cada Asalto, sufres 1d10 Heridas, modificadas por tu Bonificador de Resistencia y la Armadura. Un Estado de Ardiendo adicional aumenta el daño recibido. Este estado se puede eliminar con un Chequeo de Atletismo exitoso.</li>
                                <li><strong>Aturdido:</strong> Te han golpeado en la cabeza o estás desorientado. No puedes realizar ninguna acción en tu turno, pero puedes moverte parcialmente (mitad del movimiento normal). Además, sufres un penalizador de -10 en todos los Chequeos. Los enemigos que intenten atacarte en combate cuerpo a cuerpo ganan +1 de Ventaja. Para eliminar este estado, debes superar un Chequeo de Aguante.</li>
                                <li><strong>Cegado:</strong> No puedes ver correctamente, ya sea por una explosión de luz, un líquido en los ojos, o algún hechizo. Sufres un penalizador de -10 a todos los Chequeos que impliquen visión, y los enemigos que te ataquen en combate cerrado obtienen +10 al impacto. Este estado se elimina de forma automática al final de los asaltos pares.</li>
                                <li><strong>Enmarañado:</strong> Estás atrapado en algo que limita tu movilidad, como cuerdas o telarañas. No puedes moverte y todas las acciones que impliquen movimiento reciben un penalizador de -10. Puedes intentar eliminar el estado con un Chequeo Enfrentado de Fuerza contra el origen del enmarañamiento, donde cada NE elimina un estado adicional.</li>
                                <li><strong>Ensordecido:</strong> Estás incapaz de oír correctamente debido a un fuerte ruido o un golpe en la cabeza. Sufres un penalizador de -10 a todos los Chequeos relacionados con el oído, y los enemigos que te ataquen en combate cerrado desde un flanco o retaguardia obtienen +10 al impacto. Este estado se elimina automáticamente después de 2 asaltos.</li>
                                <li><strong>Envenenado:</strong> Has sido envenenado por algún medio, ya sea comida, bebida o herida. Al final de cada asalto, pierdes 1 Herida. También sufres un penalizador de -10 a todos los Chequeos. Este estado puede ser eliminado mediante un Chequeo de Aguante o Sanar, y en caso de que llegues a 0 Heridas mientras estás envenenado, no podrás sanar hasta que se elimine el veneno.</li>
                                <li><strong>Fatigado:</strong> Estás exhausto, ya sea por esfuerzo físico o por un hechizo. Sufres un penalizador de -10 a todos los Chequeos. Para eliminar este estado, generalmente se requiere descansar, recibir un hechizo curativo o algún efecto divino que recupere tu energía. El tiempo necesario para descansar depende de las reglas del DJ y el estilo de la partida.</li>
                                <li><strong>Inconsciente:</strong> Has sido noqueado o caído en un estado de inconsciencia debido a un golpe o efecto. No puedes realizar ninguna acción ni defensa. Los ataques cuerpo a cuerpo te matan automáticamente si estás inconsciente, y los ataques a distancia a quemarropa también lo harán. Para recuperarte, debes resolver la causa de la inconsciencia. Si te recuperas sin solucionar la causa, caerás nuevamente en inconsciencia.</li>
                                <li><strong>Quebrantado:</strong> Estás aterrorizado y te encuentras en un estado de pánico, huyendo de cualquier amenaza. Debes usar tu movimiento para correr y ocultarte. Además, sufres un penalizador de -10 a todos los Chequeos que no impliquen huir o esconderte. Puedes intentar recuperarte mediante un Chequeo de Frialdad al final de cada asalto, pero si estás Trabado con un enemigo, no puedes intentar recuperarte.</li>
                                <li><strong>Sangrando:</strong> Estás perdiendo mucha sangre. Al final de cada Asalto, pierdes 1 Herida, y cualquier intento de resistir infecciones o heridas sufrirá un penalizador de -10. Si llegas a 0 Heridas, caes inconsciente. Si tienes múltiples estados de Sangrando, hay una probabilidad de morir al final de cada asalto. Este estado puede ser eliminado mediante un Chequeo de Sanar o curación mágica.</li>
                                <li><strong>Sorprendido:</strong> Has sido tomado por sorpresa, y no puedes actuar ni moverte en tu turno. Además, no puedes defenderte en Chequeos Enfrentados. Los enemigos que te atacan en combate cuerpo a cuerpo ganan +20 al impacto. Este estado no se apila; solo se pierde al final de cada asalto o cuando el primer ataque es efectuado.</li>
                                <li><strong>Tumbado:</strong> Has caído al suelo, ya sea por un golpe o por quedarte sin Heridas. Tu movimiento solo puede usarse para levantarte o arrastrarte a la mitad de tu velocidad normal. Además, sufres un penalizador de -20 a todos los Chequeos de movimiento, y los enemigos que te ataquen en combate cuerpo a cuerpo tienen +20 al impacto. Este estado no se apila, y solo lo sufres si estás efectivamente en el suelo.</li>
                            </ul>
                            <p>Los efectos de estos estados pueden ser eliminados mediante puntos de Resolución o Chequeos específicos. Mantente alerta, ya que algunos estados pueden ser graves si no se gestionan a tiempo.</p>
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


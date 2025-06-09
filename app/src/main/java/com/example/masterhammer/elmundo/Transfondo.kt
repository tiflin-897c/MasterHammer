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
import com.example.masterhammer.MainActivity
import com.example.masterhammer.R

class Transfondo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transfondo)
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
               
                               
                                    <h1>Trasfondo </h1>
                                    <p>El universo de Warhammer Fantasy está lleno de historia, mitología y conflictos que han moldeado su mundo. A continuación, se presentan algunos de los aspectos más relevantes de su trasfondo.</p>
                                    
                                    <h2>Vientos de Magia</h2>
                                    <p>La magia en Warhammer Fantasy proviene de los Vientos de la Magia, corrientes de energía pura que fluyen desde el Reino del Caos. Existen ocho vientos principales, cada uno asociado con una forma de hechicería diferente, como el Fuego, la Muerte o la Vida. Los hechiceros y magos canalizan estos vientos a través de su entrenamiento, pero un mal uso puede atraer la corrupción del Caos.</p>
                                    
                                    <h2>Cometa de Dos Colas</h2>
                                    <p>El Cometa de Dos Colas es un símbolo profético en Warhammer Fantasy, especialmente venerado por los seguidores de Sigmar. Se cree que su aparición marca grandes cambios en la historia, como el ascenso de héroes o la llegada de eventos catastróficos. En el pasado, su avistamiento coincidió con la llegada del propio Sigmar y otros momentos decisivos en el Viejo Mundo.</p>
                                    
                                    <h2>El Emperador</h2>
                                    <p>El Emperador es la figura política y militar más importante del Imperio de los Hombres. Desde su fundación por Sigmar, el Imperio ha sido gobernado por diferentes emperadores, elegidos por los Electores. El actual Emperador, Karl Franz, es un líder carismático y un hábil estratega que lucha por mantener la unidad del Imperio frente a amenazas internas y externas.</p>
                                    
                                    <h2>Idiomas del Mundo</h2>
                                    <p>El mundo de Warhammer Fantasy es vasto y diverso, con múltiples idiomas hablados por las distintas razas y naciones. El Reikspiel es la lengua principal del Imperio, mientras que el Bretoniano se habla en Bretonia. Los Enanos tienen su propio idioma rúnico, y los Elfos se comunican en su melódico Eltharin. Además, existen dialectos y lenguas arcanas utilizadas para la magia y los rituales oscuros.</p>
                                    
                                    <h2>La Era de los Tres Emperadores</h2>
                                    <p>Uno de los períodos más caóticos en la historia del Imperio fue la Era de los Tres Emperadores. Durante este tiempo, el trono imperial estuvo dividido entre diferentes facciones rivales, sumiendo al Imperio en una guerra civil prolongada. Esto llevó a la fragmentación del poder, el auge de mercenarios y la intervención de fuerzas externas, hasta que la unificación fue restaurada con la llegada de un nuevo emperador legítimo.</p>
                                    
                                    <h2>El Gran Cisma de la Magia</h2>
                                    <p>Uno de los eventos más importantes en la historia mágica del Viejo Mundo fue el Gran Cisma de la Magia, en el que la hechicería fue prohibida y perseguida hasta la creación de los Colegios de Magia en Altdorf. Magnus el Piadoso, emperador en aquel tiempo, estableció un sistema para controlar la magia y evitar su corrupción, dividiendo su estudio en ocho colegios según los Vientos de Magia.</p>
                                 
                                


                
                
                
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
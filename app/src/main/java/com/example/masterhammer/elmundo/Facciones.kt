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

class Facciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_facciones)
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
               
                                        
                    <h1>Facciones del mundo de Warhammer Fantasy</h1>
                    <p>Dentro del universo de Warhammer Fantasy, las facciones se dividen más o menos entre las que intentan mantener algo de orden y las que solo buscan destruir todo a su paso. Acá te dejo un resumen rápido de algunas de las principales.</p>
                    
                    <h3>El Imperio</h3>
                    <p>El Imperio es una de las naciones humanas más importantes del Viejo Mundo. Está gobernado por Karl Franz, y su ejército es bastante completo: desde caballería hasta magia de los famosos Colegios. Siempre están metidos en algún conflicto.</p>
                    
                    <h3>Bretonia</h3>
                    <p>Bretonia es más feudal, con caballeros súper religiosos que siguen a la Dama del Lago. Su punto fuerte es la caballería pesada, y toda su cultura gira alrededor del honor, las justas y ese estilo medieval idealizado.</p>
                    
                    <h3>Enanos</h3>
                    <p>Los Enanos viven en fortalezas subterráneas y no se olvidan de ninguna ofensa. Son excelentes herreros y muy duros en combate. Odian con pasión a los orcos, goblins y especialmente a los Skaven.</p>
                    
                    <h3>Elfos Silvanos</h3>
                    <p>Viviendo en los bosques de Athel Loren, estos elfos no se meten con nadie... a menos que pises su bosque. Son expertos en emboscadas y magia natural, y no les tiembla la mano si hay que defender su tierra.</p>
                    
                    <h3>Altos Elfos</h3>
                    <p>Los de Ulthuan son más refinados. Tienen siglos de historia, magia poderosa y un ejército súper disciplinado. Aunque suenen arrogantes, son de los pocos que realmente tratan de mantener un equilibrio global.</p>
                    
                    <h3>Hombres Lagarto</h3>
                    <p>Desde las junglas de Lustria, estos reptilianos siguen planes que ni ellos entienden del todo. Sus ejércitos combinan fuerza bruta y magia Slann. Son antiguos, organizados a su manera, y letales si los molestás.</p>
                    
                    <h3>Pieles Verdes</h3>
                    <p>Orcos y Goblins. No necesitan excusa para pelear. Cuando se organizan (raro, pero pasa), forman un Waaagh! y arrasan con todo. Son caóticos, ruidosos y viven para el combate. Y se divierten haciéndolo.</p>
                    
                    <h3>Elfos Oscuros</h3>
                    <p>Desde Naggaroth, los Elfos Oscuros se dedican a la conquista, la tortura y las traiciones. Malekith, su líder, odia a los Altos Elfos con toda su alma. Sus ejércitos combinan crueldad y eficiencia.</p>
                    
                    <h3>Reinos Ogros</h3>
                    <p>Los Ogros son enormes, brutales y siempre con hambre. Viven para luchar y comer, a veces al mismo tiempo. Vienen de las Montañas de los Lamentos y suelen trabajar como mercenarios... por comida, claro.</p>
                    
                    <br><br><br>



                
                
                
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
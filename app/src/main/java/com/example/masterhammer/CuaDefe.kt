package com.example.masterhammer

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CuaDefe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cua_defe)



        val botonVolver: Button = findViewById(R.id.botonIrAMain)
        botonVolver.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


        // elemento textView
        val textView = findViewById<TextView>(R.id.textView)

        // Contenido HTML
        val htmlContent = """
            <h2>Cualidades</h2>
            <p><font size="18"><b>Atrapaespadas</b></font> Algunas armas han sido diseñadas para atrapar otras armas, y a veces incluso romperlas. Si consigues un crítico cuando defiendes contra un ataque de un arma de filo, puedes elegir atraparla en lugar de infligir el Impacto crítico.</p>
            <p><font size="18"><b>Certera</b></font> Con este arma es fácil acertar al objetivo. Obtienes un bonificador de +1 NE a cualquier Chequeo con éxito cuando atacas con este arma.</p>
            <p><font size="18"><b>Contundente</b></font> Las armas Contundentes son especialmente buenas para apalear a un enemigo hasta que se somete. Si consigues un impacto en la Cabeza con un arma Contundente, intenta un Chequeo Enfrentado de Fuerza/Aguante contra ese oponente. Si ganas el Chequeo, tu oponente sufre 1 Estado de Aturdido.</p>
            <p><font size="18"><b>Dañina</b></font> Un arma puede utilizar la cifra mayor, o bien del dado de las unidades, o bien del NE, para determinar el Daño causado por un impacto. Por ejemplo, si sacas 34 en tu Chequeo de ataque y el número objetivo era 52 puedes utilizar los NE, que en este caso son 2, o el resultado del dado de las unidades, que en este caso es 4. Un arma Inofensiva nunca puede ser a la vez Dañina (Inofensiva tiene precedencia).</p>
            <p><font size="18"><b>De Pólvora negra</b></font> La detonación de un arma de fuego, seguida por nubes de humo y por la confusión puede ser aterradora. Si eres el objetivo de un arma de Pólvora negra, debes superar un Chequeo Normal (+20) de Frialdad o sufrir 1 Estado de Quebrantado, incluso si el disparo falla.</p>
            <p><font size="18"><b>Defensiva</b></font> Las armas Defensivas están diseñadas para detener ataques. Si estás empuñando una de estas armas, obtienes un Bonificador de +1 NE a cualquier Chequeo de Cuerpo a cuerpo cuando te opones a un ataque.</p>
            <p><font size="18"><b>Empalante</b></font> Las armas Empalantes pueden matar de un solo y certero golpe. Estas armas causan un impacto crítico con cualquier número divisible exactamente por 10 (por ejemplo: 10, 20, 30, etc.) así como con los dobles (por ejemplo: 11, 22, 33) si se saca un resultado igual o menor que el objetivo en un Chequeo apropiado de combate. Si el resultado de empalar procede de un arma a distancia, la munición utilizada se ha alojado firmemente en el cuerpo del objetivo. Las flechas y los virotes requieren tener éxito en un Chequeo Desafiante (+0) de Sanar para extraerlos de forma segura; las balas requieren un cirujano (consulta el Talento Cirugía en el Capítulo 4: Habilidades y Talentos). Por cada flecha o bala que no haya sido extraída, no podrás curar 1 de tus Heridas.</p>
            <p><font size="18"><b>Enmarañante</b></font> Tu arma se enreda alrededor de tus oponentes, enmarañándolos. Todo oponente a quien acierta tu arma sufre 1 Estado de Enmarañado, con una Fuerza igual a tu Atributo de Fuerza. Cuando Enmarañas a un oponente, no puedes utilizar el arma para pegarle. Podrás acabar con el enmarañamiento cuando quieras.</p>
            <p><font size="18"><b>Envolvente</b></font> Las armas Envolventes suelen tener largas cadenas con pesos en los extremos, haciendo muy difícil pararlas de forma efectiva. Los Chequeos de Cuerpo a cuerpo enfrentándose a un ataque de un arma Envolvente sufren un penalizador de -1 NE, puesto que los golpes parados pasan por encima de los escudos o alrededor de las hojas.</p>
            <p><font size="18"><b>Escudo (protección)</b></font> Si utilizas este arma para oponerte a un ataque, cuenta como si tuvieras tantos puntos de Armadura como (protección) en todas las ubicaciones de tu cuerpo. Si tu arma tiene una protección de Escudo de 2 o más (por ejemplo: Escudo 2 o Escudo 3), también puedes utilizarla para intentar detener disparos de proyectiles en tu línea visual.</p>
            <p><font size="18"><b>Explosiva (potencia)</b></font> Todos los Personajes que están a una distancia igual o menor en yardas que la (potencia) del punto objetivo impactado sufren NE + Daño por arma, y cualquier Estado que el arma inflige.</p>
            <p><font size="18"><b>Impactante</b></font> Algunas armas son simplemente enormes o causan un daño terrible debido a su peso o a su diseño. Con un impacto, suma el resultado del dado de las unidades de la tirada de ataque a cualquier Daño causado por un arma Impactante. Un arma Inofensiva nunca puede ser a la vez Impactante (Inofensiva tiene precedencia).</p>
            <p><font size="18"><b>Irrompible</b></font> El arma está exquisitamente bien hecha o está construida con un material especialmente fuerte. En casi todas las circunstancias, este arma ni se romperá, ni se oxidará, ni perderá su filo.</p>
            <p><font size="18"><b>Molesta</b></font> Las armas Molestas se pueden utilizar para hacer retroceder a un oponente debido a su naturaleza peligrosa o a su semejanza con un látigo. En lugar de causar Daño, un ataque con éxito con un arma Molesta puede obligar a un oponente a retirarse 1 yarda por cada NE por el que ganas el Chequeo Enfrentado.</p>
            <p><font size="18"><b>Perforante</b></font> El arma es altamente efectiva a la hora de perforar la armadura. Los puntos de Armadura no metálicos se ignoran, así como el primer punto de todos los demás tipos de armadura.</p>
            <p><font size="18"><b>Pistola</b></font> Puedes utilizar este arma para atacar en Combate cerrado.</p>
            <p><font size="18"><b>Precisa</b></font> El arma es Precisa y es fácil acertar con ella. Obtienes un bonificador +10 a cualquier Chequeo cuando disparas este arma.</p>
            <p><font size="18"><b>Rápida</b></font> Las armas Rápidas están diseñadas para atacar con tal velocidad que no dan opción a parada, dejando a su oponente atravesado antes de poder reaccionar. Quien empuña un arma Rápida puede atacar con ella fuera de la secuencia normal de Iniciativa, o bien atacando primero, último, o en algún lugar intermedio, a voluntad. Además, todos los Chequeos de Cuerpo a cuerpo para defender contra armas Rápidas sufren un penalizador -10 si tu oponente usa un arma sin la Cualidad Rápida; otras Habilidades defienden de la forma habitual. Dos oponentes con armas Rápidas luchan en orden de Iniciativa (el uno en relación al otro) de la forma habitual. Un arma Rápida nunca puede ser a la vez Lenta (Lenta tiene precedencia).</p>
            <p><font size="18"><b>Repetidora (cargador)</b></font>Tu arma contiene tantos disparos como la cifra indicada en (cargador), recargándose de forma automática cada vez que disparas. Cuando utilizas todos sus disparos, debes recargar el arma por completo utilizando las reglas normales. </p>
            <p><font size="18"><b>Traspasante</b></font>Las armas Traspasantes están provistas de una hoja pesada que puede atravesar la armadura con horrible facilidad. Si impactas a un oponente, infliges 1 punto de Daño a una pieza de armadura o un escudo en esa Ubicación de impacto, además de herir al objetivo.</p><br><br><br>     
        """.trimIndent()

        //  contenido HTML en el TextView
        textView.text = Html.fromHtml(htmlContent)

        //  ajusta el margen
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

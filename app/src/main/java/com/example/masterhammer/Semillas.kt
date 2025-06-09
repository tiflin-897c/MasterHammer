package com.example.masterhammer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Semillas : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_semillas)

        window.statusBarColor = android.graphics.Color.parseColor("#FFF5E1")
        window.decorView.systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        val botonVolver: Button = findViewById(R.id.botonIrAMain)
        botonVolver.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


        //margenes
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Listas  aleatorias
        val listaSemilla = listOf("Un mercader ambulante llega a la aldea con productos exóticos, pero esa misma noche varios aldeanos desaparecen sin dejar rastro.",
            "Un noble ha sido acusado de herejía y la Inquisición busca pruebas. Los personajes descubren que puede ser culpable, pero si hablan, su familia los perseguirá.",
            "Un barco sin tripulación aparece en el puerto. Al abordarlo, los personajes encuentran diarios que hablan de un ser que acecha en la niebla.",
            "Los personajes despiertan en un pueblo donde nadie parece recordar el día anterior y los aldeanos comienzan a repetir frases exactas como si fueran marionetas.",
            "Un niño afirma ver a su hermano desaparecido en los bosques cada noche. Si los personajes investigan, encuentran huellas… pero de pezuñas en vez de pies.",
            "Un grupo de refugiados llega a la ciudad diciendo que su aldea fue devorada por ‘las sombras’. Nadie les cree, hasta que desaparecen una noche sin dejar rastro.",
            "El río de la aldea se tiñe de rojo y el ganado comienza a enfermar. Los aldeanos culpan a una bruja, pero la verdadera razón es mucho más inquietante.",
            "Los personajes encuentran una carta póstuma en la que un cazador de brujas asegura haber atrapado un demonio en un sótano… pero la casa ya está ocupada por nuevos inquilinos.",
            "Una compañía de mercenarios contrata a los personajes para escoltar una caravana, pero en el camino descubren que están transportando cadáveres… que no deberían estar muertos aún.",
            "Un monasterio ha estado vendiendo reliquias sagradas, pero un hombre asegura haber visto a los monjes en rituales impíos bajo la luna nueva.",
            "Un noble busca desesperadamente a su hija, quien huyó con un extraño grupo de artistas ambulantes. La siguen hasta descubrir que los artistas no son humanos.",
            "Cada noche, alguien toca una campana en la plaza del pueblo, aunque nadie parece saber quién lo hace. Al investigar, los personajes descubren que la campana no ha sonado en décadas.",
            "Un viejo amigo de los personajes ha desaparecido. Siguiendo su rastro, encuentran su casa vacía y un espejo roto con sangre seca alrededor.",
            "El gremio de ladrones contrata a los personajes para descubrir por qué sus miembros están desapareciendo. Todo apunta a un enemigo del pasado que nadie creía que seguiría con vida.",
            "Un barco es encontrado a la deriva con un solo sobreviviente que insiste en que ‘los demás aún están aquí, aunque no puedan verlos’.",
            "Un noble ofrece una recompensa por matar a un ogro que devora su ganado. Pero al encontrar a la bestia, los personajes descubren que solo se defiende de los verdaderos monstruos.",
            "Una tormenta deja al pueblo aislado durante días y, al despejarse, los personajes descubren que varios cadáveres han sido desenterrados y sus tumbas están vacías.",
            "Un alquimista ofrece una gran suma por recuperar un extraño artefacto de una ruina abandonada. Pero al encontrarlo, los personajes comienzan a tener sueños con una voz que les susurra.",
            "Una posada en el camino tiene precios absurdamente bajos y comida excelente. Pero cada noche, un huésped desaparece y nadie parece recordarlo al día siguiente.",
            "Un sacerdote de Sigmar asegura haber visto a una estatua llorar sangre y declara que es una señal divina. Pero si los personajes investigan, encontrarán huellas con forma de garras en la capilla.",
            "Un vendedor de antigüedades ha comprado un extraño ídolo que supuestamente pertenecía a una tribu extinta. Desde entonces, ha comenzado a hablar un idioma desconocido mientras duerme.",
            "Un noble desaparecido regresa tras años perdido en las montañas, pero su esposa insiste en que ‘ese no es mi esposo’.",
            "Los personajes encuentran una vieja espada clavada en un árbol, cubierta de óxido. Si la tocan, escucharán una voz que les suplica ‘déjame descansar’.",
            "Un cazador muere horriblemente mutilado y su esposa asegura que fue un espíritu del bosque. Otros aseguran que fue un hombre bestia, pero la verdad es mucho peor.",
            "En una ciudad fronteriza, se ha dictado una ley que prohíbe la música. Quien toque un instrumento, desaparece esa misma noche.",
            "Un noble está organizando un baile de máscaras en su mansión. A medianoche, los personajes descubren que ninguno de los invitados puede quitarse la máscara.",
            "Una cacería de brujas ha comenzado en la ciudad y los personajes son acusados por error. ¿Escaparán, lucharán o intentarán limpiar su nombre?",
            "Una familia de campesinos ha encontrado oro en su terreno, pero desde entonces, han comenzado a actuar de forma errática y hablan de ‘las voces bajo la tierra’.",
            "Un alquimista busca voluntarios para probar una nueva poción. Aquellos que la beben comienzan a ver cosas que nadie más puede ver.",
            "Un grupo de peregrinos llega al pueblo y aseguran traer una reliquia sagrada. Sin embargo, esa misma noche, las ratas comienzan a comportarse de manera extraña.",
            "Un vagabundo muere en la calle y en su bolsillo encuentran una llave de plata con un símbolo desconocido. Alguien en la ciudad la quiere de vuelta.",
            "Los personajes encuentran un pueblo donde todos visten igual y hablan en un tono monótono. Cuando intentan irse, descubren que los caminos cambian a su alrededor.",
            "Una taberna se incendia y entre las cenizas se encuentra un esqueleto en una posición de rezo, como si no hubiera intentado escapar del fuego.",
            "Cada noche, una anciana camina por el pueblo llorando. Quien la siga, no regresa al amanecer.",
            "Un grupo de soldados llega a la ciudad afirmando haber regresado de la guerra, pero nadie recuerda haberlos enviado a luchar.",
            "Un noble ofrece una recompensa por recuperar a su perro de caza, pero cuando lo encuentran, la criatura ha cambiado de manera antinatural.",
            "Un cazador asegura haber visto una extraña criatura en el bosque y al día siguiente aparece su cadáver con marcas de garras imposibles de identificar.",
            "Los personajes deben escoltar a un comerciante, pero descubren que transporta un ataúd sellado con runas.",
            "Un extraño extranjero llega a la ciudad vendiendo mapas de un lugar que nadie ha visto, pero todos sienten que lo reconocen.",
            "Un anciano paga a los personajes para encontrar su anillo perdido, pero cuando lo hallan, descubren que tiene un símbolo de Tzeentch.",
            "Un caballero sin cabeza aparece cada noche en un pueblo, buscando algo que nadie conoce.",
            "Un grupo de niños desaparece cada luna llena y regresan al amanecer, pero no recuerdan dónde han estado.",
            "Los personajes encuentran una puerta de hierro en medio de un bosque, sin paredes ni edificios alrededor.",
            "Una extraña música se escucha en la ciudad todas las noches, pero nadie sabe de dónde proviene.",
            "Un cadáver aparece con una sonrisa grabada en su rostro y en su mano, un mensaje que dice ‘tú eres el siguiente’.",
            "En una aldea perdida, la gente se niega a pronunciar ciertos nombres, como si temieran ser escuchados por algo.")
        val listaPnj = listOf("Ernst Vogel, un cazador de brujas de rostro marcado por antiguas quemaduras. Paranoico y despiadado, ve la corrupción del Caos en cada sombra. Su mayor secreto: guarda un relicario con la mano momificada de una bruja a la que amaba.",
            "Madame Orlaine, una anciana vidente con ojos nublados y dedos temblorosos. Habla en susurros y nunca sonríe. Aunque la gente la respeta, su ‘don’ es una mentira bien ensayada… hasta que una noche predice algo que se cumple.",
            "Karl Dreschler, un comerciante gordo y sudoroso con dedos llenos de anillos. Su voz melosa esconde una mente fría y manipuladora. Aparenta ser un hombre de negocios honrado, pero financia secretamente bandas de bandidos.",
            "Fräulein Liesl, una posadera de cabello enmarañado y manos callosas. Maternal con los viajeros, pero feroz con los borrachos problemáticos. Esconde una daga en su corsé y no teme usarla si alguien amenaza su taberna.",
            "Bruno Gantz, un guardia de ciudad alto y delgado con un tic en el ojo izquierdo. Cumple su deber con apatía, pero en realidad está aterrado de su superior, quien sabe un oscuro secreto sobre su familia.",
            "Padre Elrich, un sacerdote de Sigmar con voz fuerte y manos nudosas. Predica sobre justicia y rectitud, pero en su celda oculta un grimorio hereje que consulta en secreto.",
            "Ulrika Jaeger, una cazadora con una cicatriz en el labio y un arco siempre a la espalda. Callada y observadora, solo sonríe cuando habla de su perro, un mastín envejecido que es su única compañía.",
            "Ludwig Rother, un noble joven de rostro perfecto y sonrisa encantadora. Siempre cortés, pero sus ojos fríos analizan a todos como si fueran piezas en un tablero de ajedrez. Su ambición es ilimitada.",
            "Greta Eisen, una alquimista de cabello blanco prematuro y manos manchadas por ácidos. Tiene una risa contagiosa, pero sus experimentos han matado a más de un aprendiz.",
            "Hans Krieg, un veterano de guerra con un brazo de madera y un parche sucio. Habla poco, bebe mucho y duerme con un cuchillo bajo la almohada. No le gusta recordar su pasado.",
            "Frau Bertha, una panadera robusta con brazos fuertes y rostro bonachón. Adora a los niños, pero odia a los mendigos. Su hijo desapareció hace años, y aún deja pan en su ventana ‘por si vuelve’.",
            "Klaus Hutter, un prestamista de rostro enjuto y mirada calculadora. Nunca olvida una deuda, nunca da segundas oportunidades. Siempre viste negro y lleva una extraña medalla que frota cuando piensa.",
            "Sybille von Dorn, una aristócrata de belleza perfecta y modales impecables. Pero sus sirvientes la evitan… dicen que nunca envejece, que su risa es hueca y que nadie ha visto su sombra.",
            "Otto Grimmel, un mendigo ciego que siempre parece saber más de lo que debería. Su túnica harapienta oculta piel cubierta de extraños tatuajes. Se ríe de la muerte, porque ‘ella aún no está lista para él’.",
            "Wilhelm Frosch, un artesano de marionetas con manos manchadas de barniz y una sonrisa torcida. Habla con sus creaciones como si fueran reales. Jura que una de ellas se mueve sola por las noches.",
            "Heinrich Stark, un barquero corpulento con brazos musculosos y una voz grave. Siempre está silbando una melodía, excepto cuando transporta cadáveres… entonces, guarda un silencio absoluto.",
            "Frau Marta, una curandera anciana con olor a hierbas y mirada penetrante. Sus remedios funcionan, pero hay quienes dicen que ha salvado a gente que debería haber muerto.",
            "Kaspar Kessler, un explorador de piel curtida por el sol y ropas raídas. Ha visto cosas en lo profundo de los bosques que nadie creería, y ya no duerme sin una antorcha encendida.",
            "Anselm Drachen, un caballero caído en desgracia. Su armadura aún brilla, pero su mirada está vacía. Perdió a su familia y ahora busca la muerte en cada batalla, aunque su código le impide rendirse.",
            "Elsa Kurtz, una violinista de cabello oscuro y expresión melancólica. Su música es hermosa, pero las canciones que toca hacen que la gente sueñe con cosas que no deberían existir.",
            "Hugo ‘Rata’ Meyer, un ladrón de dedos ágiles y una cicatriz en la mejilla. Es leal solo a quien paga bien, pero teme a los skaven porque una vez vio ‘algo’ en las alcantarillas y aún tiene pesadillas con ello.",
            "Dieter Haussmann, un herrero de brazos gruesos y voz grave. Forja armas magníficas, pero su odio hacia la nobleza lo ha llevado a fabricar cuchillos ‘especiales’ para ciertas personas.",
            "Magda Holtz, una costurera de mirada cansada y sonrisa ausente. Hace vestidos hermosos, pero nunca habla de su esposo desaparecido… ni de por qué su taller siempre huele a tierra húmeda.",
            "Gustav Lohmann, un tabernero de barriga prominente y risotada fácil. Sabe cada chisme de la ciudad, pero esconde un secreto: bajo su taberna hay un túnel que no se atreve a explorar.",
            "Lisbeth Kroll, una criada silenciosa que siempre está en el lugar correcto para escuchar conversaciones importantes. Guarda secretos de los poderosos y los vende al mejor postor.",
            "Otmar Drexler, un carnicero con delantal ensangrentado y brazos como troncos. Aparentemente amable, pero su risa se vuelve extraña cuando menciona a los cerdos.",
            "Sigfried Bauer, un marinero con un tatuaje de un kraken en el cuello. Dice haber navegado más allá de los mapas conocidos, pero si le preguntan qué vio, cambia de tema.",
            "Beatrix von Halten, una académica con lentes gruesos y ropas elegantes. Su mente brillante la hace admirada en la universidad, pero su obsesión con lo oculto la ha llevado a cruzar límites peligrosos.",
            "Gregor Weisz, un enterrador encorvado que habla en susurros. Conoce cada tumba del cementerio… y asegura que algunas están vacías cuando no deberían estarlo.",
            "Boris Klenz, un soldado retirado con una mano temblorosa y ojos que han visto demasiado. Cada vez que oye a alguien reírse demasiado fuerte, sujeta el mango de su espada.",
            "Hilda Faust, una mercader con una sonrisa confiada y un loro que repite frases en idiomas que nadie reconoce. Nadie sabe de dónde saca sus productos exóticos.",
            "Manfred ‘El Rojo’, un duelista con una capa carmesí y un parche en el ojo. Famoso por su rapidez con la espada, pero siempre deja escapar a los jóvenes que desafían su honor, como si lamentara algo.",
            "Eckhardt Voss, un noble mayor con una cojera y un aire imponente. Ama la justicia, pero su odio a la magia lo ha llevado a hacer cosas horribles en nombre de la ley.",
            "Rudolf Kain, un escriba pálido que tiembla al escribir ciertos nombres. Una vez copió un libro que no debía, y ahora alguien—o algo—lo persigue.")
        val listaEnemigo = listOf("Un hombre alto con cicatrices profundas en el rostro, lleva una capa oscura y un hacha de guerra, es líder de una banda que asola los caminos, y su único interés es la sangre y el oro,",
            "Un hombre con un rostro demente y ojos inyectados en sangre, es un psicópata que disfruta del sufrimiento ajeno, y busca crear caos en cada ciudad que visita,",
            "Un noble con armadura negra y un rostro oculto tras un casco de hierro, su castillo está rodeado por un aura de maldad, y se rumorea que su alma está perdida a causa de pactos oscuros,",
            "Un hombre que ha hecho demasiados pactos con el caos, lleva cicatrices negras en el rostro y viste una armadura oxidada, no tiene lealtades y su único objetivo es la destrucción,",
            "Un humano que una vez fue sacerdote, pero ahora se dedica a la oscuridad, su fe ha desaparecido y se encuentra vagando de un lugar a otro, buscando causar sufrimiento,",
            "Un niño de ojos completamente negros que se cree poseído por un demonio, se dice que su presencia trae desgracia y maldición a todos los que lo rodean,",
            "Un hombre pequeño, delgado, y con ojos profundos como pozos, se especializa en robar artefactos mágicos y no tiene reparos en matar por ellos,",
            "Un pequeño ser que parece un niño, pero su risa es la de un demonio, se esconde en las sombras y atrae a los desprevenidos para devorarlos,",
            "Un marinero renegado con una cicatriz en su rostro, lidera una banda de piratas que saquean pueblos costeros, siempre buscando riquezas y botines,",
            "Un ser elegante y sofisticado con ojos rojos brillantes, su voz suave y persuasiva puede convencer a cualquiera para seguirle al desastre,",
            "Un enorme monstruo humanoide con piel de escamas negras, su fuerza es impresionante y se dice que su grito puede destrozar rocas,",
            "Un caníbal que disfruta de cocinar a sus víctimas antes de devorarlas, siempre lleva consigo una gran cuchilla y un sartén ensangrentado,",
            "Un hombre con ojos inyectados en sangre que predice el futuro, sus predicciones son siempre terribles y llenas de oscuridad, como si estuviera siendo guiado por los dioses oscuros,",
            "Un bandido de mirada feroz, tiene una gran reputación como asesino a sueldo y trabaja para el mejor postor, sin importarle quién muera en el proceso,",
            "Un viejo sabio que vive en la más profunda oscuridad de un bosque, cuyas manos están manchadas de sangre, sabe más de lo que se debe sobre el caos y sus secretos más oscuros,",
            "Un hombre de rostro deformado, con dientes afilados, vive entre las ciénagas y se alimenta de carne humana, cazando a los perdidos en las nieblas,",
            "Una criatura gigante de ocho patas, mitad humana, mitad araña, se esconde en las cavernas y envenena a sus presas antes de devorarlas lentamente,",
            "Un noble decadente que busca mantener su juventud y poder a través de sacrificios humanos, su castillo está cubierto por una niebla permanente y siempre está acompañado de sus acólitos vampíricos,",
            "Un hombre delgado con una sonrisa siniestra, cocina platos tan deliciosos que una vez que los pruebas, nunca puedes dejar de desear más, incluso si eso significa unirse a su terrible festín,",
            "Un ser humanoide de gran tamaño con piel escamosa, ojos amarillos brillantes, se dice que son descendientes de antiguas razas perdidas, y su cultura es una mezcla de barbarie y magia ancestral,",
            "Un hombre que vive en la orilla del abismo, obsesionado con las voces que escucha desde el otro lado, siempre mirando al vacío, esperando el día que pueda cruzarlo,",
            "Un hombre vestido con ropas ensangrentadas, lleva símbolos oscuros y siempre está dispuesto a sacrificar a aquellos que se crucen en su camino, buscando el favor de fuerzas malignas,",
            "Un antiguo capitán de la guardia que vendió su alma a los demonios a cambio de poder, su rostro es ahora un mosaico de cicatrices y tatuajes infernales,",
            "Un hombre con ropas manchadas de sustancias extrañas, siempre hablando en acertijos y buscando la perfección en su creación de pociones y venenos,",
            "Un hombre con el poder de controlar las mentes débiles, sus ojos brillan con un resplandor hipnótico, capaz de influir en los pensamientos y decisiones de aquellos que lo rodean,",
            "Un hombre musculoso y de gran tamaño, que ha viajado por todo el mundo ganando combates a muerte y desafiando a cualquier guerrero que se le cruce,",
            "Un hombre severo con una mirada fría, mantiene a sus trabajadores bajo un control estricto y se rumorea que ha hecho un pacto con seres oscuros para aumentar su riqueza,",
            "Un anciano ciego que predice el futuro a través de sus sueños y visiones, sus consejos son enigmáticos pero siempre parecen ser exactos,",
            "Un hombre curtido por la vida en el bosque, experto en cazar y sobrevivir, su mente es fría y calculadora, y siempre tiene un plan para cada situación,",
            "Una mujer ágil con movimientos rápidos como un gato, ha robado todo tipo de riquezas y objetos de gran valor sin dejar rastro alguno,",
            "Un líder militar que ha arrasado con ciudades enteras para expandir su imperio, su ambición es tan grande como su ejército, y su hambre de poder parece insaciable,",
            "Un hombre disfrazado de comerciante que viaja por todo el mundo recolectando información para su rey, su verdadera lealtad está siempre en cuestión,",
            "Un médico que en lugar de sanar, tortura a sus pacientes en busca de nuevas formas de prolongar la vida, sus experimentos son tan atroces como efectivos,",
            "Una mujer de mirada fría y rostro pálido, que ha quedado huérfana tras la muerte de su esposo en circunstancias misteriosas, ahora busca venganza contra aquellos que la traicionaron,",
            "Un hombre que practica magia oscura y maldita, en busca de inmortalidad, ha dejado su humanidad atrás y se ha transformado en algo mucho más siniestro,",
            "Un hombre con una brutalidad inhumana que gestiona la prisión más temida del reino, donde las almas de los prisioneros languidecen bajo su cruel vigilancia,",
            "Un monje que ha abandonado sus votos de paz y ahora se dedica a la violencia, persiguiendo a aquellos que considera herejes y blasfemos,",
            "Un hombre que manipula la oscuridad para que lo sirva, rodeado de misterios y secretos oscuros que nadie se atreve a investigar,",
            "Un experto en artes oscuras y sigilosas, su único propósito es eliminar a aquellos que se interponen en su camino, sus movimientos son rápidos como un susurro,",
            "Un noble cuya sed de poder lo ha llevado a realizar pactos oscuros con seres demoníacos, su ambición por el trono es inquebrantable,",
            "Un hombre que ha dedicado su vida a erradicar a las criaturas mágicas y a los hechiceros, lo hace con un fanatismo cegador y una feroz convicción,",
            "Un hombre acusado de un crimen que no cometió, ahora se esconde entre las sombras, con un fuerte odio hacia la sociedad y todo lo que representa,",
            "Un hombre que se ofrece como sacrificio en rituales oscuros, con la esperanza de ganar favor de los dioses del caos a cambio de su vida,",
            "Un noble que perdió su fortuna en un oscuro acuerdo y ahora vive en la miseria, pero planea recuperar su poder mediante medios oscuros,",
            "Un hombre que busca propagar el sufrimiento y la agonía como una forma de adoración, sus seguidores son pocos, pero leales,",
            "Un miembro de la iglesia que se dedica a erradicar el mal y la brujería, su juicio es inflexible y sus métodos brutales,",
            "Un hombre mayor que alguna vez fue conocido por su destreza en combate, ahora busca venganza por las heridas del pasado que aún no ha podido sanar,",
            "Un asesino despiadado que se oculta entre las sombras de la ciudad, con una gran red de informantes que le permiten atacar en el momento más oportuno,",
            "Un hombre que toca una melodía dulce y cautivadora con su arpa, pero detrás de su música se ocultan terribles secretos y planes para manipular a los poderosos,",
            "Un hombre que crea monedas falsas, documentos, y todo tipo de objetos que engañan a los más ricos, es un experto en mentir y manipular,",
            "Un hombre que juró proteger a los inocentes, pero cuyas decisiones a veces lo ponen en conflicto con sus propios ideales y lo obligan a hacer cosas cuestionables,",
            "Un hombre que lidera una banda de ladrones, atacando caravanas y pueblos por igual, buscando enriquecerse y huir de la ley,",
            "Un hombre que vive de las deudas y el sufrimiento ajeno, prestando dinero a aquellos en necesidad y cobrando intereses crueles,",
            "Un noble que maneja su fortuna a través de actividades ilegales, siempre envuelto en conspiraciones y corrupción,",
            "Un hombre con una obsesión por las estrellas, y cuya constante vigilancia del cielo le ha llevado a desarrollar teorías extrañas sobre el futuro y el destino,",
            "Un hombre cuya vida ha sido marcada por una tragedia personal, y cuya venganza contra aquellos que le arrebataron todo lo que amaba le ha convertido en una máquina de dolor y sufrimiento.")
        val listaPoblacion = listOf("Una pequeña aldea situada en un valle rodeado por montañas. Sus habitantes viven en constante temor debido a las antiguas ruinas cercanas que se rumorea están malditas. El pueblo tiene un muro bajo de piedra que no detendría a un ataque serio. El cementerio es antiguo, y las tumbas parecen más antiguas que el propio pueblo,",
            "Un pueblo costero, rodeado por acantilados escarpados. La gente aquí es supersticiosa y siempre teme las tormentas repentinas que afectan la zona. El pueblo no tiene un muro, pero hay torres de vigilancia a lo largo de la costa. Hay un cementerio antiguo en la playa, donde las olas parecen susurrar por las noches,",
            "Una aldea aislada en un espeso bosque. Sus habitantes son conocidos por evitar todo contacto con el exterior y mantienen una actitud desconfiada hacia los forasteros. El pueblo tiene muros de madera y una alta cerca, pero no son suficientes para protegerlo de los peligros del bosque. El cementerio está oculto entre los árboles,",
            "Una villa al pie de una gran colina, donde los aldeanos viven de la agricultura y el pastoreo. No tiene muro, pero la colina proporciona una defensa natural. La gente es tranquila, aunque todos tienen miedo de los lamentos que se oyen desde la cima durante la noche, y su cementerio está al lado de la colina,",
            "Una población ubicada a orillas de un río, conocida por sus habitantes amables, pero profundamente supersticiosos. No tiene muro, pero sus casas están construidas de tal manera que forman una especie de fortaleza. El cementerio está cerca del río, y se cree que los espíritus de los muertos siguen las corrientes del agua,",
            "Un pueblo en una llanura donde las tormentas frecuentes hacen que los lugareños vivan con miedo constante. Los edificios están dispersos y sin un muro claro, pero las torres de vigilancia están presentes. Los aldeanos veneran a un antiguo dios de la tormenta, y su cementerio está situado en el centro del pueblo,",
            "Un pequeño pueblo fundado hace siglos por refugiados. A pesar de su crecimiento, sigue siendo un lugar humilde, rodeado de un espeso bosque que a menudo es evitado por los propios aldeanos. No tiene muro, pero la gente ha construido una cerca de madera. El cementerio está apartado en una colina solitaria,",
            "Una aldea rodeada por un vasto campo de flores silvestres, conocida por su ambiente alegre y lleno de vida. Los aldeanos son amables y siempre dispuestos a compartir, pero temen a las malas cosechas, ya que el terreno tiene fama de ser impredecible. El pueblo tiene un muro bajo de piedra, y el cementerio se encuentra en la periferia,",
            "Una ciudad amurallada donde el comercio florece, pero los habitantes siempre parecen estar en un estado de alerta. El muro está fortificado, pero los rumores de un oscuro pasado que involucra cultos secretos y sacrificios perduran. Su cementerio está bajo la protección de una iglesia antigua,",
            "Un pequeño asentamiento en una isla cerca de un archipiélago peligroso. La gente aquí es desconfiada y vive con el miedo de las criaturas que habitan las aguas cercanas. El pueblo tiene un muro de madera y una red de trampas alrededor de la costa. El cementerio está situado en la parte más alta de la isla,",
            "Un pueblo situado cerca de una gran mina. Los aldeanos han vivido del metal durante generaciones, pero temen los derrumbes. El pueblo no tiene muro, pero los edificios son compactos y seguros. El cementerio está cerca de la entrada de la mina, y la gente cree que los muertos han regresado para vengarse,",
            "Una población en la cima de un monte, conocida por su aislamiento. La gente aquí es reservada y evitan las visitas externas. No tiene muro, pero las casas están fortificadas para evitar la intromisión. El cementerio está en una llanura cercana, y hay historias de extrañas luces que emergen de él durante la noche,",
            "Un pueblo flotante construido sobre un lago profundo y misterioso. Los aldeanos dependen del agua para sobrevivir, pero temen las criaturas que habitan en las profundidades. El pueblo tiene plataformas flotantes que sirven de protección, pero no tiene muro. El cementerio se encuentra en una isla central del lago,",
            "Una aldea rodeada por un pantano espeso y oscuro. Las criaturas que habitan en la ciénaga son temidas por todos. El pueblo tiene muros de madera, pero no son suficientes para detener a los monstruos que acechan en la neblina. El cementerio está apartado, rodeado por zarzas y niebla,",
            "Una villa cerca de un bosque encantado. Sus habitantes son supersticiosos y creen que el bosque está vivo, que sus árboles susurran secretos. El pueblo tiene un muro de piedra que ha visto mejores días, y el cementerio se encuentra en un claro del bosque, donde nunca parece brillar el sol,",
            "Una ciudad con una historia oscura de traiciones y conspiraciones. Aunque tiene un muro de piedra gruesa, su ambiente está lleno de tensión. Los ciudadanos son desconfiados y temen a los nobles que han gobernado durante generaciones. El cementerio está en una zona apartada, protegida por estatuas de guerreros antiguos,",
            "Una población en una pradera abierta, donde los aldeanos están acostumbrados a vivir con las inclemencias del tiempo. No tiene muro, pero las casas están alineadas para aprovechar el viento. Aunque parece un lugar alegre, los aldeanos siempre se sienten observados desde las colinas circundantes, donde se cree que habitan espíritus antiguos,",
            "Una villa en la ladera de una montaña volcánica. El pueblo ha sobrevivido a varios desastres naturales, pero sus habitantes siempre temen la furia del volcán. El muro de la villa está desgastado por el paso del tiempo y las erupciones. El cementerio se encuentra a la sombra del volcán, donde las cenizas cubren todo,",
            "Un asentamiento en un vasto desierto, donde la gente vive con la constante amenaza de la sequía. No tiene muro, pero hay bastiones de piedra que protegen el acceso al oasis cercano. El pueblo es conocido por su clima extremadamente caluroso y su cementerio está lejos, fuera de la ciudad,",
            "Un pueblo en una isla deshabitada que ha sido reclamada por el mar. Las olas azotan las costas con furia, pero los aldeanos parecen indiferentes. No tiene muro, pero las casas están rodeadas por altos postes de madera. El cementerio está al borde de los acantilados, donde los muertos son vigilados por las olas,",
            "Una villa en un profundo cañón, donde la gente vive con la amenaza constante de deslizamientos de rocas. El pueblo está rodeado por un pequeño muro de piedra que no puede detener un colapso masivo. El cementerio está incrustado en las rocas, y los aldeanos creen que las piedras se llevan a los muertos para protegerlos,",
            "Un pueblo situado en la llanura donde las aves migratorias se reúnen. Los aldeanos viven tranquilos, pero tienen supersticiones sobre las aves que auguran tragedias. El pueblo tiene una cerca baja de madera que no es suficiente para protegerlo de los animales salvajes. El cementerio está junto al campo de aves,",
            "Un pueblo costero rodeado por aguas agitadas y tierras inestables. Las personas temen al océano y sus profundidades. Aunque no tiene muro, sus casas están construidas sobre plataformas elevadas para evitar las mareas altas. El cementerio se encuentra en una colina cercana, donde el viento sopla incesantemente,",
            "Una aldea enclavada entre una cadena montañosa. Los habitantes viven con la constante amenaza de avalanchas y deslizamientos de rocas. El pueblo tiene un muro de piedra, pero la naturaleza ha probado ser mucho más fuerte. El cementerio está cerca de la cima, donde se pueden escuchar los susurros del viento,",
            "Una villa que parece estar siempre rodeada por niebla. Los aldeanos temen que algo siniestro aceche en la bruma que nunca desaparece. La villa no tiene muro, pero las casas están alineadas en un patrón circular. El cementerio está en el centro, y se dice que los muertos nunca encuentran la paz en la niebla,",
            "Un pueblo en la orilla de un río ancho y profundo. Las casas son de barro, construidas para resistir las inundaciones, pero los aldeanos aún temen las crecidas. No tiene muro, pero las casas están elevadas. El cementerio está cerca del río, y muchos creen que las almas de los ahogados siguen nadando entre las aguas,",
            "Un pueblo construido sobre un acantilado, sus casas son frágiles pero hermosas. El pueblo está rodeado por enormes murallas de piedra, pero el abismo sigue siendo una amenaza constante. El cementerio se encuentra justo en el borde del acantilado, donde los vientos son tan fuertes que las tumbas están siempre cubiertas de polvo,")

        // elementos
        val textSemillas = findViewById<TextView>(R.id.textViewSemilla)
        val textPnj = findViewById<TextView>(R.id.textViewPnj)
        val textEnemigo = findViewById<TextView>(R.id.textViewEnemigo)
        val textPoblacion = findViewById<TextView>(R.id.textViewPoblacion)

        val botonSemilla = findViewById<Button>(R.id.botonSemilla)
        val botonPnj = findViewById<Button>(R.id.botonPnj)
        val botonEnemigo = findViewById<Button>(R.id.botonEnemigo)
        val botonPoblacion = findViewById<Button>(R.id.botonPoblacion)

        // asignamos funcionalidad a los botones
        botonSemilla.setOnClickListener { textSemillas.text = listaSemilla.random() }
        botonPnj.setOnClickListener { textPnj.text = listaPnj.random() }
        botonEnemigo.setOnClickListener { textEnemigo.text = listaEnemigo.random() }
        botonPoblacion.setOnClickListener { textPoblacion.text = listaPoblacion.random() }
    }
}



package com.example.masterhammer.Armas

import Arma
import Cualidad
import android.annotation.SuppressLint
import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masterhammer.MainActivity
import com.example.masterhammer.R

class Armas : AppCompatActivity() {

    private lateinit var spinnerTablas: Spinner
    private lateinit var spinnerTipos: Spinner
    private lateinit var recyclerView: RecyclerView
    private lateinit var dbHelper: `DbHelper-BBDD-Armas`
    private lateinit var adapter: ArmasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_armas)

        window.statusBarColor = android.graphics.Color.parseColor("#FFF5E1")
        window.decorView.systemUiVisibility = android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        val botonVolver: Button = findViewById(R.id.botonIrAMain)
        botonVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        spinnerTablas = findViewById(R.id.spinnerTablas)
        spinnerTipos = findViewById(R.id.spinnerTipos)
        recyclerView = findViewById(R.id.recyclerViewArmas)

        recyclerView.layoutManager = LinearLayoutManager(this)
        dbHelper = `DbHelper-BBDD-Armas`(this)

        // Definir las categorías de tipos de armas
        val tiposPorTabla = mapOf(
            "ArmasCuerpoACuerpo" to listOf(
                "A dos manos", "Armas de asta", "Básicas", "De caballería",
                "De esgrima", "De parada", "Mayales", "Pelea"
            ),
            "ArmasDistancia" to listOf(
                "Arcos", "Arrojadizas", "Ballestas", "Ingeniería",
                "Pólvora Negra", "Enmarañantes", "Explosivas", "Hondas"
            ),
            "Municion" to listOf(
                "De arco", "De ballesta", "De honda", "De pólvora negra e ingeniería"
            )
        )

        // Cargar las tablas en el spinner
        val tablas = listOf("ArmasCuerpoACuerpo", "ArmasDistancia", "Municion")
        val adapterTablas = ArrayAdapter(this, android.R.layout.simple_spinner_item, tablas)
        adapterTablas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTablas.adapter = adapterTablas

        // Manejar selección de tabla
        spinnerTablas.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val tablaSeleccionada = spinnerTablas.selectedItem as String
                cargarTipos(tablaSeleccionada, tiposPorTabla)
                val tipoSeleccionado = spinnerTipos.selectedItem as String
                cargarArmas(tablaSeleccionada, tipoSeleccionado)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        // Manejar selección de tipo de arma
        spinnerTipos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val tipoSeleccionado = spinnerTipos.selectedItem as String
                val tablaSeleccionada = spinnerTablas.selectedItem as String
                cargarArmas(tablaSeleccionada, tipoSeleccionado)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    // Cargar los tipos de armas segun la categoria de arma(tabla)
    private fun cargarTipos(tabla: String, tiposPorTabla: Map<String, List<String>>) {
        val tipos = tiposPorTabla[tabla] ?: emptyList()
        val adapterTipos = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipos)
        adapterTipos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTipos.adapter = adapterTipos
    }

    // tabla y tipo, metodo para combinar
    @SuppressLint("Range")
    private fun cargarArmas(tablaSeleccionada: String, tipoSeleccionado: String) {
        val armasList = mutableListOf<Arma>()
        val db = dbHelper.readableDatabase

        // Definir las consultas para tablas
        val consultaTabla = when (tablaSeleccionada) {
            "ArmasCuerpoACuerpo" -> "ArmasCuerpoACuerpo"
            "ArmasDistancia" -> "ArmasDistancia"
            "Municion" -> "Municion"
            else -> "ArmasCuerpoACuerpo"  // Default
        }

        // filtrar las armas por tipo y obtener las descripciones de las cualidades
        val cursor: Cursor = db.rawQuery(
            """
               SELECT $consultaTabla.*, Cualidades.nombre AS cualidad_nombre, Cualidades.descripcion AS cualidad_descripcion
               FROM $consultaTabla
               JOIN Relacion_${consultaTabla}_cualidades ON $consultaTabla.id = Relacion_${consultaTabla}_cualidades.arma_id
               JOIN Cualidades ON Relacion_${consultaTabla}_cualidades.cualidad_id = Cualidades.id
               WHERE $consultaTabla.tipo LIKE ?
           """.trimIndent(),
            arrayOf("%$tipoSeleccionado%")
        )

        val armasMap = mutableMapOf<Int, Arma>()

        while (cursor.moveToNext()) {
            //TABLAs de armas
            val id = cursor.getInt(cursor.getColumnIndex("id"))
            val nombre = cursor.getString(cursor.getColumnIndex("nombre"))
            val tipo = cursor.getString(cursor.getColumnIndex("tipo"))
            val precio = cursor.getString(cursor.getColumnIndex("precio"))
            val impedimenta = cursor.getInt(cursor.getColumnIndex("impedimenta"))
            val disponibilidad = cursor.getString(cursor.getColumnIndex("disponibilidad"))
            val alcance = cursor.getString(cursor.getColumnIndex("alcance"))
            val dano = cursor.getString(cursor.getColumnIndex("daño"))
            //tabla cualidades
            val cualidadNombre = cursor.getString(cursor.getColumnIndex("cualidad_nombre"))
            val cualidadDescripcion = cursor.getString(cursor.getColumnIndex("cualidad_descripcion"))

            val arma = armasMap[id] ?: Arma(nombre, tipo, precio, impedimenta, disponibilidad, alcance, dano)
            arma.cualidades.add(Cualidad(cualidadNombre, cualidadDescripcion))
            armasMap[id] = arma
        }
        cursor.close()

        // Convertir el mapa a una lista
        armasList.addAll(armasMap.values)

        // Establecer el adaptador con la lista de armas
        adapter = ArmasAdapter(armasList)
        recyclerView.adapter = adapter
    }
}
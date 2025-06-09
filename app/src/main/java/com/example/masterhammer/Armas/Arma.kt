data class Arma(
    val nombre: String,
    val tipo: String,
    val precio: String,
    val impedimenta: Int,
    val disponibilidad: String,
    val alcance: String,
    val dano: String,
    val cualidades: MutableList<Cualidad> = mutableListOf()

)


data class Cualidad(
    val nombre: String,
    val descripcion: String
)

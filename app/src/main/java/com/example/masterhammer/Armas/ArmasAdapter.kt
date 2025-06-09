package com.example.masterhammer.Armas

import Arma
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.masterhammer.R

//adapter conecta tu lista de armas con el RecyclerView para mostrar cada arma en pantalla
class ArmasAdapter(private val armasList: List<Arma>) : RecyclerView.Adapter<ArmasAdapter.ArmasViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArmasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_arma, parent, false)
        return ArmasViewHolder(view)
    }
    // ignora una advertencia de Android sobre concatenar texto directamente
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ArmasViewHolder, position: Int) {
        val arma = armasList[position]

        // declaramos cada campo de la vista con datos del arma

        holder.nombreTextView.text = arma.nombre
        holder.tipoTextView.text = "Tipo: ${arma.tipo}"
        holder.precioTextView.text = "Precio: ${arma.precio}"
        holder.impedimentaTextView.text = "Impedimenta: ${arma.impedimenta}"
        holder.disponibilidadTextView.text = "Disponibilidad: ${arma.disponibilidad}"
        holder.alcanceTextView.text = "Alcance: ${arma.alcance}"
        holder.danoTextView.text = "Daño: ${arma.dano}"

        //espacios importantes para diferenciar cada cualidad
        val cualidadesText = arma.cualidades.joinToString(separator = "\n\n") { "${it.nombre}: ${it.descripcion}" }
        holder.cualidadesTextView.text = "Cualidades:\n\n$cualidadesText"
    }

    //numero de registros en la consulta
    override fun getItemCount(): Int = armasList.size


    //guarda los datos en el item_arma
    class ArmasViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombreTextView: TextView = view.findViewById(R.id.textNombre)
        val tipoTextView: TextView = view.findViewById(R.id.textTipo)
        val precioTextView: TextView = view.findViewById(R.id.textPrecio)
        val impedimentaTextView: TextView = view.findViewById(R.id.textImpedimenta)
        val disponibilidadTextView: TextView = view.findViewById(R.id.textDisponibilidad)
        val alcanceTextView: TextView = view.findViewById(R.id.textAlcance)
        val danoTextView: TextView = view.findViewById(R.id.textDaño)
        val cualidadesTextView: TextView = view.findViewById(R.id.textCualidades)
    }
}
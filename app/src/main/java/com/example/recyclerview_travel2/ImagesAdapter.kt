package com.example.recyclerview_travel2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImagesAdapter(var items: ArrayList<CardView>) : RecyclerView.Adapter<ImagesAdapter.TarjViewHolder>() {

    /*lateinit var onClick: (View) -> Unit*/

    init {
        this.items = items
    }

    class TarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var imagen : ImageView
        private var texto : TextView

        init {
            imagen = itemView.findViewById(R.id.idImageView)
            texto = itemView.findViewById(R.id.idTextView)
        }

        /*fun bindImagen(data: CardView, onClick: (View) -> Unit) = with(itemView) {*/
            fun bindImagen(data: CardView) {
            imagen.setImageResource (data.card_imagen)
            texto.setText(data.card_nombre)

            /*setOnClickListener { onClick(itemView) }*/
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item, viewGroup, false)
        return TarjViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: TarjViewHolder, pos: Int) {
        val item = items.get(pos)
        /*viewHolder.bindImagen(item, onClick)*/
        viewHolder.bindImagen(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
package com.example.recyclerview_travel2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import org.w3c.dom.Text

class CardViewAdapter(context: Context, private val array_cards_view: ArrayList<CardView>) : ArrayAdapter<CardView>(context, R.layout.list_item, array_cards_view)
{
    private val mInflater: LayoutInflater

    init {
        this.mInflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return array_cards_view.size
    }

    override fun getItem(position: Int): CardView? {
        return array_cards_view[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        var holder: ViewHolder? = null

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null)
            holder = ViewHolder()
            holder.hNombre = convertView.findViewById(R.id.idTextView) as TextView
            holder.hImage = convertView.findViewById(R.id.idImageView) as ImageView
            convertView.tag = holder
        }
        else {
            holder = convertView!!.tag as ViewHolder?
        }
        val varCardView = getItem(position)
        holder!!.hNombre!!.setText(varCardView!!.card_nombre)
        holder!!.hImage!!.setImageResource(varCardView!!.card_imagen)
        return convertView!!
    }

    internal inner class ViewHolder {
        var hNombre: TextView? = null
        var hImage: ImageView? = null
    }
}
package com.example.recyclerview_travel2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array_cards_view = ArrayList<CardView>()
        array_cards_view.add(CardView("Card 1", R.drawable.whale))
        array_cards_view.add(CardView("Card 2",R.drawable.whale2))
        array_cards_view.add(CardView("Card 3", R.drawable.whale3))
        array_cards_view.add(CardView("Card 4", R.drawable.whale4))
        array_cards_view.add(CardView("Card 5", R.drawable.whale5))
        array_cards_view.add(CardView("Card 6", R.drawable.whale6))
        array_cards_view.add(CardView("Card 7", R.drawable.whale7))
        array_cards_view.add(CardView("Card 8", R.drawable.whale8))
        array_cards_view.add(CardView("Card 9", R.drawable.whale9))
        array_cards_view.add(CardView("Card 10", R.drawable.whale10))


        val recView = findViewById<RecyclerView>(R.id.idRecyclerView)
        recView.setHasFixedSize(true)
        val adaptador = ImagesAdapter(array_cards_view)
        recView.adapter = adaptador
        recView.layoutManager = GridLayoutManager(this, 2)
    }
}

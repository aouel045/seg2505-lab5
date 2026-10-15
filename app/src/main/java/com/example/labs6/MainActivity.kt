package com.example.labs6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Récupérer le RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // 2. Créer une liste de données
        val data = listOf(
            "January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"
        )

        // 3. Créer l’adapter
        val adapter = MyAdapter(data)

        // 4. Définir le LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 5. Associer l’adapter au RecyclerView
        recyclerView.adapter = adapter
    }
}

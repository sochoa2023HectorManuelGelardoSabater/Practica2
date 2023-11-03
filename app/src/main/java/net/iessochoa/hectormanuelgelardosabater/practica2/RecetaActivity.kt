package net.iessochoa.hectormanuelgelardosabater.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {
    private lateinit var tvDescripcionIngredientes: TextView
    private lateinit var tvTextoDescripcion: TextView
    private lateinit var tvTextoReceta: TextView

    private fun enviartexto(texto: String, tipo: String) {
        val intent = Intent(this, MostrarActivity::class.java)
        intent.putExtra(MostrarActivity.EXTRA_DATO, texto)
        intent.putExtra(MostrarActivity.EXTRA_TIPO, tipo)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        tvTextoReceta = findViewById(R.id.tvTextoReceta)
        tvTextoDescripcion = findViewById(R.id.tvTextoDescripcion)
        tvDescripcionIngredientes = findViewById(R.id.tvDescripcionIngredientes)

        tvTextoReceta.setOnClickListener { enviartexto(tvTextoReceta.text.toString(),"Receta") }
        tvTextoDescripcion.setOnClickListener { enviartexto(tvTextoDescripcion.text.toString(),"Descripcion") }
        tvDescripcionIngredientes.setOnClickListener { enviartexto(tvDescripcionIngredientes.text.toString(),"Ingredientes") }
        }
    }


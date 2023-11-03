package net.iessochoa.hectormanuelgelardosabater.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {
    private lateinit var tvDescripcionIngredientes: TextView
    private lateinit var tvTextoDescripcion: TextView
    private lateinit var tvTextoReceta: TextView
    fun enviartvTextoReceta() {
        val intent = Intent(this, MostrarActivity::class.java)
        intent.putExtra(MostrarActivity.EXTRA_DATO, tvTextoReceta.text.toString())
        startActivity(intent)
    }
    fun enviartvTextoDescripcion() {
        val intent = Intent(this, MostrarActivity::class.java)
        intent.putExtra(MostrarActivity.EXTRA_DATO, tvTextoDescripcion.text.toString())
        startActivity(intent)
    }
    fun enviartvDescripcionIngredientes() {
        val intent = Intent(this, MostrarActivity::class.java)
        intent.putExtra(MostrarActivity.EXTRA_DATO, tvDescripcionIngredientes.text.toString())
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)

        tvTextoReceta = findViewById(R.id.tvTextoReceta)
        tvTextoDescripcion = findViewById(R.id.tvTextoDescripcion)
        tvDescripcionIngredientes = findViewById(R.id.tvDescripcionIngredientes)

        tvTextoReceta.setOnClickListener {enviartvTextoReceta()}
        tvTextoDescripcion.setOnClickListener {enviartvTextoDescripcion()}
        tvDescripcionIngredientes.setOnClickListener {enviartvDescripcionIngredientes()}
    }
}


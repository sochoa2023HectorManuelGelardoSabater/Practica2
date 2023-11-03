package net.iessochoa.hectormanuelgelardosabater.practica2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MostrarActivity : AppCompatActivity() {
    companion object {
        val EXTRA_DATO = "practica2.MostrarActivity.dato"
        val EXTRA_TIPO = "practica2.MostrarActivity.tipo"
    }
    private lateinit var tvMostrarDescripcion: TextView
    private lateinit var tvMostrarTitulo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        val dato =intent.getStringExtra(EXTRA_DATO)
        tvMostrarDescripcion=findViewById(R.id.tvMostrarDescripcion)
        tvMostrarDescripcion.text= dato?.let { String.format(it) }


        val tipo =intent.getStringExtra(EXTRA_TIPO)
        tvMostrarTitulo=findViewById(R.id.tvMostrarTitulo)
        tvMostrarTitulo.text= tipo?.let { String.format(it) }

        val btVolver = findViewById<Button>(R.id.btVolver)
        btVolver.setOnClickListener {finish()}
}
}
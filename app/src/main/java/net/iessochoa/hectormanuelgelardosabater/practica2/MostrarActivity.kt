package net.iessochoa.hectormanuelgelardosabater.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MostrarActivity : AppCompatActivity() {
    companion object {
        val EXTRA_DATO = "practica2.MostrarActivity.dato"
       // val EXTRA_TIPO = "practica2.MostrarActivity.tipo"
    }
    private lateinit var tvMostrarDescripcion: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        tvMostrarDescripcion=findViewById(R.id.tvMostrarDescripcion)
       // val tipo =intent.getStringExtra(EXTRA_TIPO)
        val dato =intent.getStringExtra(EXTRA_DATO)
        tvMostrarDescripcion.text= dato?.let { String.format(it) }
       // tvMostrarDescripcion.text= tipo?.let { String.format(it) }

        val btVolver = findViewById<Button>(R.id.btVolver)
        btVolver.setOnClickListener {finish()}
}
}
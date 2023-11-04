package net.iessochoa.hectormanuelgelardosabater.practica2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    private lateinit var btReceta: Button
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Buscamos los views
        btAgenda = findViewById(R.id.btAgenda)
        // Establece un OnClickListener para el botón btAgenda
        btAgenda.setOnClickListener {
            val intent = Intent(this, AgendaActivity::class.java)
            startActivity(intent)
        }
        btReceta = findViewById(R.id.btReceta)
            // Establece un OnClickListener para el botón btReceta
            btReceta.setOnClickListener {
                val intent = Intent(this, RecetaActivity::class.java)
                startActivity(intent)
            }

    }
}
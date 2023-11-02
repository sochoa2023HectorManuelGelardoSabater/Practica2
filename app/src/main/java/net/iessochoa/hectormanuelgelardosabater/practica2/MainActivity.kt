package net.iessochoa.hectormanuelgelardosabater.practica2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btAgenda: Button
    /*fun agenda() {
//Creamos el Intent hacia SaludoActivity
        val intent = Intent(this, AgendaActivity::class.java)
//iniciamos la activity SaludoActivity
        startActivity(intent)
    }*/

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
    }
}
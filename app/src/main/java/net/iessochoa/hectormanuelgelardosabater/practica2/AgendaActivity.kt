package net.iessochoa.hectormanuelgelardosabater.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {
    private lateinit var btCancelar: Button
    private lateinit var btnAceptar: Button
    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText
    private lateinit var tvContacto: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        btCancelar = findViewById(R.id.btCancelar)
        btnAceptar = findViewById(R.id.btAceptar)
        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        tvContacto = findViewById(R.id.tvContacto)

        btCancelar.setOnClickListener() {
                finish()
        }
        btnAceptar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellido = etApellidos.text.toString()

                if (nombre.isEmpty() || apellido.isEmpty()) {
                    // Al menos uno de los campos está vacío, muestra un mensaje
                    Toast.makeText(this, "Los campos no pueden estar vacios.", Toast.LENGTH_SHORT).show()
                } else {
                    val titulo = "$nombre " + "$apellido"
                    tvContacto.text = titulo
                }
            }
        }
    }
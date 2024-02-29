package com.example.cobianproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var increasing:Boolean = true
    var cont:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtConteo = findViewById<TextView>(R.id.txtConteo)
        val btnContador = findViewById<Button>(R.id.btnCuenta)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnContador.setOnClickListener {
            if (increasing) {
                cont++
                if (cont >= 9) {
                    increasing = false
                    btnContador.text = "Decrementar"
                }
            } else {
                cont--
                if (cont <= 0) {
                    increasing = true
                    btnContador.text = "Incrementa"
                }
            }
            txtConteo.text = "$cont"
        }

        btnReset.setOnClickListener {
            cont = 0
            txtConteo.text = "$cont"
            btnContador.text = "Incrementa"
            increasing = true
        }

    }
}
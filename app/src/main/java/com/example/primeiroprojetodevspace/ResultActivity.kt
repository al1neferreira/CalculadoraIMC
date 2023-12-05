package com.example.primeiroprojetodevspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult: TextView = findViewById(R.id.textView_result)
        val tvClassificacao: TextView = findViewById(R.id.textView_classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        val classificacao =
            if (result < 18.5f) {
                "Magreza"
            } else if (result in 18.5f..24.9f) {
                "Peso normal"
            } else if (result in 25f..29.9f) {
                "Sobrepeso"
            } else if (result in 30f..34.9f) {
                "Obesidade Classe I"
            } else if (result in 35f..39.9f) {
                "Obesidade Classe II"
            } else {
                "Obesidade Classe III"
            }

        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)

        val btnReferencia: Button = findViewById(R.id.btn_referencia)

        btnReferencia.setOnClickListener {
            val intent2 = Intent(this, ReferenceTableActivity::class.java)
            startActivity(intent2)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}
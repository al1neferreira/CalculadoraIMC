package com.example.primeiroprojetodevspace


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class ReferenceTableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reference_table)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

    }

    override fun onOptionsItemSelected(item:MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
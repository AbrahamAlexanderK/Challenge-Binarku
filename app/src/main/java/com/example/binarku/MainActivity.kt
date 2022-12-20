package com.example.binarku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Tugas")

        val x = 2
        val y = 3
        val a = x + y
        val b = x - y
        val c = x * y
        val d = x / y

        println ("Penjumlahan = $a" )
        println ("Pengurangan = $b")
        println ("Perkalian = $c")
        println ("Pembagian = $d")


    }
}
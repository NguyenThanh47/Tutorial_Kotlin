package com.example.tutorial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sv1: SinhVien = SinhVien()
        sv1.HoTen = "Nguyen Dinh Thanh"
        sv1.Diachi = "Ha Nam"
        sv1.NamSinh = 1995
        Log.d("SV: ", sv1.HoTen)
    }
    // huong doi tuong trong android
}
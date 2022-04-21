package com.example.giaodienapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nutcong.setOnClickListener {
            if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString())){
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
            }else {
                var sothu1: Int = (editText1.text.toString()).toInt()
                var sothu2: Int = (editText2.text.toString()).toInt()
                var ketqua: Int = sothu1 + sothu2
                ViewKetqua.text = ketqua.toString()
            }
        }
        nuttru.setOnClickListener {
            if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString())){
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
            }else {
                var sothu1: Int = (editText1.text.toString()).toInt()
                var sothu2: Int = (editText2.text.toString()).toInt()
                var ketqua: Int = sothu1 - sothu2
                ViewKetqua.text = ketqua.toString()
            }
        }

        nutnhan.setOnClickListener {
            if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString())){
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
            }else {
                var sothu1: Int = (editText1.text.toString()).toInt()
                var sothu2: Int = (editText2.text.toString()).toInt()
                var ketqua: Int = sothu1 * sothu2
                ViewKetqua.text = ketqua.toString()
            }
        }

        nutchia.setOnClickListener {
            if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString())){
                Toast.makeText(this, "Empty field not allowed!", Toast.LENGTH_SHORT).show();
            }else {
                var sothu1: Int = (editText1.text.toString()).toInt()
                var sothu2: Int = (editText2.text.toString()).toInt()
                var ketqua: Int = sothu1 / sothu2
                ViewKetqua.text = ketqua.toString()
            }
        }

    }
}
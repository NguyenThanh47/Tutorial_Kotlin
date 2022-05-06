package com.example.quanlynhanvien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mLastClickTimeIn: Long = 0
        var mLastClickTimeUp: Long = 0

        // xu ly su kien nut dang nhap
        signIn.setOnClickListener {
            if (SystemClock.elapsedRealtime() - mLastClickTimeIn <1000)
            {
                return@setOnClickListener
            }
            else
            {
                mLastClickTimeIn = SystemClock.elapsedRealtime()
                val intent_signin: Intent = Intent(this, SignInActivity::class.java)
                startActivity(intent_signin)
            }
        }

        //xu ly su kien nut dang ky
        signUp.setOnClickListener {
            if (SystemClock.elapsedRealtime() - mLastClickTimeUp <1000)
            {
                return@setOnClickListener
            }
            else
            {
                mLastClickTimeUp = SystemClock.elapsedRealtime()
                val intent_signup: Intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent_signup)
            }
        }
    }
}
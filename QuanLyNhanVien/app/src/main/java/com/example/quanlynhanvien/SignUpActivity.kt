package com.example.quanlynhanvien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.concurrent.TimeUnit

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        dangky.setOnClickListener {
            if (TextUtils.isEmpty(newName.getText().toString()) || TextUtils.isEmpty(newPass.getText().toString()) || TextUtils.isEmpty(repeatPass.getText().toString()))
            {
                Toast.makeText(this, "Kiểm tra tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
            }
            else{
                val new_name: String = newName.text.toString()
                val new_pass: String = newPass.text.toString()
                val repeat_pass: String = repeatPass.text.toString()

                if (new_pass.length < 6 || repeat_pass.length < 6)
                {
                    Toast.makeText(this, "Mật khẩu không đúng quy định!", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    if (new_pass == repeat_pass){
                        Toast.makeText(this, "Đăng ký tài khoản mới thành công!", Toast.LENGTH_SHORT).show()
                        val intent_start: Intent = Intent(applicationContext, MainActivity::class.java)
                        Handler().postDelayed({
                            startActivity(intent_start)
                        }, 500)
                    }
                    else{
                        Toast.makeText(this, "Hai mật khẩu không giống nhau!", Toast.LENGTH_SHORT).show()
                    }
                }

//                Log.d("thanhndn","username: " + new_name)
//                Log.d("thanhndn", "size user pass: " + new_pass.length)
//                Log.d("thanhndn", "size repeat pass: " + repeat_pass.length)
            }
        }
    }
}
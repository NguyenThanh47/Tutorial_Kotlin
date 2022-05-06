package com.example.quanlynhanvien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        loginButton.setOnClickListener {
            if (TextUtils.isEmpty(inputName.getText().toString()) || TextUtils.isEmpty(inputPass.getText().toString())){
                Toast.makeText(this, "Kiểm tra tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
            }
            else{
                val user_name: String = inputName.text.toString()
                val user_pass: String = inputPass.text.toString()
                if (user_name == "thanhndn" && user_pass == "hvktqs")
                {
                    Toast.makeText(this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Vui lòng kiểm tra tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
                }
                Log.d("thanhndn","username: " + user_name)
                Log.d("thanhndn", "userpass: " + user_pass)
            }
        }
    }
}
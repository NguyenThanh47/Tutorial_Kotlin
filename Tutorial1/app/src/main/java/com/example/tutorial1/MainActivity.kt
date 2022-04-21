package com.example.tutorial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var a: String = "Nguyen Thanh"
//        println("Gia tri truoc khi chuyen: $a")
//        a.toInt()
//        println("Gia tri sau khi chuyen: $a")
//        val b: String = "Hoc vien"
        // khai bao bien co the NULL: ?
        // Khai bao bien khong the NULL: !!
//        var ten: String? = "thanh"
//        ten = null\

        //cau dieu kien
//        var a: Int = 5
//        var b: Int = 7
//        if (a>b){
//            Log.d("Logcat:","a lon hon b")
//        }
//        else if (a==b){
//            Log.d("Logcat: ", "a bang b")
//        }
//        else{
//            Log.d("logcat: ", "a nho hon b")
//        }

        //switch-case
//        var a: String = "thanh"
////        when (a){
////            "tien" -> Log.d("Logcat", "Chao tien")
////            "quang" -> Log.d("logcat", "chao quanh")
////            "son" -> Log.d("logcat", "chao son")
////            else -> Log.d("logcat", "khong co truong hop nao dung ca")
////        }

        //vong lap
//        var a: Int = 0
//        while (a < 10){
//            Log.d("logcat", "hello lan thu" + a.toString())
//            a ++
//        }

        //vong lap for
//        for (a in 0..5){
//            Log.d("logcat", "hello lan thu" + a.toString())
//        }

//        var a: Int = 20
//        for (i in 0..a step 3){
//            Log.d("logcat", "chao than ai lan thu" + i.toString())
//        }

        // mang array
//        var mangso: IntArray = intArrayOf(1,2,3,4,5,6,7)// cach 1
//        mangso.get(5)
//
//        var mangten: List<String> = listOf("nguyen", "dinh", "thanh")// cach 2
//        mangten.get(1)
//
//        //cach 3
//        var mangten1: ArrayList<String> = ArrayList()
//        //them phan tu
//        mangten1.add("thanh")
//        mangten1.add("quang")
//        mangten1.add("son")
//        // kiem tra so luong phan tu trong mang
//        mangten1.size
//        // xoa phan tu
//        mangten1.remove("quang")
//        mangten1.removeAt(0)
//        // sua gia tri trong mang
//        mangten1.set(1,"dang")
        khaibaoham("thanh", "nguyen")
    }

    // khoi tao ham
    fun khaibaoham(ten: String, Ho: String){
        Log.d("Logcat", "Ho va ten: " + Ho + ten)
    }
}
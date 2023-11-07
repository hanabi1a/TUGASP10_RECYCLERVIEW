package com.example.tugasp11_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME: Long = 2000 //durasi splash screen dalam mili detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(
            {
                startActivity(Intent (this, MainActivity::class.java))
                finish()
            }, SPLASH_TIME
        )

        //Handler().postDelayed digunakan untuk menunda eksekusi tugas di dalam blok, selama durasi yang ditentukan oleh SPLASH_TIME.
        // Pada saat eksekusi, aktivitas MainActivity akan dimulai menggunakan Intent, dan finish() digunakan untuk menutup SplashScreen,
        // sehingga pengguna tidak dapat kembali ke splash screen setelah pindah ke MainActivity.

    }
}

//Dengan cara ini, splash screen akan ditampilkan selama 2 detik (sesuai dengan nilai SPLASH_TIME),
// dan setelah itu, aplikasi akan pindah ke MainActivity.
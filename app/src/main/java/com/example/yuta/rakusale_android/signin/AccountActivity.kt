package com.example.yuta.rakusale_android.signin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yuta.rakusale_android.R

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        supportFragmentManager.beginTransaction().replace(R.id.login_fragment_container, SignInFragment()).commit()

    }
}
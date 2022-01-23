package com.example.lesson12

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, MainFragment())
            .commit()

    }
//    btnSingUp.setOnClickListener {
//        validateUserInput(navigateToInfoActivity)
//    }
//    private val navigateToInfoActivity: () -> Unit = {
//        val intent = Intent(this, InfoActivity::class.java)
//        intent.putExtra("LOGIN_EXTRA", etLogIn.text.toString())
//        intent.putExtra("PASSWORD_EXTRA", etPassword.text.toString())
//        intent.putExtra("PHONE_NUMBER_EXTRA", etPhoneNumber.text.toString())
//        startActivity(intent)
//    }
//
//    private fun validateUserInput(lambda: () -> Unit){
//        if (!etLogIn.text.isNullOrBlank() && !etPassword.text.isNullOrBlank() &&
//            !etPhoneNumber.text.isNullOrBlank()) {
//            lambda()
//        } else {
//            Toast.makeText(this, "Дозаполните поля", Toast.LENGTH_SHORT).show()
//        }
//    }
}
package com.example.lesson12

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment: Fragment(R.layout.fragment_info) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        tvLogin.text = arguments?.getString("LOGIN_EXTRA")
        tvPassword.text = arguments?.getString("PASSWORD_EXTRA")
        tvPhoneNumber.text = arguments?.getString("PHONE_NUMBER_EXTRA")
    }
}
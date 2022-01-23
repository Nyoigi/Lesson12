package com.example.lesson12

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnSingUp.setOnClickListener {
            validateUserInput(navigateToInfoActivity)
        }
    }

    private val navigateToInfoActivity: () -> Unit = {
        val bundle = Bundle()
        bundle.putString("LOGIN_EXTRA", etLogIn.text.toString())
        bundle.putString("PASSWORD_EXTRA", etPassword.text.toString())
        bundle.putString("PHONE_NUMBER_EXTRA", etPhoneNumber.text.toString())

        val infoFragment = InfoFragment()
        infoFragment.arguments = bundle

        fragmentManager?.beginTransaction()
            ?.replace(R.id.fragmentContainer, infoFragment)
            ?.commit()
    }

    private fun validateUserInput(lambda: () -> Unit) {
        if (!etLogIn.text.isNullOrBlank() && !etPassword.text.isNullOrBlank() &&
            !etPhoneNumber.text.isNullOrBlank()
        ) {
            lambda()
        } else {
            Toast.makeText(requireContext(), "Дозаполните поля", Toast.LENGTH_SHORT).show()
        }
    }
}
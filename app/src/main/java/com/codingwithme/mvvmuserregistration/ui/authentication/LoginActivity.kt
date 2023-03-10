package com.codingwithme.mvvmuserregistration.ui.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil

import androidx.lifecycle.ViewModelProvider
import com.codingwithme.mvvmuserregistration.R
import com.codingwithme.mvvmuserregistration.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() , AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


            val dataBinding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this)[AuthenticationViewModel::class.java]

        dataBinding.loginViewModel = viewModel

        viewModel.authListener = this

    }

    override fun success(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun failure(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}

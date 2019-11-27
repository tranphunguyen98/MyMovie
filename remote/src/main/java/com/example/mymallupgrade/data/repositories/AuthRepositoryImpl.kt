package com.example.mymallupgrade.data.repositories

import com.example.mymallupgrade.data.FirebaseSourceImpl
import com.example.mymallupgrade.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val firebase: FirebaseSourceImpl
) : AuthRepository {
    override fun register(email: String, password: String) =  firebase.register(email,password)
    override fun login(email: String,password: String) = firebase.login(email,password)
    override fun sendEmailResetPassword(email: String) = firebase.sendEmailResetPassword(email)
}
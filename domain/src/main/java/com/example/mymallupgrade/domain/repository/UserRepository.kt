package com.example.mymallupgrade.domain.repository

import com.example.mymallupgrade.domain.entity.User

interface UserRepository {
    fun getUser() : User

    /**
     * create new user, return id
     */
    fun createUser(user: User) : String
}
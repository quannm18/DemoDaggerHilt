package com.example.demodaggerhilt.data.api

import com.example.demodaggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}
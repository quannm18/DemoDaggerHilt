package com.example.demodaggerhilt.data.repository

import com.example.demodaggerhilt.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper)  {
    suspend fun getUsers() = apiHelper.getUsers()
}
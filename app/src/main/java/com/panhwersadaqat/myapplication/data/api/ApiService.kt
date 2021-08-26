package com.panhwersadaqat.myapplication.data.api

import com.panhwersadaqat.myapplication.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>

}
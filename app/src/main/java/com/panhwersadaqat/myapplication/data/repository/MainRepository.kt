package com.panhwersadaqat.myapplication.data.repository

import com.panhwersadaqat.myapplication.data.api.ApiHelper
import com.panhwersadaqat.myapplication.data.model.User
import io.reactivex.Single

class MainRepository (private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}
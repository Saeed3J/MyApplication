package com.example.myapplication.repo

import com.example.myapplication.data.GsonCategoryResponse
import com.example.myapplication.data.TaskCategory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
class RetrofitGsonWebService {

    private val api: RetrofitGsonApi by lazy {
        createGsonApi()
    }

    suspend fun getCategories(): ArrayList<TaskCategory> {
        return api.getCategories()
    }

    private fun createGsonApi(): RetrofitGsonApi {
        val gsonConverterFactory = GsonConverterFactory.create()

        val retrofit = Retrofit.Builder()
            .baseUrl(MainRepository.BASE_URL)
            .addConverterFactory(gsonConverterFactory)
            .build()

        return retrofit.create(RetrofitGsonApi::class.java)
    }
}
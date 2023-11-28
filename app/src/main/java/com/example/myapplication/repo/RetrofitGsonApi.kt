package com.example.myapplication.repo

import com.example.myapplication.data.GsonCategoryResponse
import com.example.myapplication.data.TaskCategory
import retrofit2.http.GET

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
interface RetrofitGsonApi {

    @GET("categories.json")
    suspend fun getCategories(): ArrayList<TaskCategory>

}
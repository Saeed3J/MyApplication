package com.example.myapplication.repo

import com.example.myapplication.data.GsonCategoryResponse
import com.example.myapplication.data.TaskCategory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
class MainRepository(

    val retrofitGsonWebService : RetrofitGsonWebService

) {

    suspend fun getRetrofitCategories(): ArrayList<TaskCategory>
            = withContext(Dispatchers.IO) {

        return@withContext retrofitGsonWebService.getCategories()
    }


    companion object {
        const val BASE_URL = "https://swensonhe-dev-challenge.s3.us-west-2.amazonaws.com/"
    }

}
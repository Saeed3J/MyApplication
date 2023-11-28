package com.example.myapplication.data

import com.google.gson.annotations.SerializedName

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
data class TaskCategory(
    @SerializedName("id") val id: String,
    @SerializedName("title") val title: String,
    @SerializedName("image") val image: String,
)
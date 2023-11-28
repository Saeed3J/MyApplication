package com.example.myapplication.data

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
data class TaskItem(
    val id: String,
    val title: String,
    val minBudget: Int,
    val maxBudget: Int,
    val avgBudget: Int,
    val image: String,
)
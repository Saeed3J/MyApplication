package com.example.myapplication.viewmodel

import android.text.method.TextKeyListener.clear
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.R
import com.example.myapplication.data.TaskCategory
import com.example.myapplication.repo.MainRepository
import com.example.myapplication.repo.RetrofitGsonWebService
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
class MainViewModel : ViewModel() {

    var taskCategoriesList: List<TaskCategory>? by mutableStateOf(null)
        private set

    private val repository = MainRepository(
        RetrofitGsonWebService()
    )

    fun updateCategories() = viewModelScope.launch {
        val response = repository.getRetrofitCategories()
        taskCategoriesList = response
    }

}
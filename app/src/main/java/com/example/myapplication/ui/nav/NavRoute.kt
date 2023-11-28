package com.example.myapplication.ui.nav

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
sealed class NavRoute (val path: String){

    object TaskCategories: NavRoute("TaskCategories")
    object DetailsCategories: NavRoute("DetailsCategories")

}
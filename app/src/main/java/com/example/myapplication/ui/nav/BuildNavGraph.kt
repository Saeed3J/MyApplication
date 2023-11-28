package com.example.myapplication.ui.nav

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.runtime.Composable
import com.example.myapplication.ui.screens.TaskCategoriesListScreen
import com.example.myapplication.viewmodel.MainViewModel

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
@Composable
fun BuildNavGraph(navController: NavHostController, viewModel: MainViewModel) {

    NavHost(
        navController = navController,
        startDestination = NavRoute.TaskCategories.path
    ) {
        addCategoriesScreen(navController, this, viewModel)
//        addTaskCategoryDetails(this, viewModel)
    }
}

fun addCategoriesScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder,
    viewModel: MainViewModel
) {

    navGraphBuilder.composable(route = NavRoute.TaskCategories.path) {
        TaskCategoriesListScreen(
            navigateToCategoryDetails = {
                navController.navigate(NavRoute.DetailsCategories.path)
            },
            viewModel = viewModel,
        )
    }
}

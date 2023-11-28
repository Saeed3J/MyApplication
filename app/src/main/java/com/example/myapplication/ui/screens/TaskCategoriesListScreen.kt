package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.R
import com.example.myapplication.viewmodel.MainViewModel

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
@Composable
fun TaskCategoriesListScreen(navigateToCategoryDetails: () -> Unit,
                             viewModel: MainViewModel) {

    Column {

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.categories_screen_title),
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
        )

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(id = R.string.categories_screen_subtitle),
            style = MaterialTheme.typography.displayMedium,
            textAlign = TextAlign.Center,
        )

        // handle selection bundle
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "-",
            style = MaterialTheme.typography.displayMedium,
            textAlign = TextAlign.Center,
        )

        if (viewModel.taskCategoriesList != null) {

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
            ) {

                items(viewModel.taskCategoriesList!!) { item ->
                    TaskCategoryItem(item)
                }
            }
        }
    }
}
package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import com.example.myapplication.R
import com.example.myapplication.data.TaskCategory

/**
 * @author : Saeed Jinat
 * created at : 2023 - 11 - 28
 */
@Composable
fun TaskCategoryItem(category: TaskCategory) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Divider(thickness = 2.dp)

        Image(
            painter = rememberAsyncImagePainter(
                ImageRequest.Builder(LocalContext.current).data(data = category.image).apply(block = fun ImageRequest.Builder.() {
                    placeholder(R.drawable.loading_animation)
                }).build()
            ),

            contentDescription = "",
            modifier = Modifier
                .size(150.dp, 150.dp)
                .clip(MaterialTheme.shapes.medium)
        )

        Text(text = category.title,
            style = MaterialTheme.typography.headlineMedium)

    }
}
package com.example.myapplication.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.nav.BuildNavGraph
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }

            setContent {
                MainScreen(viewModel())
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel) {

    MyApplicationTheme {
        val navController = rememberNavController()
        viewModel.updateCategories()
        BuildNavGraph(navController, viewModel)
    }
}

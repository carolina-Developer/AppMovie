package com.example.moviesapp.Screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviesapp.Items.dataInput
import com.example.moviesapp.Items.mainScreen
import com.example.moviesapp.Items.moviesList
import com.example.moviesapp.Model.Movie

@Composable
fun navigation() {
    val navController = rememberNavController()
    val movieList = remember { mutableStateListOf<Movie>() }

    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("mainScreen") {
            mainScreen(navController = navController)
        }
        composable("movieList") {
            moviesList(moviesList = movieList)
        }
        composable("dataInput") {
            dataInput(moviesList = movieList)
        }
    }

}
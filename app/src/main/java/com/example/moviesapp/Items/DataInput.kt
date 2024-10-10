package com.example.moviesapp.Items

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviesapp.Model.Movie

@Composable

fun dataInput(
    moviesList:MutableList<Movie>,
){
    var title by remember { mutableStateOf("") }
    var year by remember { mutableStateOf("") }
    var img by remember { mutableStateOf("") }

    Column {
        TextField(value = title, onValueChange = {title = it}, label = {Text("Title")})
        TextField(value = year, onValueChange = {year = it}, label = {Text("Year")})
        TextField(value = img, onValueChange = {img = it}, label = {Text("Img")})
        Button(onClick = {
            moviesList.add(
                Movie(
                    title = title,
                    year = year,
                    img = img
                )
            )
        }) {
            Text(text = "Add Movie")
        }

    }

}
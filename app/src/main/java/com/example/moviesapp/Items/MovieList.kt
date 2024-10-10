package com.example.moviesapp.Items

import androidx.compose.foundation.Image
import coil.compose.rememberImagePainter
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.moviesapp.Model.Movie

@Composable
fun moviesList(
    moviesList: List<Movie>
){
    var selected by remember {
        mutableStateOf<Movie?>(null)
    }
    LazyColumn {
        items(moviesList){ movie ->
            Card(
                modifier = Modifier.padding(16.dp)
            ){
                Column{
                    AsyncImage(model = movie.img, contentDescription = "Movie Image")
                    Text(text = "Title: "+movie.title)
                    Text(text = "Year: "+ movie.year)
                }
            }

        }
    }
}
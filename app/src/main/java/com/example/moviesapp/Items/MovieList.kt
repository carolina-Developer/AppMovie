package com.example.moviesapp.Items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import coil.compose.rememberImagePainter
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
    var rows by remember { mutableStateOf(listOf<List<Movie>>()) }
    rows = moviesList.chunked(3)
    LazyColumn{

        item{
            rows.forEach{ row ->
                Row{
                    row.forEach{ movie ->
                        Card(
                            modifier = Modifier
                                .width(130.dp)
                                .height(180.dp)
                                .padding(all = 12.dp)
                        ){
                            AsyncImage(model = movie.img, contentDescription = "Movie Image")
                            Text(text = "Title: "+movie.title)
                            Text(text = "Year: "+ movie.year)
                        }
                    }
                }
            }
        }
    }
}
/*
AsyncImage(model = movie.img, contentDescription = "Movie Image")
Text(text = "Title: "+movie.title)
Text(text = "Year: "+ movie.year)*/

package app.futured.academyproject.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import app.futured.academyproject.data.model.local.Place
import coil.compose.AsyncImage

object DetailedPlace {
    @Composable
    fun Content(place: Place) {
        Column() {
            Text(place.name);
            AsyncImage(model = place.image1Url, contentDescription = "Big image");
            Text(place.type);
        }
    }
}
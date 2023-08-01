package app.futured.academyproject.ui.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.futured.academyproject.data.model.local.Place
import app.futured.academyproject.tools.preview.PlacesDummyData
import coil.compose.AsyncImage

object PlaceItem {
    @Composable
    fun Content(place: Place) {
        // onclick / clickable
        val imageModifier = Modifier
            .size(49.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(BorderStroke(1.dp, Color.Black))

        Row(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            AsyncImage(model = place.image1Url, contentDescription = "Logo", modifier = imageModifier);
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(text = place.name);
                Text(place.type);
            }
        }
    }
}

@Preview
@Composable
fun PreviewItem() {
    PlaceItem.Content(place = PlacesDummyData.places[0]);
}
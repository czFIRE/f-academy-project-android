package app.futured.academyproject.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.PhoneCallback
import androidx.compose.material.icons.filled.Web
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import app.futured.academyproject.data.model.local.Place
import app.futured.academyproject.navigation.NavigationDestinations
import app.futured.academyproject.tools.arch.EventsEffect
import app.futured.academyproject.tools.arch.onEvent
import app.futured.academyproject.tools.compose.ScreenPreviews
import app.futured.academyproject.tools.extensions.accessWebIntent
import app.futured.academyproject.tools.extensions.createNavigationIntent
import app.futured.academyproject.tools.extensions.makeCallIntent
import app.futured.academyproject.tools.extensions.sendEmailIntent
import app.futured.academyproject.ui.components.Showcase
import app.futured.academyproject.ui.theme.Grid
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun DetailScreen(
    navigation: NavigationDestinations,
    viewModel: DetailViewModel = hiltViewModel(),
) {
    with(viewModel) {
        EventsEffect {
            onEvent<NavigateBackEvent> {
                navigation.popBackStack()
            }
        }

        Detail.Content(
            this,
            viewState.place,
        )
    }
}

object Detail {

    interface Actions {
        fun navigateBack()
        fun onFavorite()
    }

    object PreviewActions : Actions {
        override fun navigateBack() {}
        override fun onFavorite() {}
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Content(
        actions: Actions,
        place: Place?,
        modifier: Modifier = Modifier,
    ) {

        val context = LocalContext.current
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "DetailScreen") },
                    actions = {
                        val (iconRes, iconColor) = if (place?.isFavourite == true) {
                            Icons.Filled.Favorite to MaterialTheme.colorScheme.error
                        } else {
                            Icons.Filled.FavoriteBorder to MaterialTheme.colorScheme.onSurface
                        }

                        IconButton(onClick = actions::onFavorite) {
                            Icon(
                                imageVector = iconRes,
                                tint = iconColor,
                                contentDescription = null,
                            )
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = { actions.navigateBack() }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = null)
                        }
                    },
                )
            },
            modifier = modifier,
            floatingActionButton = {

            },
            bottomBar = {
                BottomAppBar(
                    modifier = Modifier
                        .padding(vertical = Grid.d2, horizontal = Grid.d4)
                ) {
                    FloatingActionButton(
                        onClick = {
                            context.startActivity(
                                place?.createNavigationIntent(),
                            )
                        },

                    ) {
                        Icon(painter = rememberVectorPainter(image = Icons.Filled.Navigation), contentDescription = null)
                    }

                    // Phone Icon and Intent
                    FloatingActionButton(
                        onClick = {
                            if (place?.phone != null) {
                                context.startActivity(
                                    place?.makeCallIntent(),
                                )
                            }

                        },
                        modifier = Modifier.background(color = (if (place?.phone != null) Color.Unspecified else Color.Gray))
                    ) {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Filled.PhoneCallback),
                            contentDescription = null,
                        )
                    }

                    // Email Icon and Intent
                    FloatingActionButton(
                        onClick = {
                            if (place?.email != null) {
                                context.startActivity(
                                    place?.sendEmailIntent(),
                                )
                            }
                        },
                        modifier = Modifier.background(color = (if (place?.email != null) Color.Unspecified else Color.Gray))

                    ) {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Filled.Email),
                            contentDescription = null,
                        )
                    }

                    FloatingActionButton(
                        onClick = {
                            if (place?.webUrl != null) {
                                context.startActivity(
                                    place?.accessWebIntent(),
                                )
                            }
                        },
                        modifier = Modifier.background(color = (if (place?.webUrl != null) Color.Unspecified else Color.Gray))

                    ) {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Filled.Web),
                            contentDescription = null,
                        )
                    }
                }

            },
        ) { contentPadding ->
            place?.let {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(contentPadding),
                ) {
                    Text(
                        text = place.name,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(vertical = Grid.d2, horizontal = Grid.d4)
                            .fillMaxWidth(),
                    ) {
                        // Load image using Coil
                        Image(
                            painter = rememberAsyncImagePainter(
                                ImageRequest.Builder(LocalContext.current)
                                    .data(place.image1Url)
                                    .crossfade(true)
                                    .build(),
                            ),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                        )
                    }

                    // Display the description from place.description


                    // Create a Row for phone and email icons and intents
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(vertical = Grid.d2, horizontal = Grid.d4)
                            .fillMaxWidth(),
                    ) {
                        Text(text = place.note ?: "hehe")

                    }
                }

            }
        }
    }
}

@ScreenPreviews
@Composable
fun DetailContentPreview() {
    Showcase {
        Detail.Content(
            Detail.PreviewActions,
            place = null,
        )
    }
}

package app.futured.academyproject.ui.components

import app.futured.academyproject.R
import app.futured.academyproject.ui.screens.home.HomeViewModel

data class MenuItem(
    val id: ScreensRoute,
    val textId: Int,
)

val drawerItems = listOf(
    MenuItem(ScreensRoute.SCREEN_1, R.string.screen_1),
    MenuItem(ScreensRoute.SCREEN_2, R.string.screen_2),
    MenuItem(ScreensRoute.SCREEN_3, R.string.screen_3),
    MenuItem(ScreensRoute.SCREEN_4, R.string.screen_4),
    MenuItem(ScreensRoute.SCREEN_5, R.string.screen_5),
)

enum class ScreensRoute {
    SCREEN_1, SCREEN_2, SCREEN_3, SCREEN_4, SCREEN_5
}

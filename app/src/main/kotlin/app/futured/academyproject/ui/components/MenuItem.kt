package app.futured.academyproject.ui.components

import app.futured.academyproject.R
import app.futured.academyproject.ui.screens.home.HomeViewModel

data class MenuItem(
    val id: ScreensRoute,
    val textId: Int,
    val onItemClick: (MenuItem) -> Unit,
)

val drawerItems = listOf(
    MenuItem(ScreensRoute.SCREEN_1, R.string.screen_1, { println("a") }),
    MenuItem(ScreensRoute.SCREEN_2, R.string.screen_2, { println("b") }),
    MenuItem(ScreensRoute.SCREEN_3, R.string.screen_3, { println("c") }),
)

enum class ScreensRoute {
    SCREEN_1, SCREEN_2, SCREEN_3
}

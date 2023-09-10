package app.futured.academyproject.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.futured.academyproject.ui.screens.home.HomeViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerBody(
    menuItems: List<MenuItem>,
    modifier: Modifier = Modifier,
    onItemClickFunctions: List<() -> Unit>,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(menuItems) { item ->
            DrawerItem(menuItem = item, onItemClick = onItemClickFunctions[item.id.ordinal])
        }
    }
}

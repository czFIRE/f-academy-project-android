package app.futured.academyproject.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import app.futured.academyproject.ui.theme.Grid

@Composable
fun DrawerItem(menuItem: MenuItem, modifier: Modifier = Modifier, onItemClick: () -> Unit) {
    Column(
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .padding(Grid.d4)
        ) {
            Text(
                text = stringResource(id = menuItem.textId),
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = Grid.d4)
            )
        }
        Divider()
    }
}
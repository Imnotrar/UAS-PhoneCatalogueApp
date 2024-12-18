package kelompok.tiga.phonecatalogapp.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PhoneTypeScreen(
    types: List<String>,
    onTypeSelected: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxSize()) {
        Text(
            text = "Phone Types",
            style = MaterialTheme.typography.headlineMedium
        )
        LazyColumn {
            items(types) { type ->
                TypeItem(
                    type = type,
                    onClick = { onTypeSelected(type) }
                )
            }
        }
    }
}

@Composable
fun TypeItem(
    type: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick
    ) {
        Text(text = type)
    }
}

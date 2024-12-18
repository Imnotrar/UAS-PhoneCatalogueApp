package kelompok.tiga.phonecatalogapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import kelompok.tiga.phonecatalogapp.model.Phone
import kelompok.tiga.phonecatalogapp.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhoneCatalogAppTheme {
                var currentPhone by remember { mutableStateOf<Phone?>(null) }

                if (currentPhone != null) {
                    PhoneDetailScreen(
                        phone = currentPhone!!,
                        onBackClick = { currentPhone = null } // This will clear the current phone
                    )
                } else {
                    PhoneListScreen(
                        onPhoneClick = { phone -> currentPhone = phone }
                    )
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.iphone),
                    contentDescription = null,
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .padding(dimensionResource(R.dimen.padding_small))
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PhoneCatalogAppTheme(darkTheme = false) {
        PhoneListScreen(
            onPhoneClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultDarkThemePreview() {
    PhoneCatalogAppTheme(darkTheme = true) {
        PhoneListScreen(
            onPhoneClick = {}
        )
    }
}

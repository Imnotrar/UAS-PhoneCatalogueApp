package kelompok.tiga.phonecatalogapp.data

import kelompok.tiga.phonecatalogapp.model.Phone

data class PhoneUiState(
    val phones: List<Phone> = emptyList(),
    val selectedType: String = "iPhone"
)
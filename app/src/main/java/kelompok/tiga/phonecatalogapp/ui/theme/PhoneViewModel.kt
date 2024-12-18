package kelompok.tiga.phonecatalogapp.ui.theme

import androidx.lifecycle.ViewModel
import kelompok.tiga.phonecatalogapp.data.PhoneDataSource
import kelompok.tiga.phonecatalogapp.data.PhoneUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class PhoneViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(PhoneUiState())
    val uiState: StateFlow<PhoneUiState> = _uiState

    init {
        _uiState.update { it.copy(phones = PhoneDataSource.phones) }
    }

    fun setSelectedType(type: String) {
        _uiState.update { it.copy(selectedType = type) }
    }
}

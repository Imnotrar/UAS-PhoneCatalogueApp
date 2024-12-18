package kelompok.tiga.phonecatalogapp.model

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

@SuppressLint("SupportAnnotationUsage")
data class Phone(
    val idPhone: Int,
    @StringRes val name: Int,
    val type: String,
    @DrawableRes val image: Int,
    @DrawableRes val images: List<Int>,
    val specs: PhoneSpecs,
    val isNew: Boolean
)

@SuppressLint("SupportAnnotationUsage")
data class PhoneSpecs(
    @StringRes val launch: Int,
    @StringRes val processor: Int,
    @StringRes val ram: Int,
    @StringRes val storage: Int,
    @StringRes val camera: Int,
    @StringRes val battery: Int,
    @StringRes val display: Int,
    @StringRes val os: Int,
    @StringRes val features: Int
)

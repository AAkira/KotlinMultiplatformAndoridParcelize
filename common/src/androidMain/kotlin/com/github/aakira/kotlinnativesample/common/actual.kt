package com.github.aakira.kotlinnativesample.common

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

actual interface AndroidParcel : Parcelable

actual typealias AndroidParcelize = kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val id: Int,
    val name: String,
    val email: String
) : Parcelable

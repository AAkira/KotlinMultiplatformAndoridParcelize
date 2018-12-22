package com.github.aakira.kotlinnativesample.common.model

import com.github.aakira.kotlinnativesample.common.AndroidParcel
import com.github.aakira.kotlinnativesample.common.AndroidParcelize
import kotlinx.serialization.Serializable

@Serializable
@AndroidParcelize
data class User(
    val id: Int,
    val name: String,
    val email: String
) : AndroidParcel

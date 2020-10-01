package com.sibelyildiz.muticampchallenge.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Links(
    val instagram: String,
    val twitter: String,
    val youtube: String,
    val participation: String
)
package com.sibelyildiz.muticampchallenge.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Leader(
    val name: String,
    val photo: String
)
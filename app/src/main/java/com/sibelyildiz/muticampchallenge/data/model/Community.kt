package com.sibelyildiz.muticampchallenge.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Community(
    val name: String,
    val description: String,
    val banner: String,
    val leader: Leader,
    val links: Links
)
package com.sibelyildiz.muticampchallenge.data


import com.sibelyildiz.muticampchallenge.data.model.Community
import retrofit2.http.GET

interface CommunityApi {
    @GET("communities")
    suspend fun getCommunity(): List<Community>
} 
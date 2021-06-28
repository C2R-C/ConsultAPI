package com.c2r.consultapi.repository.webservices

import com.c2r.consultapi.data.model.DogList
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServices {

    @GET("breeds")
    suspend fun getBreedDogs(@Query("x-api-key") key : String): DogList
}
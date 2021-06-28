package com.c2r.consultapi.repository

import com.c2r.consultapi.data.model.DogList

interface DogRepository {

    suspend fun getBreedDogs() : DogList
}
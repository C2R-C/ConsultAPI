package com.c2r.consultapi.data.remote

import com.c2r.consultapi.BuildConfig
import com.c2r.consultapi.data.model.DogList
import com.c2r.consultapi.repository.webservices.WebServices

class DogDataSource(private val webService: WebServices) {

   suspend fun getBreedDogs(): DogList = webService.getBreedDogs(BuildConfig.API_KEY)
}
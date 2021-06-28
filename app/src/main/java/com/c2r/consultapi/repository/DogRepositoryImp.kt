package com.c2r.consultapi.repository

import com.c2r.consultapi.data.model.DogList
import com.c2r.consultapi.data.remote.DogDataSource

class DogRepositoryImp(val dataSource: DogDataSource): DogRepository{

    override suspend fun getBreedDogs(): DogList = dataSource.getBreedDogs()

}
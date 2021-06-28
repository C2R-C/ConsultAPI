package com.c2r.consultapi.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.c2r.consultapi.core.Resource
import com.c2r.consultapi.repository.DogRepository
import kotlinx.coroutines.Dispatchers

class DogViewModel(private val repo: DogRepository) : ViewModel() {

    fun fetchBreedDogs() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getBreedDogs()))
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
}
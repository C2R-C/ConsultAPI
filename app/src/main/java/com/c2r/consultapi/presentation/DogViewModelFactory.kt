package com.c2r.consultapi.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.c2r.consultapi.repository.DogRepository

class DogViewModelFactory(private val repo: DogRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(DogRepository::class.java).newInstance(repo)
    }
}
package com.c2r.consultapi.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.c2r.consultapi.R
import com.c2r.consultapi.core.Resource
import com.c2r.consultapi.data.remote.DogDataSource
import com.c2r.consultapi.databinding.FragmentDogBinding
import com.c2r.consultapi.presentation.DogViewModel
import com.c2r.consultapi.presentation.DogViewModelFactory
import com.c2r.consultapi.repository.DogRepositoryImp
import com.c2r.consultapi.repository.webservices.RetrofitClient


class DogFragment : Fragment(R.layout.fragment_dog) {

    private lateinit var binding: FragmentDogBinding
    private val viewModel by viewModels<DogViewModel> {
        DogViewModelFactory(
            DogRepositoryImp(
                DogDataSource(RetrofitClient.webservice)
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDogBinding.bind(view)

        viewModel.fetchBreedDogs().observe(viewLifecycleOwner, {
            when (it) {
                is Resource.Loading -> {
                    Log.d("DOG", "LOADING")
                }
                is Resource.Success -> {
                    Log.d("DOG", "${it.data}")
                }
                is Resource.Failure -> {
                    Log.d("DOG", "${it.exception}")
                }
            }
        })
    }
}
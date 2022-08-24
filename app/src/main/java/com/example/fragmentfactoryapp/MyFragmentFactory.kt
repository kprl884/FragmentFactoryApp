package com.example.fragmentfactoryapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

class MyFragmentFactory @Inject constructor(
    private val carRepository: CarRepository,
    private val bikeRepository: BikeRepository
    ) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment =
        when (loadFragmentClass(classLoader, className)) {
            CarFragment::class.java -> CarFragment(carRepository)
            BikeFragment::class.java -> BikeFragment(bikeRepository)
            else -> super.instantiate(classLoader, className)
        }
}
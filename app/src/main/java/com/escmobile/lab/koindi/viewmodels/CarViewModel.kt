package com.escmobile.lab.koindi.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.escmobile.lab.koindi.business.state.ChangeStateResponse
import com.escmobile.lab.koindi.model.Car
import org.koin.core.KoinComponent
import org.koin.core.inject

class CarViewModel : KoinComponent, ViewModel() {

    private val car: Car by inject()

    val carResponse = MutableLiveData<ChangeStateResponse>()

    fun onStartClick() {
        carResponse.postValue(car.start())
    }

    fun onStopClick() {
        carResponse.postValue(car.stop())
    }

    fun onDriveClick() {
        carResponse.postValue(car.drive())
    }

    fun onBrakeClick() {
        carResponse.postValue(car.brake())
    }

    fun onParkClick() {
        carResponse.postValue(car.park())
    }
}
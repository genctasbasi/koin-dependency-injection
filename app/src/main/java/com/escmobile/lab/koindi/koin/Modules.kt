package com.escmobile.lab.koindi.koin

import com.escmobile.lab.koindi.business.*
import com.escmobile.lab.koindi.business.state.StateController
import com.escmobile.lab.koindi.model.Car
import com.escmobile.lab.koindi.model.Engine
import com.escmobile.lab.koindi.model.Pedal
import com.escmobile.lab.koindi.model.Transmission
import com.escmobile.lab.koindi.viewmodels.CarViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val carModule = module {
    single(createdAtStart = true) { StateController() }
    single<Engine>(createdAtStart = true) { EngineImpl(get()) }
    single<Pedal>(createdAtStart = true) { PedalImpl(get()) }
    single<Transmission>(createdAtStart = true) { TransmissionImpl(get()) }
    single<Car> { CarImpl(get(), get(), get()) }

    viewModel { CarViewModel() }
}
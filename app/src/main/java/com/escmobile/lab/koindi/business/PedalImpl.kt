package com.escmobile.lab.koindi.business

import com.escmobile.lab.koindi.business.state.ChangeStateResponse
import com.escmobile.lab.koindi.business.state.StateController
import com.escmobile.lab.koindi.model.CarState
import com.escmobile.lab.koindi.model.Pedal

class PedalImpl(private val stateController: StateController) : Pedal {
    override fun brake(): ChangeStateResponse {
        return stateController.setState(CarState.OnBrake)
    }

    override fun accelerate(): ChangeStateResponse {
        return stateController.setState(CarState.Moving)
    }
}
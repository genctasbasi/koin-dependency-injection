package com.escmobile.lab.koindi.business

import com.escmobile.lab.koindi.business.state.ChangeStateResponse
import com.escmobile.lab.koindi.business.state.StateController
import com.escmobile.lab.koindi.model.CarState
import com.escmobile.lab.koindi.model.Transmission

class TransmissionImpl(private val stateController: StateController) : Transmission {
    override fun park(): ChangeStateResponse {
        return stateController.setState(CarState.Park)
    }

    override fun drive(): ChangeStateResponse {
        return stateController.setState(CarState.Moving)
    }
}
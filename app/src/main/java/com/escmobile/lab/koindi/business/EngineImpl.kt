package com.escmobile.lab.koindi.business

import com.escmobile.lab.koindi.business.state.ChangeStateResponse
import com.escmobile.lab.koindi.business.state.StateController
import com.escmobile.lab.koindi.model.CarState
import com.escmobile.lab.koindi.model.Engine

class EngineImpl(private val stateController: StateController) : Engine {
    override fun start(): ChangeStateResponse {
        return stateController.setState(CarState.Started)
    }

    override fun stop(): ChangeStateResponse {
        return stateController.setState(CarState.Off)
    }
}
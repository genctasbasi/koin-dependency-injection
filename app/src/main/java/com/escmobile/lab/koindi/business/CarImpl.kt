package com.escmobile.lab.koindi.business

import com.escmobile.lab.koindi.business.state.ChangeStateResponse
import com.escmobile.lab.koindi.model.Car
import com.escmobile.lab.koindi.model.Engine
import com.escmobile.lab.koindi.model.Pedal
import com.escmobile.lab.koindi.model.Transmission

class CarImpl(
    private val engine: Engine,
    private val transmission: Transmission,
    private val pedal: Pedal
) : Car {

    override fun start(): ChangeStateResponse {
        return engine.start()
    }

    override fun stop(): ChangeStateResponse {
        return engine.stop()
    }

    override fun brake(): ChangeStateResponse {
        return pedal.brake()
    }

    override fun accelerate(): ChangeStateResponse {
        return pedal.accelerate()
    }

    override fun drive(): ChangeStateResponse {
        return transmission.drive()
    }

    override fun park(): ChangeStateResponse {
        return transmission.park()
    }
}
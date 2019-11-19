package com.escmobile.lab.koindi.model

import com.escmobile.lab.koindi.business.state.ChangeStateResponse

interface Pedal {
    fun brake(): ChangeStateResponse
    fun accelerate(): ChangeStateResponse
}
package com.escmobile.lab.koindi.model

import com.escmobile.lab.koindi.business.state.ChangeStateResponse

interface Car {
    fun start(): ChangeStateResponse
    fun stop(): ChangeStateResponse
    fun drive(): ChangeStateResponse
    fun brake(): ChangeStateResponse
    fun accelerate(): ChangeStateResponse
    fun park(): ChangeStateResponse
}
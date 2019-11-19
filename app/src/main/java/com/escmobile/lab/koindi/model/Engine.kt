package com.escmobile.lab.koindi.model

import com.escmobile.lab.koindi.business.state.ChangeStateResponse

interface Engine {
    fun start(): ChangeStateResponse
    fun stop(): ChangeStateResponse
}
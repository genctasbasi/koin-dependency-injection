package com.escmobile.lab.koindi.model

import com.escmobile.lab.koindi.business.state.ChangeStateResponse

interface Transmission {
    fun park(): ChangeStateResponse
    fun drive(): ChangeStateResponse
}
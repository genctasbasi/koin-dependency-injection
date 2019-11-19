package com.escmobile.lab.koindi.business.state

import com.escmobile.lab.koindi.model.CarState

data class ChangeStateResponse(
    var state: CarState,
    var isSucceed: Boolean,
    var message: String
)
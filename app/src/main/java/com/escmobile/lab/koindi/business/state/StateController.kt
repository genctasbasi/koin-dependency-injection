package com.escmobile.lab.koindi.business.state

import com.escmobile.lab.koindi.model.CarState

class StateController {
    private var state: CarState = CarState.Off

    fun setState(toState: CarState): ChangeStateResponse {
        return when (state) {
            CarState.Off -> fromOff(toState)
            CarState.Started -> fromStarted(toState)
            CarState.Park -> fromPark(toState)
            CarState.OnBrake -> fromOnBrake(toState)
            CarState.Moving -> fromMoving(toState)
        }
    }

    private fun fromOff(toState: CarState): ChangeStateResponse {
        return when (toState) {
            CarState.Off -> ChangeStateResponse(state, false, "Invalid state: Already off.")
            CarState.Started -> {
                state = toState
                ChangeStateResponse(state, true, "Engine started.")
            }
            CarState.Park -> ChangeStateResponse(state, false, "Invalid state: Engine is off.")
            CarState.OnBrake -> ChangeStateResponse(state, false, "Invalid state: Engine off.")
            CarState.Moving -> ChangeStateResponse(state, false, "Invalid state: Engine off.")
        }
    }

    private fun fromStarted(toState: CarState): ChangeStateResponse {
        return when (toState) {
            CarState.Off -> {
                state = toState
                ChangeStateResponse(state, true, "Engine stopped.")
            }

            CarState.Started -> ChangeStateResponse(
                state,
                false,
                "Invalid state: Engine already started."
            )

            CarState.Park -> {
                state = toState
                ChangeStateResponse(state, true, "Parked.")
            }
            CarState.OnBrake -> ChangeStateResponse(state, false, "Invalid state: Not moving.")

            CarState.Moving -> {
                state = toState
                ChangeStateResponse(state, true, "Moving.")
            }
        }
    }

    private fun fromPark(toState: CarState): ChangeStateResponse {
        return when (toState) {
            CarState.Off -> {
                state = toState
                ChangeStateResponse(state, true, "Engine stopped.")
            }
            CarState.Started -> ChangeStateResponse(
                state,
                false,
                "Invalid state: Engine already started."
            )
            CarState.Park -> ChangeStateResponse(state, false, "Invalid state: Already parked.")
            CarState.OnBrake -> ChangeStateResponse(state, false, "Invalid state: Not moving.")
            CarState.Moving -> {
                state = toState
                ChangeStateResponse(state, true, "Moving.")
            }
        }
    }

    private fun fromOnBrake(toState: CarState): ChangeStateResponse {
        return when (toState) {
            CarState.Off -> {
                state = toState
                ChangeStateResponse(state, true, "Engine stopped.")
            }
            CarState.Started -> ChangeStateResponse(
                state,
                false,
                "Invalid state: Engine already started."
            )
            CarState.Park -> {
                state = toState
                ChangeStateResponse(state, true, "Parked.")
            }
            CarState.OnBrake -> ChangeStateResponse(state, false, "Invalid state: Not moving.")
            CarState.Moving -> {
                state = toState
                ChangeStateResponse(state, true, "Moving.")
            }
        }
    }

    private fun fromMoving(toState: CarState): ChangeStateResponse {
        return when (toState) {
            CarState.Off -> ChangeStateResponse(state, false, "Invalid state: Park first.")
            CarState.Started -> ChangeStateResponse(
                state,
                false,
                "Invalid state: Engine already started."
            )
            CarState.Park -> ChangeStateResponse(state, false, "Invalid state: Brake first.")

            CarState.OnBrake -> {
                state = toState
                ChangeStateResponse(state, true, "On brakes.")
            }

            CarState.Moving -> ChangeStateResponse(state, false, "Invalid state: Already moving.")
        }
    }
}
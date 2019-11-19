package com.escmobile.lab.koindi

import com.escmobile.lab.koindi.business.state.StateController
import com.escmobile.lab.koindi.model.CarState
import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class StateControllerTest {

    lateinit var stateController: StateController

    @Before
    fun setup() {
        stateController = StateController()
    }

    @Test
    fun `From Off state changes are valid`() {

        // Act
        val response1 = stateController.setState(CarState.Off)
        val response2 = stateController.setState(CarState.Park)
        val response3 = stateController.setState(CarState.OnBrake)
        val response4 = stateController.setState(CarState.Moving)
        val response5 = stateController.setState(CarState.Started)

        // Assert
        assertFalse(response1.isSucceed)
        assertFalse(response2.isSucceed)
        assertFalse(response3.isSucceed)
        assertFalse(response4.isSucceed)

        assertTrue(response5.isSucceed)
    }

    // TODO: More to add
}

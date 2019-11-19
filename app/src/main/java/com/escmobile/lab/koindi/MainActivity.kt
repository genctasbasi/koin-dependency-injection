package com.escmobile.lab.koindi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.escmobile.lab.koindi.viewmodels.CarViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val viewModel: CarViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener { viewModel.onStartClick() }
        stop.setOnClickListener { viewModel.onStopClick() }
        drive.setOnClickListener { viewModel.onDriveClick() }
        brake.setOnClickListener { viewModel.onBrakeClick() }
        park.setOnClickListener { viewModel.onParkClick() }

        viewModel.carResponse.observe(this, androidx.lifecycle.Observer {
            car_state.text = it.state.toString()
            log.text = it.message
        })
    }
}

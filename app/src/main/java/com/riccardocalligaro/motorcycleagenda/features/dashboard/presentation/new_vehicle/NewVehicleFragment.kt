package com.riccardocalligaro.motorcycleagenda.features.dashboard.presentation.new_vehicle

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.riccardocalligaro.motorcycleagenda.R

class NewVehicleFragment : Fragment() {

    companion object {
        fun newInstance() = NewVehicleFragment()
    }

    private lateinit var viewModel: NewVehicleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.new_vehicle_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NewVehicleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

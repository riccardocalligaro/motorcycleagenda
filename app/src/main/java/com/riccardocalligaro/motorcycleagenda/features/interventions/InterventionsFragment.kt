package com.riccardocalligaro.motorcycleagenda.features.interventions

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.riccardocalligaro.motorcycleagenda.R

class InterventionsFragment : Fragment() {

    companion object {
        fun newInstance() = InterventionsFragment()
    }

    private lateinit var viewModel: InterventionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.interventions_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InterventionsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

package com.prilepskiy_ae.ui.info

import com.prilepskiy_ae.databinding.FragmentInfoBinding

import com.prilepskiy_ae.ui.base.FragmentBaseMVVM
import com.prilepskiy_ae.ui.base.viewBinding

import org.koin.androidx.viewmodel.ext.android.viewModel


class InfoFragment : FragmentBaseMVVM<InfoViewModel, FragmentInfoBinding>() {

    override val binding: FragmentInfoBinding by viewBinding()
    override val viewModel: InfoViewModel by viewModel()
    override fun onEach() {
        onEach(viewModel.data){
            binding.EncriptValue.text=it
        }
    }

    override fun onView() {
        viewModel.getData()
    }
    override fun onViewClick() {
      binding.buttonOk.setOnClickListener {
          popBackStack()
      }
    }

}
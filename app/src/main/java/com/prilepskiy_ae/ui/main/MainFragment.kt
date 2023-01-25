package com.prilepskiy_ae.ui.main


import android.view.View
import com.prilepskiy_ae.R
import com.prilepskiy_ae.databinding.FragmentMainBinding
import com.prilepskiy_ae.ui.base.FragmentBaseMVVM
import com.prilepskiy_ae.ui.base.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : FragmentBaseMVVM<MainViewModel, FragmentMainBinding>() {

    override val binding: FragmentMainBinding by viewBinding()
    override val viewModel: MainViewModel by viewModel()
    override fun onViewClick() {
        with(binding) {
            encriptTestButtom.setOnClickListener {
                if (!editEncryptValue.text.toString().isNullOrEmpty()) {
                    viewModel.saveData(editEncryptValue.text.toString())
                    textErrorMessage.visibility = View.INVISIBLE
                    navigateFragment(R.id.action_mainFragment_to_infoFragment)
                } else {
                    textErrorMessage.visibility = View.VISIBLE
                    textErrorMessage.text = getString(R.string.error_message)
                }
            }
        }
    }

}
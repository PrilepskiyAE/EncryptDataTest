package com.prilepskiy_ae.ui.info

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prilepskiy_ae.domain.interactor.GetDataUseCase
import com.prilepskiy_ae.ui.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class InfoViewModel(private val getDataUseCase: GetDataUseCase): BaseViewModel() {

    private val _data: MutableStateFlow<String?> by lazy { MutableStateFlow(null) }
    val data=_data.asStateFlow()

    fun getData(){
        viewModelScope.launch {
            val res=getDataUseCase.invoke()
            _data.emit(res)
        }

    }
}
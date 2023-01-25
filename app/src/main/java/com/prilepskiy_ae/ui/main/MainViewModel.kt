package com.prilepskiy_ae.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.prilepskiy_ae.domain.interactor.SetDataUseCase
import com.prilepskiy_ae.ui.base.BaseViewModel
import kotlinx.coroutines.launch

class MainViewModel(private val setDataUseCase: SetDataUseCase): BaseViewModel(){
    fun saveData(data:String){
        viewModelScope.launch {
            setDataUseCase.invoke(data)
        }
    }

}
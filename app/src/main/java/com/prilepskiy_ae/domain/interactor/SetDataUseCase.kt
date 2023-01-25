package com.prilepskiy_ae.domain.interactor

interface SetDataUseCase {
    suspend fun invoke(data:String)
}
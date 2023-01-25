package com.prilepskiy_ae.domain.interactor

interface GetDataUseCase {
    suspend fun invoke():String
}
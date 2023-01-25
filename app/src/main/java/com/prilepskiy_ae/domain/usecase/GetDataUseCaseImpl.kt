package com.prilepskiy_ae.domain.usecase

import com.prilepskiy_ae.domain.interactor.GetDataUseCase
import com.prilepskiy_ae.domain.repository.FileRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetDataUseCaseImpl(private val fileRepository: FileRepository):GetDataUseCase {
    override suspend fun invoke(): String = withContext(Dispatchers.IO){
        return@withContext fileRepository.getData()
    }
}
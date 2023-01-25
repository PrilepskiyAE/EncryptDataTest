package com.prilepskiy_ae.domain.usecase

import com.prilepskiy_ae.domain.interactor.SetDataUseCase
import com.prilepskiy_ae.domain.repository.FileRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SetDataUseCaseImpl(private val fileRepository: FileRepository) : SetDataUseCase {
    override suspend fun invoke(data: String) = withContext(Dispatchers.IO) {
        fileRepository.setData(data)
    }
}
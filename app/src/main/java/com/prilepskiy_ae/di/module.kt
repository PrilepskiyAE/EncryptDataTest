package com.prilepskiy_ae.di

import com.prilepskiy_ae.data.dataservice.PreferenceEncryptService
import com.prilepskiy_ae.data.dataservice.PreferenceEncryptServiceImpl
import com.prilepskiy_ae.data.repository.FileRepositoryImpl
import com.prilepskiy_ae.domain.interactor.GetDataUseCase
import com.prilepskiy_ae.domain.interactor.SetDataUseCase
import com.prilepskiy_ae.domain.repository.FileRepository
import com.prilepskiy_ae.domain.usecase.GetDataUseCaseImpl
import com.prilepskiy_ae.domain.usecase.SetDataUseCaseImpl
import com.prilepskiy_ae.ui.info.InfoViewModel
import com.prilepskiy_ae.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoryModule = module {
    single<FileRepository> { FileRepositoryImpl(get()) }
}
val storageModule= module {
    single<PreferenceEncryptService> { PreferenceEncryptServiceImpl(get())}
}

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
    viewModel { InfoViewModel(get())}
}
val useCaseModule = module {
    single<GetDataUseCase>{ GetDataUseCaseImpl(get()) }
    single<SetDataUseCase>{ SetDataUseCaseImpl(get()) }
}



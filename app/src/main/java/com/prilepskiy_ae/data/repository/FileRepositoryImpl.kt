package com.prilepskiy_ae.data.repository

import androidx.security.crypto.EncryptedSharedPreferences
import com.prilepskiy_ae.data.dataservice.PreferenceEncryptService
import com.prilepskiy_ae.domain.repository.FileRepository

class FileRepositoryImpl(private val preferences: PreferenceEncryptService):FileRepository {
    override suspend fun getData(): String {
        return preferences.getData()?:""
    }

    override suspend fun setData(data: String) {
        preferences.setData(data)
    }
}
package com.prilepskiy_ae.domain.repository

import java.util.concurrent.Flow

interface FileRepository {
    suspend fun getData():String
    suspend fun setData(data:String)
}
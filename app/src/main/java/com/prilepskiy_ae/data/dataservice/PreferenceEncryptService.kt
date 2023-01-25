package com.prilepskiy_ae.data.dataservice

interface PreferenceEncryptService {
    fun getData():String?
    fun setData(data: String)
}
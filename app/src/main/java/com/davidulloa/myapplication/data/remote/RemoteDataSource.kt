package com.davidulloa.myapplication.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val dataService :DataService
): BaseService() {

    suspend fun getData() = getDataResult{ dataService.getData()}
}
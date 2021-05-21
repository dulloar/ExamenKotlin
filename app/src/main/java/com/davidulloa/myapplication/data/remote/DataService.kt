package com.davidulloa.myapplication.data.remote

import com.davidulloa.myapplication.data.models.Data
import com.davidulloa.myapplication.data.models.ResponseData
import retrofit2.Response
import retrofit2.http.GET

interface DataService {
    @GET("s/5u21281sca8gj94/getFile.json?dl=0")
    suspend fun getData(): Response<ResponseData>
}
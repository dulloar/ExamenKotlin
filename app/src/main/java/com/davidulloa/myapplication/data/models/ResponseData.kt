package com.davidulloa.myapplication.data.models

import com.google.gson.annotations.SerializedName

data class ResponseData (
    @SerializedName("data") val data : Data,
    @SerializedName("code") val code : Int,
    @SerializedName("success") val success : Boolean
)
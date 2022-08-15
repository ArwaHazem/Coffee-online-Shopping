package com.example.bmprojecttrial.dataclasses

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("email") val email:String,
    @SerializedName("password") val password:String
)

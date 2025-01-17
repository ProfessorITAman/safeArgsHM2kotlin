package com.example.safeargshm2kotlin
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name : String ="Aman",
    val email : String= "femboyfurry@gmail.com",
    val password : String ="202005"
):Parcelable

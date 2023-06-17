package com.uj47.tvshow.common

import android.util.Log

fun errorExtention(code: Int):String{
    val errorMessage = when (code) {
        400 -> "Unauthorized!"
        404 -> "Not found!"
        500 -> "Internal server error!"
        else -> "Error unknown!"
    }
    return errorMessage
}

fun logView(name:String, values:String){
    Log.i(name,values)
}
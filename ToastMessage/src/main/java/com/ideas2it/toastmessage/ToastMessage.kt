package com.ideas2it.toastmessage

import android.content.Context
import android.widget.Toast

public open class ToastMessage {
    fun message( context: Context,message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
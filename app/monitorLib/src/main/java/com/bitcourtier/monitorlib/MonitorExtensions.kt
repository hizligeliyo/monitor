package com.bitcourtier.monitorlib

import android.content.Context

inline fun safeFun(c: Context, f: () -> Unit) {
    try {
        f()
    } catch (e: Exception) {
        try {
            e.printStackTrace()
        } catch (e2: java.lang.Exception) {
            e2.printStackTrace()
        }
    }
}

package com.bitcourtier.monitorlib

import android.content.Context

/**
 * Created by Sefa TOMBUL on 6.12.2022
 **/

object MonitorHelper {
    fun safeCall(c: Context, f: () -> Unit) {
        safeFun(c, f)
    }
}
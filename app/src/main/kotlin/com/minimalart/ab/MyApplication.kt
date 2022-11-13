
package com.minimalart.ab

import android.app.Application

// TODO: Remove comment marks to enable
// import com.onesignal.OneSignal

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // TODO: Remove comment marks to enable
        /*
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init()
                */
    }
}
package com.pusher.chatkit

import com.pusher.chatkit.pushnotifications.PushNotificationsFactory
import com.pusher.platform.PlatformDependencies
import com.pusher.platform.tokenProvider.TokenProvider
import okhttp3.OkHttpClient

interface ChatkitDependencies : PlatformDependencies {
    val tokenProvider: TokenProvider
    val okHttpClient: OkHttpClient?
    val appHooks: AppHookEmitter
    val pushNotifications: PushNotificationsFactory?
}

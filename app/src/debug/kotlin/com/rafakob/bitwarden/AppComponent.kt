package com.rafakob.bitwarden

import com.rafakob.bitwarden.crypto.CryptoModule
import com.rafakob.bitwarden.environment.EnvironmentModule
import com.rafakob.bitwarden.rest.NetworkModule
import com.rafakob.bitwarden.rest.RestModule
import com.rafakob.bitwarden.scope.AppScope
import com.rafakob.bitwarden.startup.StartupBindingModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScope
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        CryptoModule::class,
        StartupBindingModule::class,
        EnvironmentModule::class,
        NetworkModule::class,
        RestModule::class
    ]
)
interface AppComponent : AndroidInjector<BitwardenApplication> {
    @Component.Factory
    interface Factory : AndroidInjector.Factory<BitwardenApplication>
}
package com.rafakob.bitwarden.rest.api

import io.reactivex.Completable

interface BitwardenApi {
    fun preLogin(email: String): Completable
}
package com.rafakob.bitwarden.startup

import com.rafakob.bitwarden.base.BasePresenter

internal interface StartupContract {
    interface View

    abstract class Presenter : BasePresenter()
}
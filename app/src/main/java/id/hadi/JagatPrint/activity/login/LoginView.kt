package id.hadi.catatanpenjualan.activity.login

import id.hadi.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}
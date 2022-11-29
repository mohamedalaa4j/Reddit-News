package com.grand.redditnews.viewModel

import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class SCActivityVM : ViewModel() {

    var startMainActivity = MutableStateFlow(false)

    fun delay() {

        Handler(Looper.getMainLooper()).postDelayed({

            viewModelScope.launch {
                startMainActivity.emit(true)
            }

        }, 2500)
    }

    fun disableNightMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

}
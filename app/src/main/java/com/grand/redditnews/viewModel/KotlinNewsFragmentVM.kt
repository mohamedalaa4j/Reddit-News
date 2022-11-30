package com.grand.redditnews.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grand.redditnews.data.Repository
import com.grand.redditnews.data.models.received.KotlinNewsModel
import com.grand.redditnews.utilities.ScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KotlinNewsFragmentVM @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _kotlinNewsStateFlow = MutableStateFlow<ScreenState<KotlinNewsModel>>(ScreenState.InitialValue(null))
    var kotlinNewsStateFlow: StateFlow<ScreenState<KotlinNewsModel>> = _kotlinNewsStateFlow

    fun getKotlinNews() {
        viewModelScope.launch {
            _kotlinNewsStateFlow.emit(ScreenState.Loading(null))

            try {
                _kotlinNewsStateFlow.emit(ScreenState.Success(repository.getKotlinNews().body()!!))
            } catch (e: Exception) {
                _kotlinNewsStateFlow.emit(ScreenState.Error(e.message.toString(), null))
            }
        }
    }
}
package com.baltsarak.composition.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.baltsarak.composition.domain.entity.Level

class GameViewModelFactory(
    private val level: Level,
    private val application: Application
    ) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(application, level) as T
        }
        throw java.lang.RuntimeException("Unknown view model class $modelClass")
    }
}
package com.baltsarak.composition.domain.usecases

import com.baltsarak.composition.domain.entity.GameSettings
import com.baltsarak.composition.domain.entity.Level
import com.baltsarak.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
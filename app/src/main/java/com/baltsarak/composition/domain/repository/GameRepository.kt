package com.baltsarak.composition.domain.repository

import com.baltsarak.composition.domain.entity.GameSettings
import com.baltsarak.composition.domain.entity.Level
import com.baltsarak.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
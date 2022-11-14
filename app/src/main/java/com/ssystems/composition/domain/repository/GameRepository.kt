package com.ssystems.composition.domain.repository

import com.ssystems.composition.domain.entities.GameSettings
import com.ssystems.composition.domain.entities.Level
import com.ssystems.composition.domain.entities.Question

interface GameRepository {
    fun generateQuestions(maxSumValue: Int, countOfOptions: Int) : Question
    fun getGameSettings(level: Level) : GameSettings
}
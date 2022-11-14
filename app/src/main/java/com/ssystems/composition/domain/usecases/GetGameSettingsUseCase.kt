package com.ssystems.composition.domain.usecases

import com.ssystems.composition.domain.entities.GameSettings
import com.ssystems.composition.domain.entities.Level
import com.ssystems.composition.domain.repository.GameRepository

class GetGameSettingsUseCase (private val repository: GameRepository) {
    operator  fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
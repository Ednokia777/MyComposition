package com.ssystems.composition.domain.usecases

import com.ssystems.composition.domain.entities.Question
import com.ssystems.composition.domain.repository.GameRepository
import kotlin.math.max

class GenerateQuestionUseCase (private val repository: GameRepository) {
    operator  fun invoke(maxSumValue: Int) : Question {
        return  repository.generateQuestions(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}
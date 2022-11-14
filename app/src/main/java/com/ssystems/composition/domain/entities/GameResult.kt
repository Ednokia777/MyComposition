package com.ssystems.composition.domain.entities

data class GameResult (
    val winner: Boolean,
    val countOfRightAnswerrs: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        )
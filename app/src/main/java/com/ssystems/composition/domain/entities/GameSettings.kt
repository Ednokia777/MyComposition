package com.ssystems.composition.domain.entities

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
        )
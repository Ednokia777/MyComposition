package com.ssystems.composition.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult (
    val winner: Boolean,
    val countOfRightAnswerrs: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
        ): Parcelable
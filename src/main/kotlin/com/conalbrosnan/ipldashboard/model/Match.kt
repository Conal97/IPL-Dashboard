package com.conalbrosnan.ipldashboard.model

import java.time.LocalDate

// May have to convert to regular class to make JPA happy

data class Match (
    val id:Long,
    val city: String,
    val date: LocalDate,
    val playerOfMatch: String,
    val venue: String,
    val team1: String,
    val team2: String,
    val tossWinner: String,
    val tossDecision: String,
    val matchWinner: String,
    val result: String,
    val resultMargin: String,
    val umpire1: String,
    val umpire2: String
)

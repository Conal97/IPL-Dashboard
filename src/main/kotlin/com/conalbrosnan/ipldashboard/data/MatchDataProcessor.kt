package com.conalbrosnan.ipldashboard.data

import com.conalbrosnan.ipldashboard.model.Match
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import org.springframework.batch.item.ItemProcessor
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MatchDataProcessor: ItemProcessor<MatchInput, Match> {

    val log:Logger = LoggerFactory.getLogger(javaClass.enclosingClass)

    override fun process(matchInput: MatchInput): Match? {

        val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

        lateinit var firstInningsTeam: String
        lateinit var secondInningsTeam: String

        // Determine team1 and team2 based on innings order
        if ("bat".equals(matchInput.toss_decision)){
            firstInningsTeam = matchInput.toss_winner
            //secondInningsTeam = matchInput.toss_winner.equals(matchInput.team1 ? )
        }

        val match = Match (
            id = matchInput.id.toLong(),
            city = matchInput.city,
            date = LocalDate.parse(matchInput.date, formatter),
            playerOfMatch = matchInput.player_of_match,
            team1 =
        )
    }
}
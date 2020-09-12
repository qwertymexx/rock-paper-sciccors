class App {

    fun start(playerOne: String, playerTwo: String): String? {

        val (winner, looser) = calculateWinnerLooser(playerOne, playerTwo)
        return winnerMessage(winner, looser)
    }

    private fun winnerMessage(winner: String, loser: String) =
            if (isTie(winner, loser))
                "It's TIE"
            else getWinningMessage(winner, loser)

    private fun getWinningMessage(winner: String, loser: String) = "$winner beats $loser"

    private fun isTie(playerOne: String, playerTwo: String): Boolean {
        return playerOne == playerTwo
    }

    private fun calculateWinnerLooser(playerOne: String, playerTwo: String): Pair<String, String> {
        return if (whoWins(playerOne, playerTwo))
            Pair(playerOne, playerTwo)
        else
            Pair(playerTwo, playerOne)
    }

    private fun whoWins(playerOne: String, playerTwo: String): Boolean {
        return (playerOne == "rock" && playerTwo == "scissors") ||
                (playerOne == "paper" && playerTwo == "rock") ||
                (playerOne == "scissors" && playerTwo == "paper")
    }

}
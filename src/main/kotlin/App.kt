class App {

    fun start(playerOne: String, playerTwo: String): String? {

        return winnerMessage(playerOne, playerTwo)
    }

    private fun winnerMessage(winner: String, loser: String) =
            if (isTie(winner, loser))
                "It's TIE"
            else getWinningMessage(winner, loser)

    private fun getWinningMessage(winner: String, loser: String) = "$winner beats $loser"

    private fun isTie(playerOne: String, playerTwo: String): Boolean {
        return playerOne == playerTwo
    }

}
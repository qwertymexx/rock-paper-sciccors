class App {

    companion object {
        @JvmStatic fun main(args: Array<String>) {

        play100Times()

        }

        var playerOneCounter = 0
        var playerTwoCounter = 0
        var tiesCounter = 0

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
        return if (whoWins(playerOne, playerTwo)) {
            playerOneCounter++
            Pair(playerOne, playerTwo)
        }
        else if (whoWins(playerTwo, playerOne)){
            playerTwoCounter++
            Pair(playerTwo, playerOne)
        }
        else {
            tiesCounter++
            Pair(playerTwo, playerOne)
        }

    }

    private fun whoWins(playerOne: String, playerTwo: String): Boolean {
        return (playerOne == "rock" && playerTwo == "scissors") ||
                (playerOne == "paper" && playerTwo == "rock") ||
                (playerOne == "scissors" && playerTwo == "paper")
    }

    fun play100Times() {
        val list = listOf("rock", "scissors", "paper")
        val playerOne = "rock"

        for (x in 0..99) {
            println(this.start(playerOne, list.random()))

        }
        println("Player One won $playerOneCounter and Player Two won $playerTwoCounter. Number of ties: $tiesCounter")
    }

    }

}
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class AppTest {

    private val rockPaperScissors = App

    @Test
    fun tie_when_both_players_choose_same() {
        val list = listOf("rock", "scissors", "paper")

        list.forEach {
            assertEquals(rockPaperScissors.start(it, it), "It's TIE")
        }
    }

    @Test
    fun rockBeatsScissors() {
        val rockPlayer = "rock"
        val scissorsPlayer = "scissors"

        val result = rockPaperScissors.start(rockPlayer, scissorsPlayer)

        assertEquals(result, "rock beats scissors")
    }

    @Test
    fun paperBeatsRock() {
        val paperPlayer = "paper"
        val rockPlayer = "rock"

        val result = rockPaperScissors.start(paperPlayer, rockPlayer)

        assertEquals(result, "paper beats rock")
    }

    @Test
    fun scissorsBeatsPaper() {
        val scissorsPlayer = "scissors"
        val paperPlayer = "paper"

        val result = rockPaperScissors.start(scissorsPlayer, paperPlayer)

        assertEquals(result, "scissors beats paper")
    }

    @Test
    fun play100Times() {
        val list = listOf("rock", "scissors", "paper")
        val playerOne = "rock"
        val playerTwo = list.random()

        println(rockPaperScissors.start(playerOne,playerTwo))
    }

}
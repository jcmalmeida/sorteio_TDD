import org.junit.jupiter.api.Assertions.*

import kotlin.test.Test
import kotlin.test.assertEquals

internal class RandomNumberTest {

    @Test
    fun `GIVEN random number 50 WHEN guessed number 25 THEN guess feedback equals BIGGER`(){
        val randomNumber = RandomNumber(1, 100, 50)
        assertEquals(GuessFeedback.BIGGER, randomNumber.checkGuessedNumber(25))
    }

    @Test
    fun `GIVEN random number 50 WHEN guessed number 50 THEN guess feedback equals EQUAL`(){
        val randomNumber = RandomNumber(1, 100, 50)
        assertEquals(GuessFeedback.EQUAL, randomNumber.checkGuessedNumber(50))
    }

    @Test
    fun `GIVEN random number 50 WHEN guessed number 75 THEN guess feedback equals SMALLER`(){
        val randomNumber = RandomNumber(1, 100, 50)
        assertEquals(GuessFeedback.SMALLER, randomNumber.checkGuessedNumber(75))
    }

}
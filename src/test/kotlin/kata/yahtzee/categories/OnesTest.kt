package kata.yahtzee.categories

import kata.yahtzee.DiceFace.*
import kata.yahtzee.Roll
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnesTest {

    private val ones = Ones()

    @Test
    fun should_return_3() {
        val roll = Roll(ONE, TWO, ONE, SIX, ONE)

        val sumOfOnes = ones.applyRule(roll)

        assertThat(sumOfOnes).isEqualTo(3)
    }

    @Test
    fun should_return_0() {
        val roll = Roll(FIVE, TWO, FOUR, SIX, THREE)

        val sumOfOnes = ones.applyRule(roll)

        assertThat(sumOfOnes).isEqualTo(0)
    }
}

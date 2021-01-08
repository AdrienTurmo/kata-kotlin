package kata.yahtzee.categories

import kata.yahtzee.DiceFace.*
import kata.yahtzee.Roll
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TwosTest {
    private val twos = Twos()

    @Test
    fun `should return 6`() {
        val roll = Roll(TWO, TWO, ONE, SIX, TWO)

        assertThat(twos.applyRule(roll)).isEqualTo(6)
    }
}

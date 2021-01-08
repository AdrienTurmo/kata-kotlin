package kata.yahtzee.categories

import kata.yahtzee.DiceFace.*
import kata.yahtzee.Roll
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FoursTest {
    private val fours = Fours()

    @Test
    fun `should return 12`() {
        val roll = Roll(FOUR, FOUR, ONE, SIX, FOUR)

        assertThat(fours.applyRule(roll)).isEqualTo(12)
    }
}

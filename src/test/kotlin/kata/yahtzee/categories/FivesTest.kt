package kata.yahtzee.categories

import kata.yahtzee.DiceFace.*
import kata.yahtzee.Roll
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FivesTest {
    private val fives = Fives()

    @Test
    fun `should return 6`() {
        val roll = Roll(FIVE, FIVE, FIVE, FIVE, FIVE)

        assertThat(fives.applyRule(roll)).isEqualTo(25)
    }
}

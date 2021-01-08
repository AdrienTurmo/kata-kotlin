package kata.yahtzee.categories

import kata.yahtzee.DiceFace.*
import kata.yahtzee.Roll
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreesTest {
    private val threes = Threes()

    @Test
    fun `should return 6`() {
        val roll = Roll(TWO, THREE, ONE, SIX, THREE)

        assertThat(threes.applyRule(roll)).isEqualTo(6)
    }
}

package kata.numberToLCD

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LcdNumberLineTest {

    @Test
    internal fun `should have one horizontal bar for a width of one`() {
        val lcdLine = LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = false)

        val displayedLine = lcdLine.line(1)

        Assertions.assertThat(displayedLine).isEqualTo("|_ ")
    }

    @Test
    internal fun `should have five one horizontal bar for a width of five`() {
        val lcdLine = LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false)

        val displayedLine = lcdLine.line(5)

        Assertions.assertThat(displayedLine).isEqualTo(" _____ ")
    }

    @Test
    internal fun `should have four middle spaces for a width of four`() {
        val lcdLine = LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = false, hasEndingVerticalBar = true)

        val displayedLine = lcdLine.line(4)

        Assertions.assertThat(displayedLine).isEqualTo("|    |")
    }
}

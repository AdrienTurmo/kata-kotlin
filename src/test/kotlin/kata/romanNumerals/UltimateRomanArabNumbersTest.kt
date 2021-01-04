package kata.romanNumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UltimateRomanArabNumbersTest {
    private val arabToRoman = ArabToRoman()
    private val romanToArab = RomanToArab()

    @Test
    internal fun `every number should be map back to itself`() {
        for (number in 0..3999) {
            assertThat(romanToArab.convert(arabToRoman.convert(number))).isEqualTo(number)
        }
    }
}

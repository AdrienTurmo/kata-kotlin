package kata.romanNumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RomanToArabTest {
    private val romanToArab = RomanToArab()

    @Test
    internal fun `should return 1 given I`() {
        val romanNumber = "I"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(1)
    }

    @Test
    internal fun `should return 5 given V`() {
        val romanNumber = "V"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(5)
    }

    @Test
    internal fun `should return 10 given X`() {
        val romanNumber = "X"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(10)
    }

    @Test
    internal fun `should return 50 given L`() {
        val romanNumber = "L"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(50)
    }

    @Test
    internal fun `should return 100 given C`() {
        val romanNumber = "C"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(100)
    }

    @Test
    internal fun `should return 500 given D`() {
        val romanNumber = "D"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(500)
    }

    @Test
    internal fun `should return 1000 given M`() {
        val romanNumber = "M"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(1000)
    }

    @Test
    internal fun `should return 7 given VII`() {
        val romanNumber = "VII"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(7)
    }

    @Test
    internal fun `should return 152 given CLII`() {
        val romanNumber = "CLII"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(152)
    }

    @Test
    internal fun `should return 4 given IV`() {
        val romanNumber = "IV"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(4)
    }

    @Test
    internal fun `should return 91 given XCI`() {
        val romanNumber = "XCI"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(91)
    }

    @Test
    internal fun `should return 3649 given MMMDCXLIX`() {
        val romanNumber = "MMMDCXLIX"

        val convert = romanToArab.convert(romanNumber)

        assertThat(convert).isEqualTo(3649)
    }

}

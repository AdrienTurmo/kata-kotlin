package kata.romanNumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArabToRomanTest {
    private val arabToRoman = ArabToRoman()

    @Test
    internal fun `should return I given 1`() {
        val arabNumber = 1

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("I")
    }

    @Test
    internal fun `should return V given 5`() {
        val arabNumber = 5

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("V")
    }

    @Test
    internal fun `should return X given 10`() {
        val arabNumber = 10

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("X")
    }

    @Test
    internal fun `should return L given 50`() {
        val arabNumber = 50

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("L")
    }

    @Test
    internal fun `should return C given 100`() {
        val arabNumber = 100

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("C")
    }

    @Test
    internal fun `should return D given 500`() {
        val arabNumber = 500

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("D")
    }

    @Test
    internal fun `should return M given 1000`() {
        val arabNumber = 1000

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("M")
    }

    @Test
    internal fun `should return VII given 7`() {
        val arabNumber = 7

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("VII")
    }

    @Test
    internal fun `should return CLII given 152`() {
        val arabNumber = 152

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("CLII")
    }

    @Test
    internal fun `should return IV given 4`() {
        val arabNumber = 4

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("IV")
    }

    @Test
    internal fun `should return XCI given 91`() {
        val arabNumber = 91

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("XCI")
    }

    @Test
    internal fun `should return MMMDCXLIX given 3649`() {
        val arabNumber = 3649

        val convert = arabToRoman.convert(arabNumber)

        assertThat(convert).isEqualTo("MMMDCXLIX")
    }
}

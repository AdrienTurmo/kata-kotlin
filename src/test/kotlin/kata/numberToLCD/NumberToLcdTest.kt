package kata.numberToLCD

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberToLcdTest {
    private lateinit var numberToLCD: NumberToLcd

    @Test
    fun `should convert 0 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(0)).isEqualTo("" +
                " _ \n" +
                "| |\n" +
                "|_|")
    }

    @Test
    fun `should convert 1 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(1)).isEqualTo("" +
                "   \n" +
                "  |\n" +
                "  |")
    }

    @Test
    fun `should convert 2 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(2)).isEqualTo("" +
                " _ \n" +
                " _|\n" +
                "|_ ")
    }

    @Test
    fun `should convert 3 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(3)).isEqualTo("" +
                " _ \n" +
                " _|\n" +
                " _|")
    }

    @Test
    fun `should convert 4 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(4)).isEqualTo("" +
                "   \n" +
                "|_|\n" +
                "  |")
    }

    @Test
    fun `should convert 5 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(5)).isEqualTo("" +
                " _ \n" +
                "|_ \n" +
                " _|")
    }

    @Test
    fun `should convert 6 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(6)).isEqualTo("" +
                " _ \n" +
                "|_ \n" +
                "|_|")
    }

    @Test
    fun `should convert 7 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(7)).isEqualTo("" +
                " _ \n" +
                "  |\n" +
                "  |")
    }

    @Test
    fun `should convert 8 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(8)).isEqualTo("" +
                " _ \n" +
                "|_|\n" +
                "|_|")
    }

    @Test
    fun `should convert 9 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(9)).isEqualTo("" +
                " _ \n" +
                "|_|\n" +
                " _|")
    }

    @Test
    fun `should convert 845679213 to LCD`() {
        numberToLCD = NumberToLcd(1, 1)
        assertThat(numberToLCD.toLCD(845679213)).isEqualTo("" +
                " _     _  _  _  _  _     _ \n" +
                "|_||_||_ |_   ||_| _|  | _|\n" +
                "|_|  | _||_|  | _||_   | _|")
    }

    @Test
    fun `should convert 9142 to LCD for width 2`() {
        numberToLCD = NumberToLcd(width = 2, height = 1)
        assertThat(numberToLCD.toLCD(9142)).isEqualTo("" +
                " __          __ \n" +
                "|__|   ||__| __|\n" +
                " __|   |   ||__ ")
    }

    @Test
    fun `should convert 8613 to LCD for height 3`() {
        numberToLCD = NumberToLcd(width = 1, height = 3)
        assertThat(numberToLCD.toLCD(8613)).isEqualTo("" +
                " _  _     _ \n" +
                "| ||    |  |\n" +
                "| ||    |  |\n" +
                "|_||_   | _|\n" +
                "| || |  |  |\n" +
                "| || |  |  |\n" +
                "|_||_|  | _|")
    }

    @Test
    fun `should convert 2021 to LCD for width 5 and height 5`() {
        numberToLCD = NumberToLcd(width = 5, height = 5)
        assertThat(numberToLCD.toLCD(2021)).isEqualTo("" +
                " _____  _____  _____        \n" +
                "      ||     |      |      |\n" +
                "      ||     |      |      |\n" +
                "      ||     |      |      |\n" +
                "      ||     |      |      |\n" +
                " _____||     | _____|      |\n" +
                "|      |     ||            |\n" +
                "|      |     ||            |\n" +
                "|      |     ||            |\n" +
                "|      |     ||            |\n" +
                "|_____ |_____||_____       |")
    }

}

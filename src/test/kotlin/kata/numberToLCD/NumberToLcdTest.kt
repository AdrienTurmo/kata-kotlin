package kata.numberToLCD

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberToLcdTest {
    private lateinit var numberToLCD: NumberToLcd

    @Test
    internal fun `should convert 0 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(0)).isEqualTo("""
 _ 
| |
|_|""")
    }

    @Test
    internal fun `should convert 1 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(1)).isEqualTo("""
   
  |
  |""")
    }

    @Test
    internal fun `should convert 2 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(2)).isEqualTo("""
 _ 
 _|
|_ """)
    }

    @Test
    internal fun `should convert 3 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(3)).isEqualTo("""
 _ 
 _|
 _|""")
    }

    @Test
    internal fun `should convert 4 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(4)).isEqualTo("""
   
|_|
  |""")
    }

    @Test
    internal fun `should convert 5 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(5)).isEqualTo("""
 _ 
|_ 
 _|""")
    }

    @Test
    internal fun `should convert 6 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(6)).isEqualTo("""
 _ 
|_ 
|_|""")
    }

    @Test
    internal fun `should convert 7 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(7)).isEqualTo("""
 _ 
  |
  |""")
    }

    @Test
    internal fun `should convert 8 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(8)).isEqualTo("""
 _ 
|_|
|_|""")
    }

    @Test
    internal fun `should convert 9 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(9)).isEqualTo("""
 _ 
|_|
 _|""")
    }

    @Test
    internal fun `should convert 845679213 to LCD`() {
        numberToLCD = NumberToLcd(1)
        assertThat(numberToLCD.toLCD(845679213)).isEqualTo("""
 _     _  _  _  _  _     _ 
|_||_||_ |_   ||_| _|  | _|
|_|  | _||_|  | _||_   | _|""")
    }

    @Test
    internal fun `should convert 9 to LCD for width 2`() {
        numberToLCD = NumberToLcd(2)
        assertThat(numberToLCD.toLCD(9142)).isEqualTo("""
 __          __ 
|__|   ||__| __|
 __|   |   ||__ """)
    }

}

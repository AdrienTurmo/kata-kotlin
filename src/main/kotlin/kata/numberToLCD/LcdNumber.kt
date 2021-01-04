package kata.numberToLCD

import java.lang.Exception

enum class LcdNumber(
    private val lcd: String
    ) {
    ZERO("""
 _ 
| |
|_|"""),
    ONE("""
   
  |
  |"""),
    TWO("""
 _ 
 _|
|_ """),
    THREE("""
 _ 
 _|
 _|"""),
    FOUR("""
   
|_|
  |"""),
    FIVE("""
 _ 
|_ 
 _|"""),
    SIX("""
 _ 
|_ 
|_|"""),
    SEVEN("""
 _ 
  |
  |"""),
    EIGHT("""
 _ 
|_|
|_|"""),
    NINE("""
 _ 
|_|
 _|""");

    fun firstLine() = lcd.lines()[1]
    fun secondLine() = lcd.lines()[2]
    fun thirdLine() = lcd.lines()[3]

    companion object {
        fun fromInt(digit: Int): LcdNumber {
            return when (digit) {
                0 -> ZERO
                1 -> ONE
                2 -> TWO
                3 -> THREE
                4 -> FOUR
                5 -> FIVE
                6 -> SIX
                7 -> SEVEN
                8 -> EIGHT
                9 -> NINE
                else -> throw Exception("Unknown digit: $digit")
            }
        }
    }
}

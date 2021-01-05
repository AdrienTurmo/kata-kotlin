package kata.numberToLCD

class NumberToLcd(
    private val width: Int
) {

    fun toLCD(number: Int): String {
        val digits = number.toString().map { LcdNumber.fromInt(it.toString().toInt()) }

        val firstLine = digits.joinToString("") { it.firstLine(width) }
        val secondLine = digits.joinToString("") { it.secondLine(width) }
        val thirdLine = digits.joinToString("") { it.thirdLine(width) }

        return """
$firstLine
$secondLine
$thirdLine"""
    }

}

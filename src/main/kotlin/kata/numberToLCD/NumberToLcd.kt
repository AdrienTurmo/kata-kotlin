package kata.numberToLCD

class NumberToLcd {

    fun toLCD(number: Int): String {
        val digits = number.toString().map { LcdNumber.fromInt(it.toString().toInt()) }

        val firstLine = digits.joinToString("") { it.firstLine() }
        val secondLine = digits.joinToString("") { it.secondLine() }
        val thirdLine = digits.joinToString("") { it.thirdLine() }

        return """
$firstLine
$secondLine
$thirdLine"""
    }

}

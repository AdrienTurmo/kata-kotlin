package kata.numberToLCD

class NumberToLcd(
    private val width: Int,
    private val height: Int
) {

    fun toLCD(number: Int): String {
        val digits = number.toString().map { LcdNumber.fromInt(it.toString().toInt()) }

        val lines: MutableList<String> = ArrayList()

        val firstLine = digits.joinToString("") { it.firstLine(width) }
        val extendedSecondLine = digits.joinToString("") { it.secondLineVerticalExtension(width) }
        val secondLine = digits.joinToString("") { it.secondLine(width) }
        val extendedThirdLine = digits.joinToString("") { it.thirdLineVerticalExtension(width) }
        val thirdLine = digits.joinToString("") { it.thirdLine(width) }

        lines.add(firstLine)
        for (i in 1 until height) { lines.add(extendedSecondLine) }
        lines.add(secondLine)
        for (i in 1 until height) { lines.add(extendedThirdLine) }
        lines.add(thirdLine)

        return lines.joinToString("\n");
    }

}

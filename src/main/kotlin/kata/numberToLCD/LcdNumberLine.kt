package kata.numberToLCD

import kata.numberToLCD.LcdNumberLine.LcdCharacter.*

class LcdNumberLine(
    private val hasLeadingVerticalBar: Boolean,
    private val hasHorizontalBar: Boolean,
    private val hasEndingVerticalBar: Boolean
) {

    fun line(width: Int): String {
        val firstCharacter = if (hasLeadingVerticalBar) VERTICAL_BAR.symbol else SPACE.symbol
        val secondCharacter = if (hasHorizontalBar) HORIZONTAL_BAR.symbol else SPACE.symbol
        val thirdCharacter = if (hasEndingVerticalBar) VERTICAL_BAR.symbol else SPACE.symbol
        return firstCharacter + secondCharacter * width + thirdCharacter
    }

    fun verticalExtensionLine(width: Int): String {
        val firstCharacter = if (hasLeadingVerticalBar) VERTICAL_BAR.symbol else SPACE.symbol
        val thirdCharacter = if (hasEndingVerticalBar) VERTICAL_BAR.symbol else SPACE.symbol
        return firstCharacter + SPACE.symbol * width + thirdCharacter
    }

    private operator fun String.times(number: Int): String {
        var duplicatedString = ""
        for (index in 1..number) {
            duplicatedString += this
        }
        return duplicatedString
    }

    private enum class LcdCharacter(
        val symbol: String
    ) {
        VERTICAL_BAR("|"),
        HORIZONTAL_BAR("_"),
        SPACE(" ")
    }
}

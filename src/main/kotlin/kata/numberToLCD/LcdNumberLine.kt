package kata.numberToLCD

import kata.numberToLCD.LcdNumberLine.LcdCharacter.*

class LcdNumberLine(
    private val hasLeadingVerticalBar: Boolean,
    private val hasHorizontalBar: Boolean,
    private val hasEndingVerticalBar: Boolean
) {

    fun line(): String {
        val firstCharacter = if (hasLeadingVerticalBar) VERTICAL_BAR.symbol else SPACE.symbol
        val secondCharacter = if (hasHorizontalBar) HORIZONTAL_BAR.symbol else SPACE.symbol
        val thirdCharacter = if (hasEndingVerticalBar) VERTICAL_BAR.symbol else SPACE.symbol
        return firstCharacter + secondCharacter + thirdCharacter
    }

    private enum class LcdCharacter(
        val symbol: String
    ) {
        VERTICAL_BAR("|"),
        HORIZONTAL_BAR("_"),
        SPACE(" ")
    }
}

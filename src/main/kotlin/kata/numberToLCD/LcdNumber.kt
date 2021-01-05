package kata.numberToLCD

enum class LcdNumber(
    private val firstLine: LcdNumberLine,
    private val secondLine: LcdNumberLine,
    private val thirdLine: LcdNumberLine
) {
    ZERO(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = false, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = true)
    ),
    ONE(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = true)
    ),
    TWO(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = false)
    ),
    THREE(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = true)
    ),
    FOUR(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = true)
    ),
    FIVE(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = true)
    ),
    SIX(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = true)
    ),
    SEVEN(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = false, hasEndingVerticalBar = true)
    ),
    EIGHT(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = true)
    ),
    NINE(
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = false),
        LcdNumberLine(hasLeadingVerticalBar = true, hasHorizontalBar = true, hasEndingVerticalBar = true),
        LcdNumberLine(hasLeadingVerticalBar = false, hasHorizontalBar = true, hasEndingVerticalBar = true)
    );

    fun firstLine() = firstLine.line()
    fun secondLine() = secondLine.line()
    fun thirdLine() = thirdLine.line()

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

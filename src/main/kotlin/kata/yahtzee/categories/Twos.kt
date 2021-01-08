package kata.yahtzee.categories

import kata.yahtzee.DiceFace
import kata.yahtzee.Roll

class Twos : ScoreCategories {
    override fun applyRule(roll: Roll): Int =
        roll.sumOf(DiceFace.TWO)
}

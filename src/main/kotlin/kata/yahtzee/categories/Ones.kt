package kata.yahtzee.categories

import kata.yahtzee.DiceFace
import kata.yahtzee.Roll

class Ones : ScoreCategories {
    override fun applyRule(roll: Roll): Int =
        roll.sumOf(DiceFace.ONE)
}

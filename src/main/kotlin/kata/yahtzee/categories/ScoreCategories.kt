package kata.yahtzee.categories

import kata.yahtzee.Roll

interface ScoreCategories {
    fun applyRule(roll: Roll): Int
}

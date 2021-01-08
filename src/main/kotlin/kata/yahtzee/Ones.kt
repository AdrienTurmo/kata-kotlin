package kata.yahtzee

class Ones {

    fun applyRule(roll: Roll): Int =
        roll.sumOf(DiceFace.ONE)


}

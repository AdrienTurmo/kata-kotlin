package kata.yahtzee

class Roll(dice1: DiceFace, dice2: DiceFace, dice3: DiceFace, dice4: DiceFace, dice5: DiceFace) {
    private val fiveDice: List<DiceFace> = listOf(dice1, dice2, dice3, dice4, dice5)

    fun sumOf(face: DiceFace): Int =
        this.fiveDice
            .filter { it == face }
            .sumOf { it.value }

}

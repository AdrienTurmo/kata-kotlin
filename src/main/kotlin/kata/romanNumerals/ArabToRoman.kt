package kata.romanNumerals

class ArabToRoman {

    fun convert(arabNumber: Int): String {
        var intermediateNumber = arabNumber
        var romanNumber = "";
        while (intermediateNumber > 0) {
            val (letter, nextCal) = findBiggestMatchingLetter(intermediateNumber)
            intermediateNumber = nextCal
            romanNumber += letter
        }
        return romanNumber
    }

    private fun findBiggestMatchingLetter(arabNumber: Int): Pair<String, Int> =
        when {
            arabNumber >= 1000 -> Pair(RomanNumbers.M.name, arabNumber - 1000)
            arabNumber >= 900 -> Pair(RomanNumbers.C.name + RomanNumbers.M.name, arabNumber - 900)
            arabNumber >= 500 -> Pair(RomanNumbers.D.name, arabNumber - 500)
            arabNumber >= 400 -> Pair(RomanNumbers.C.name + RomanNumbers.D.name, arabNumber - 400)
            arabNumber >= 100 -> Pair(RomanNumbers.C.name, arabNumber - 100)
            arabNumber >= 90 -> Pair(RomanNumbers.X.name + RomanNumbers.C.name, arabNumber - 90)
            arabNumber >= 50 -> Pair(RomanNumbers.L.name, arabNumber - 50)
            arabNumber >= 40 -> Pair(RomanNumbers.X.name + RomanNumbers.L.name, arabNumber - 40)
            arabNumber >= 10 -> Pair(RomanNumbers.X.name, arabNumber - 10)
            arabNumber >= 9 -> Pair(RomanNumbers.I.name + RomanNumbers.X.name, arabNumber - 9)
            arabNumber >= 5 -> Pair(RomanNumbers.V.name, arabNumber - 5)
            arabNumber >= 4 -> Pair(RomanNumbers.I.name + RomanNumbers.V.name, arabNumber - 4)
            else -> Pair(RomanNumbers.I.name, arabNumber - 1)
    }

}

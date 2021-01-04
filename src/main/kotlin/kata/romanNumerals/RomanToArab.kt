package kata.romanNumerals

class RomanToArab {

    fun convert(romanNumber: String): Int {
        var result = 0;
        var intermediateRomanNumber = romanNumber;
        while (intermediateRomanNumber.isNotEmpty()) {
            val (toAdd, nextIntermediate) = convertStartOfTheString(intermediateRomanNumber)
            intermediateRomanNumber = nextIntermediate
            result += toAdd
        }
        return result;
    }

    private fun convertStartOfTheString(romanNumber: String): Pair<Int, String> {
        val firstChar = romanNumber[0].toString()
        val nextChar = if (romanNumber.length >= 2) romanNumber[1].toString() else ""
        return when (firstChar) {
            RomanNumbers.M.name -> Pair(1000, romanNumber.substring(1))
            RomanNumbers.D.name -> Pair(500, romanNumber.substring(1))
            RomanNumbers.C.name -> {
                when (nextChar) {
                    RomanNumbers.M.name -> Pair(900, romanNumber.substring(2))
                    RomanNumbers.D.name -> Pair(400, romanNumber.substring(2))
                    else -> Pair(100, romanNumber.substring(1))
                }
            }
            RomanNumbers.L.name -> Pair(50, romanNumber.substring(1))
            RomanNumbers.X.name -> {
                when (nextChar) {
                    RomanNumbers.C.name -> Pair(90, romanNumber.substring(2))
                    RomanNumbers.L.name -> Pair(40, romanNumber.substring(2))
                    else -> Pair(10, romanNumber.substring(1))
                }
            }
            RomanNumbers.V.name -> Pair(5, romanNumber.substring(1))
            RomanNumbers.I.name -> {
                when (nextChar) {
                    RomanNumbers.X.name -> Pair(9, romanNumber.substring(2))
                    RomanNumbers.V.name -> Pair(4, romanNumber.substring(2))
                    else -> Pair(1, romanNumber.substring(1))
                }
            }
            else -> Pair(0, romanNumber.substring(1))
        }
    }
}

package kata

import kata.romanNumerals.RomanToArab

class KataConvertRomanToArab : Kata {
    private val romanToArab = RomanToArab()

    override fun execute() {
        println("*** Convert to arab number ***")
        print("Roman numeral to convert: ")
        val stringInput = readLine()!!

        println("Result: ${romanToArab.convert(stringInput)}")
    }
}

package kata

import kata.romanNumerals.ArabToRoman

class KataConvertArabToRoman: Kata {
    private val arabToRoman = ArabToRoman()

    override fun execute() {
        println("*** Convert to roman numeral ***")
        print("Number to convert: ")
        val stringInput = readLine()!!

        try {
            val number = Integer.parseInt(stringInput)
            println("Result : ${arabToRoman.convert(number)}")
        } catch (e: NumberFormatException) {
            println("Input a number between 0 and 3999")
        }
    }
}

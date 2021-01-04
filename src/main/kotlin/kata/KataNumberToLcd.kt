package kata

import kata.numberToLCD.NumberToLcd

class KataNumberToLcd : Kata {
    private val numberToLcd = NumberToLcd()

    override fun execute() {
        println("*** Display in LCD format ***")
        print("Number to display (10 digits tops): ")
        val stringInput = readLine()!!

        try {
            val number = stringInput.toInt()
            print("Result :")
            println(numberToLcd.toLCD(number))
        } catch (e: NumberFormatException) {
            println("Incorrect number format")
        }
    }
}

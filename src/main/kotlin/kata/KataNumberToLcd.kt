package kata

import kata.numberToLCD.NumberToLcd

class KataNumberToLcd : Kata {
    override fun execute() {
        println("*** Display in LCD format ***")
        print("Width: ")
        val width = readLine()!!
        print("Height: ")
        val height = readLine()!!
        print("Number to display (10 digits tops): ")
        val numberToDisplay = readLine()!!

        try {
            val numberToLcd = NumberToLcd(width = width.toInt(), height = height.toInt())
            val number = numberToDisplay.toInt()
            println("Result :")
            println(numberToLcd.toLCD(number))
        } catch (e: NumberFormatException) {
            println("Incorrect number format")
        }
    }
}

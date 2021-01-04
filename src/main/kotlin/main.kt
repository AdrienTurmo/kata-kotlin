import kata.KataConvertArabToRoman
import kata.KataConvertRomanToArab
import kata.KataNumberToLcd

fun main() {
    do {
        println("""
        |  Katas :
        |  - Convert arab number to roman numeral: 1
        |  - Convert roman number to arab number: 2
        |  - Display a number in LCD format: 3
        |  - Stop the programm: 0
        """.trimIndent())
        print("|  Choosen kata number: ")
        val kata = readLine()!!
        when (kata) {
            "0" -> break
            "1" -> KataConvertArabToRoman().execute()
            "2" -> KataConvertRomanToArab().execute()
            "3" -> KataNumberToLcd().execute()
            else -> println("Unknown kata")
        }
    } while (kata != "0")

}

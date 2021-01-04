import kata.KataConvertArabToRoman
import kata.KataConvertRomanToArab
import kata.KataNumberToLcd

fun main() {
    do {
        println("""
        |  Katas :
        |  - Convertion chiffre arabe en chiffre romain : 1
        |  - Convertion chiffre romain en chiffre arabe : 2
        |  - Afficher un numbre au format LCD : 3
        |  - Arreter le programme : 0
        """.trimIndent())
        print("|  Numéro du kata choisi : ")
        val kata = readLine()!!
        when (kata) {
            "0" -> break
            "1" -> KataConvertArabToRoman().execute()
            "2" -> KataConvertRomanToArab().execute()
            "3" -> KataNumberToLcd().execute()
            else -> println("Kata inconnu")
        }
    } while (kata != "0")

}

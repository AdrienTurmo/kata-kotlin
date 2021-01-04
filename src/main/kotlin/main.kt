import kata.KataConvertArabToRoman
import kata.KataConvertRomanToArab

fun main(args: Array<String>) {
    do {
        println("Katas :")
        println("Convertion chiffre arabe en chiffre romain : 1")
        println("Convertion chiffre romain en chiffre arabe : 2")
        println("Arreter le programme : 0")
        print("Numéro du kata choisi : ")
        val kata = readLine()!!
        when (kata) {
            "0" -> break;
            "1" -> KataConvertArabToRoman().execute()
            "2" -> KataConvertRomanToArab().execute()
            else -> println("Kata inconnu")
        }
    } while (kata != "0")

}

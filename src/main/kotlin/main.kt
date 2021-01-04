import kata.romanNumerals.ArabToRoman
import kata.romanNumerals.RomanToArab

private val arabToRoman = ArabToRoman();
private val romanToArab = RomanToArab();

fun main(args: Array<String>) {
    println("Katas :")
    println("Convertion chiffre arabe en chiffre romain : 1")
    println("Convertion chiffre romain en chiffre arabe : 2")
    print("Numéro du kata choisi : ")
    val kata = readLine()!!
    when (kata) {
        "1" -> {
            println("Convertir en chiffre romain")
            print("Nombre à convertir : ")
            val stringInput = readLine()!!

            try {
                val number = Integer.parseInt(stringInput)
                println("Resultat : ${arabToRoman.convert(number)}")
            } catch (e: NumberFormatException) {
                println("Merci de renseigner un nombre compris entre 0 et 5000")
            }
        }
        "2" -> {
            println("Convertir en chiffre arabe")
            print("Nombre à convertir : ")
            val stringInput = readLine()!!

            println("Resultat : ${romanToArab.convert(stringInput)}")
        }
        else -> println("Kata inconnu")
    }

}

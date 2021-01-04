package kata

import kata.romanNumerals.RomanToArab

class KataConvertRomanToArab : Kata {
    private val romanToArab = RomanToArab()

    override fun execute() {
        println("Convertir en chiffre arabe")
        print("Nombre à convertir : ")
        val stringInput = readLine()!!

        println("Resultat : ${romanToArab.convert(stringInput)}")
    }
}

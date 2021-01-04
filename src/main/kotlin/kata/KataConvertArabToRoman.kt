package kata

import kata.romanNumerals.ArabToRoman

class KataConvertArabToRoman: Kata {
    private val arabToRoman = ArabToRoman()

    override fun execute() {
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
}

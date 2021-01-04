package kata

import kata.numberToLCD.NumberToLcd

class KataNumberToLcd : Kata {
    private val numberToLcd = NumberToLcd()

    override fun execute() {
        println("Afficher un nombre au format LCD")
        print("Nombre à afficher (10 chiffres max) : ")
        val stringInput = readLine()!!

        try {
            val number = stringInput.toInt()
            println("Resultat : ${numberToLcd.toLCD(number)}")
        } catch (e: NumberFormatException) {
            println("Format du nombre incorrect")
        }
    }
}

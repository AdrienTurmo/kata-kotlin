import kata.romanNumerals.ArabToRoman

private val arabToRoman = ArabToRoman();

fun main(args: Array<String>) {
    println("Katas :")
    println("Convertion chiffre arabe en chiffre romain : 1")
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
        else -> println("Kata inconnu")
    }

}

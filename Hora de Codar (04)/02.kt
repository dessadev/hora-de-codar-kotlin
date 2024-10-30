fun main() {
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    println("Digite o nome de um planeta: ")
    val planetaInformado = readln()

    if (planetas.contains(planetaInformado)) {
        println("$planetaInformado está na lista de planetas.")
    } else {
        println("$planetaInformado não está na lista de planetas.")
    }
}

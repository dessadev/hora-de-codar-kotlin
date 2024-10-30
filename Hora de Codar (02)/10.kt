fun main() {
    println("Informe a altura em metros: ")
    val altura = readln().toDouble()

    println("Informe o gênero (1 para feminino, 2 para masculino): ")
    val genero = readln().toInt()

    val pesoIdeal = when (genero) {
        1 -> 62.1 * altura - 44.7
        2 -> 72.7 * altura - 58.0
        else -> {
            println("Gênero inválido.")
            return
        }
    }

    println("O peso ideal é: %.2f kg".format(pesoIdeal))
}

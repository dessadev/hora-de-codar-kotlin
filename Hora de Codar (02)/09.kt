fun main() {

    println("Informe o ano de nascimento: ")
    val anoNascimento = readln().toInt()

    val anoAtual = 2024
    val idade = anoAtual - anoNascimento

    if (idade >= 16) {
        println("Você pode votar este ano.")
    } else {
        println("Você não pode votar este ano.")
    }
}

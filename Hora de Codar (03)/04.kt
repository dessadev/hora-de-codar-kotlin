fun main() {

    val inicio = 15
    val fim = 100

    var soma = 0
    var quantidade = 0

    for (i in inicio..fim) {
        soma += i
        quantidade++
    }

    val media = soma.toDouble() / quantidade

    println("A média aritmética dos números entre $inicio e $fim é: $media")
}

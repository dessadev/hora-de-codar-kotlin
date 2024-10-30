fun main() {

    println("Informe o primeiro valor: ")
    val valor1 = readln().toInt()

    println("Informe o segundo valor: ")
    val valor2 = readln().toInt()

    println("Informe o terceiro valor: ")
    val valor3 = readln().toInt()

    println("Informe o quarto valor: ")
    val valor4 = readln().toInt()

    println("Informe o quinto valor: ")
    val valor5 = readln().toInt()

    println("Informe o sexto valor: ")
    val valor6 = readln().toInt()

    println("Valores informados:")
    println(valor1)
    println(valor2)
    println(valor3)
    println(valor4)
    println(valor5)
    println(valor6)

    val soma = valor1 + valor2 + valor3 + valor4 + valor5 + valor6
    val media = soma / 6.0

    println("A média aritmética é: $media")
}

fun main() {

    println("Informe o primeiro valor: ")
    val valor1 = readln().toDouble()

    var valor2: Double

    while (true) {
        println("Informe o segundo valor (deve ser maior que zero): ")
        valor2 = readln().toDouble()

        if (valor2 > 0) {
            break
        } else {
            println("Valor inválido. O segundo valor deve ser maior que zero.")
        }
    }

    val resultado = valor1 / valor2
    println("O resultado da divisão é: $resultado")
}

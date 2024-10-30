fun main() {

    println("Informe o primeiro número: ")
    val num1 = readln().toInt()

    println("Informe o segundo número: ")
    val num2 = readln().toInt()

    println("Informe o terceiro número: ")
    val num3 = readln().toInt()

    println("Informe o quarto número: ")
    val num4 = readln().toInt()

    if (num1 in 1..9 && num2 in 1..9 && num3 in 1..9 && num4 in 1..9) {
        val media = (num1 + num2 + num3 + num4) / 4.0
        if (media > 5) {
            println("Você passou no teste")
        } else {
            println("Tente novamente")
        }
    } else {
        println("Todos os números devem estar entre 1 e 9")
    }
}

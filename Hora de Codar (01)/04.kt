import kotlin.math.PI

fun main () {

    //retângulo
    println("Digite a base do retângulo:")
    var base = readln().toDouble()

    println("Digite a altura:")
    var altura = readln().toDouble()

    var arearetangulo = base * altura

    print("A área do retângulo é: $arearetangulo")


    //quadrado
    println("Digite um lado do quadrado:")
    var lado1 = readln().toDouble()

    println("Digite o outro lado do quadrado:")
    var lado2 = readln().toDouble()

    var areaquadrado = lado1 * lado2

    println("A área do quadrado é: $areaquadrado")


    //losango
    println("Digite o diagonal maior do losango:")
    var diagonalmaior = readln().toDouble()

    println("Digite o diagonal menor:")
    var diagonalmenor = readln().toDouble()

    var arealosango = (diagonalmenor * diagonalmaior)/2

    println("A área do losango é: $arealosango")


    //trapézio
    println("Digite a base maior do trapézio:")
    var basemaior = readln().toDouble()

    println("Digite a base menor: ")
    var basemenor = readln().toDouble()

    println("Digite a altura: ")
    var altura2 = readln().toDouble()

    var areatrapezio = (basemaior + basemenor) * altura2 / 2

    println("A área do trapézio é $areatrapezio")


    //paralelograma
    println("Digite a base do paralelograma: ")
    var base2 = readln().toDouble()

    println("Digite a altura: ")
    var altura3 = readln().toDouble()

    var areaparalelograma = base2 * altura3

    println("A área do paralelograma é $areaparalelograma")


    //triângulo
    println("Digite a base do triângulo: ")
    var base3 = readln().toDouble()

    println("Digite a altura: ")
    var altura4 = readln().toDouble()

    var areatriangulo = (base3 * altura4) /2

    println("A área do triângulo é $areatriangulo")


    //circulo
    println("Digite o raio do circulo: ")
    var raio = readln().toDouble()

    val areacirculo = PI * raio * raio

    println("A área do circulo é $areacirculo")

}
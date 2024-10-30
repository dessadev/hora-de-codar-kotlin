fun main() {
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Manga", "Uva")

    while (frutas.isNotEmpty()) {
        println("Lista de frutas disponíveis: ${frutas.joinToString(", ")}")
        println("Digite o nome de uma fruta para remover (ou 'Sair' para encerrar): ")
        val frutaParaRemover = readln()

        if (frutaParaRemover.uppercase() == "Sair") {
            break
        }

        if (frutas.contains(frutaParaRemover)) {
            frutas.remove(frutaParaRemover)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }
    }

    println("Lista de compras finalizada.")
}

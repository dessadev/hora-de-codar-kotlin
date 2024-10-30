val nomes = mutableListOf<String>()
val enderecos = mutableListOf<String>()
val telefones = mutableListOf<String>()

fun main() {
    while (true) {
        println("\nEscolha uma opção: \n1. Cadastrar Contatos\n2. Pesquisar Contatos\n3. Classificar Contatos\n4. Exibir Contatos\n5. Sair")
        when (readLine()?.toIntOrNull()) {
            1 -> cadastrar()
            2 -> pesquisar()
            3 -> classificar()
            4 -> exibir()
            5 -> return
            else -> println("Opção inválida.")
        }
    }
}

fun cadastrar() {
    while (nomes.size < 10) {
        println("Nome:")
        nomes.add(readLine() ?: "")
        println("Endereço:")
        enderecos.add(readLine() ?: "")
        println("Telefone:")
        telefones.add(readLine() ?: "")
        println("Cadastro feito.\n")
    }
}

fun pesquisar() {
    println("Nome para pesquisar:")
    val nome = readLine() ?: ""
    val index = nomes.indexOf(nome)
    if (index != -1) {
        println("Encontrado: ${nomes[index]}, ${enderecos[index]}, ${telefones[index]}")
    } else {
        println("Não encontrado.")
    }
}

fun classificar() {
    val listaCombinada = nomes.indices.sortedBy { nomes[it] }
    println("Contatos classificados:")
    listaCombinada.forEach { println("${nomes[it]}, ${enderecos[it]}, ${telefones[it]}") }
}

fun exibir() {
    if (nomes.isEmpty()) {
        println("Nenhum contato cadastrado.")
    } else {
        println("Lista de contatos:")
        for (i in nomes.indices) {
            println("${nomes[i]}, ${enderecos[i]}, ${telefones[i]}")
        }
    }
}

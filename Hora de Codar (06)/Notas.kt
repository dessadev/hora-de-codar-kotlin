val alunosNomes = mutableListOf<String>()
val alunosNotas = mutableListOf<List<Double>>()

fun main() {
    while (true) {
        println("\nEscolha uma opção:\n1. Cadastrar Notas\n2. Pesquisar Notas\n3. Exibir Notas\n4. Sair")
        when (readLine()?.toIntOrNull()) {
            1 -> cadastrarNotas()
            2 -> pesquisarNotas()
            3 -> exibirNotas()
            4 -> return
            else -> println("Opção inválida.")
        }
    }
}

fun cadastrarNotas() {
    while (alunosNomes.size < 20) {
        println("Nome do aluno:")
        alunosNomes.add(readLine() ?: "")
        println("Digite a nota:")
        val nota = readLine()?.split(" ")?.map { it.toDoubleOrNull() ?: 0.0 } ?: listOf(0.0, 0.0, 0.0, 0.0)
        alunosNotas.add(nota)
        println("Cadastro feito.\n")
    }
}

fun pesquisarNotas() {
    println("Nome do aluno para pesquisar:")
    val nome = readLine() ?: ""
    val index = alunosNomes.indexOf(nome)
    if (index != -1) {
        val media = alunosNotas[index].average()
        val status = if (media >= 5) "Aprovado" else "Reprovado"
        println("Nome: $nome, Notas: ${alunosNotas[index]}, Média: $media, Status: $status")
    } else {
        println("Aluno não encontrado.")
    }
}

fun exibirNotas() {
    if (alunosNomes.isEmpty()) {
        println("Nenhum aluno cadastrado.")
    } else {
        println("Lista de alunos:")
        for (i in alunosNomes.indices) {
            val media = alunosNotas[i].average()
            val situacao = if (media >= 5) "Aprovado" else "Reprovado"
            println("Nome: ${alunosNomes[i]}, Notas: ${alunosNotas[i]}, Média: $media, $situacao")
        }
    }
}

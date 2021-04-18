package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {
        println(it)
    }

    println("-------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    // fazer a ordenação mas pelo salário e itera a lista nova imprimindo a mesma
    println("-------------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }


    // fazer o agrupamento mas pelo tipo de contratação
    println("-------------------------")
    funcionarios.groupBy { it.tipoContatacao }.forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContatacao: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}
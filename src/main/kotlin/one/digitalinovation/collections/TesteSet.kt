package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    // setOf são conjuntos e não são listas
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    // union() é a união de conjuntos
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    // subtract retira o que for comum em ambos conjuntos
    println("-------------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    // intersect exibe o que é comum nos ocnjuntos
    println("-------------------------")
    val resultInersect = funcionarios3.intersect(funcionarios2)
    resultInersect.forEach { println(it) }
}
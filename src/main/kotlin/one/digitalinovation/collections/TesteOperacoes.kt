package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------------")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    // filter passamos um predicado onde quando o elemento for verdade ele vai inserindo numa nova lista esses valores
    //neste caso ele pegou a lista e vai criar outra somente com os valores acima de 2500.0
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-------------------------")
    salariosMaiorQue2500.forEach { println(it) }

}
package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    // filter passamos um predicado onde quando o elemento for verdade ele vai inserindo numa nova lista esses valores
    //neste caso ele pegou a lista e vai criar outra somente com os valores acima de 2500.0
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-------------------------")
    salariosMaiorQue2500.forEach { println(it) }

    println("-------------------------")
    //quantos salarios estão dentro de um range neste caso salarios que estão entre 2000.0 e 5000.0
    // nesse caso utilizamos o count passando um predicado e cria uma lista nova com a quantidade de elementos verdadeiros
    println("quant salarios dentro do range ${salarios.count { it in 2000.0..5000.0 }}")

    // agora vamos procurar dentro da lista um salario igual ao valor 2250.0
    // nesse caso utilizamos o find passando um predicado e cria uma lista nova com os elementos iguais
    println("-------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    // Verificar se há um elemento que seja igual ao predicado passado se há retorna true se não há na lista retorna false
    // utilizamos o any
    println("-------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 1010.0 })

}
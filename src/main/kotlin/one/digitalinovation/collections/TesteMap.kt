package one.digitalinovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    //Mapa é uma coleção de chaves e valores
    map1.forEach { (k, v) ->
        println("Chave: $k - Valor: $v")
    }
    //utitlizando a sintaxe do recurso infix
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    println("-------------------------")
    map2.forEach { (k, v) ->
        println("Chave: $k - Valor: $v")
    }

}
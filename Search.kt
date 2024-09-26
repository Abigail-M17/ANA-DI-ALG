fun main() {
    val x = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
    val n = 10
    println("$n is ${buscar(x, n)}")
}

fun buscar(list: List<Int>, n: Int): Boolean {
    //return list.contains(n)
    return list.any { it == n }
}

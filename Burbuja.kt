fun main() {
    val x = mutableListOf(1, 8, 4, 2, 7, 9, 3, 6, 5)
    println("Lista original: $x")
    x.ordenarBurbuja()
    println("Lista ordenada: $x")

}

//Extensûon function
fun MutableList<Int>.ordenarBurbuja() {
    val n = this.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (this[j] > this[j + 1]) {
                val aux = this[j]
                this[j] = this[j + 1]
                this[j + 1] = aux
            }
        }
    }
}



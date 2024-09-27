fun main() {
    val list = mutableListOf(5, 1, 9, 6, 2, 7, 8, 4, 9)
    println("Lista original: $list")
    list.quicksort()
    println("lista ordenada: $list")
}

fun <T : Comparable<T>> MutableList<T>.quicksort(lo: Int = 0, hi: Int = this.size - 1) {
    if (lo >= hi || lo < 0) return
    val p = partition(lo, hi)
    quicksort(lo, p - 1)
    quicksort(p + 1, hi)
}


fun <T : Comparable<T>> MutableList<T>.partition(lo: Int, hi: Int): Int {
    val pivot = this[hi]
    var i = lo

    for (j in lo until hi) {
        if (this[j] <= pivot) {
            this.swap(i, j)
            i++
        }
    }

    this.swap(i, hi)
    return i
}

fun <T> MutableList<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

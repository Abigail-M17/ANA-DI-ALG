fun main() {
    val list = mutableListOf(5, 1, 9, 6, 2, 7, 3, 8, 4, 9)
    println("Lista original: $list")
    println("Lista ordenada: ${list.quickSortMiddle()}")
}

fun <T: Comparable<T>> List<T>.quickSortMiddle() : List<T> {
    if (this.size < 2) return this
    val pivot = this[this.size / 2]
    val low = this.filter { it < pivot }
    val equal = this.filter { it == pivot }
    val high = this.filter { it > pivot }
    return low.quickSortMiddle() + equal + high.quickSortMiddle()
}


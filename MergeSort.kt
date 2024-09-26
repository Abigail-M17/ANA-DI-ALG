fun main() {
    val x = mutableListOf(1, 8, 4, 11, 2, 7, 9, 3, 6, 5, 10 )

    println("Lista original: $x")
    println("Lista ordenada: ${x.mergeSort()}")
}

fun <T : Comparable<T>> List<T>.mergeSort(): List<T> {
    if (this.size < 2) return this
    val middle = this.size / 2
    val left = this.subList(0, middle).mergeSort()
    val right = this.subList(middle, this.size).mergeSort()
    return merge(left, right)
}

fun <T : Comparable<T>> merge(left: List<T>, right: List<T>): List<T> {
    var leftIndex = 0
    var rightIndex = 0
    val result = ArrayList<T>()

    while (leftIndex < left.size && rightIndex < right.size) {
        if (left[leftIndex] < right[rightIndex]) {
            result.add(left[leftIndex])
            leftIndex++
        } else {
            result.add(right[rightIndex])
            rightIndex++
        }
    }

    if (leftIndex == left.size) result.addAll(right.subList(rightIndex, right.size))
    if (rightIndex == right.size) result.addAll(left.subList(leftIndex, left.size))

    return result
}

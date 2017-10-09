package search

import java.util.*

//bianry search algorithm

/*
// The iterative version of binary search
fun <T: Comparable<T>> binarySearch(list: List<T>, key: T): Int? {
    var rangeStart = 0
    var rangeEnd = list.count()
    while (rangeStart < rangeEnd) {
        val midIndex = rangeStart + (rangeEnd - rangeStart)/2
        if (list[midIndex] == key) {
            return midIndex
        } else if (list[midIndex] < key) {
            rangeStart = midIndex + 1
        } else {
            rangeEnd = midIndex
        }
    }
    return null
}
*/

//the recursuive version of binary search
fun <T: Comparable<T>> binarySearchRec(list: List<T>, key: T): Optional<Int> {
    require(list == list.sorted())

    fun helper(start: Int, end: Int): Optional<Int> {
        val mid: Int = start + (end - start) / 2
        if (end < start) return Optional.empty()

        if (key == list[mid]) {
            return Optional.of(mid)
        } else if (key < list[mid]) {
            return helper(start, mid - 1)
        } else {
            return helper(mid + 1, end)
        }
    }

    return helper(0, list.count())
}


//test
val numbers = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67)
val numbersKey = 43

//this will print out 6
fun main(args: Array<String>) {
    //val position = binarySearch(numbers, numbersKey)
    //println(position)
    val position = binarySearchRec(numbers, numbersKey)
    println(position)

}

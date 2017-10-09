package algorithms

fun <T:Comparable<T>>linearSearch(list:List<T>, key:T):Int?{
    for ((index, value) in list.withIndex()) {
        if (value == key) return index
    }
    return null
}

//Testing
val list = listOf(5, 4, 7, 32, 2, 7)
val key = 2

//This will print out 4
fun main(args: Array<String>) {
    val position = linearSearch(list, key)
    println(position)
}

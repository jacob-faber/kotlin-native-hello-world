fun main(args: Array<String>) {
    val items = listOf<String>("Hello", "World")
    items.forEach {
        println(it)
    }

    val result = (1..100).map {
        it * 2 + 4
    }.filter {
        it and 0 == 0
    }.sum()

    println(result)
}
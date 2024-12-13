import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val twoLists = input.map {
            val (first, second) = it.split("   ")
            first to second
        }
        println(twoLists)

        val firstList = twoLists.map { it.first.toInt() }.sorted()
        val secondList = twoLists.map { it.second.toInt() }.sorted()

        val pairedList = firstList.zip(secondList)
        val distances = pairedList.map { (first, second) -> abs(first - second) }
        println(distances)

        val distancesSum = distances.sumOf { it }

        return distancesSum
    }

    fun part2(input: List<String>): Int {
        val twoLists = input.map {
            val (first, second) = it.split("   ")
            first to second
        }
        println(twoLists)

        val firstList = twoLists.map { it.first.toInt() }.sorted()
        val secondList = twoLists.map { it.second.toInt() }.sorted()

        val pairedList = firstList.zip(secondList)
        val distances = pairedList.map { (first, second) -> abs(first - second) }
        println(distances)

        val similarityScore = pairedList.sumOf { (first, _) ->
            first * secondList.count { it == first }
        }

        return similarityScore
    }

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}

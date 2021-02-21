package unilecs

fun getLongestHarmonicSubsequence(array : Array<Int>) : Int {
    val valuesCount = mutableMapOf<Int, Int>()
    array.forEach { i -> valuesCount[i] = valuesCount.getOrDefault(i,0) + 1 }
    return valuesCount.keys.maxOf { n -> valuesCount[n]!! + valuesCount.getOrDefault(n + 1, -valuesCount[n]!!) }
}

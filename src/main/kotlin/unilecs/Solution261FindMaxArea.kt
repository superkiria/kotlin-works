package unilecs

import kotlin.math.abs

fun findMaxArea(walls : IntArray) : Int {
    var left = 0
    var right = walls.size - 1
    var maxArea = 0
    while (left != right) {
        maxArea = maxOf(maxArea, minOf(walls[left], walls[right]) * (right - left))
        if (walls[left] < walls[right]) left++ else right--
    }
    return maxArea;
}

fun findMaxAreaBruteForce(walls : IntArray) : Int {
    val wallsPositions = mutableListOf<Pair<Int, Int>>()
    for(i in walls.indices) {
        wallsPositions.add(Pair(walls[i], i))
    }
    wallsPositions.sortBy { pair -> -pair.first }
    var maxArea = 0
    for(i in wallsPositions.indices) {
        for(j in 0..i) {
            maxArea = maxOf(maxArea,
                wallsPositions[i].first * abs(wallsPositions[i].second - wallsPositions[j].second))
        }
    }
    return maxArea;
}

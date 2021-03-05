package unilecs

fun findMaxArea(walls : Array<Int>) : Int {
    val wallsPosition = mutableMapOf<Int, MutableList<Int>>()
    for(i in 0..walls.size) {
        if (walls[i] in wallsPosition) wallsPosition[walls[i]]?.add(i) else wallsPosition[walls[i]] = mutableListOf(i)
    }
    for(i in wallsPosition.keys.toList().sortedDescending()) {

    }
    return 0;
}
package unilecs

import kotlin.math.ceil
import kotlin.math.log2
import kotlin.math.min
import kotlin.math.pow

fun findMinOperationCount(x : Int, y : Int) : Int {
    val countMultiplyingBy2 = ceil(log2(y.toDouble() / x)).toInt() // посчитали умножения на 2
    val multiplierByTwo = 2.toFloat().pow(countMultiplyingBy2).toInt() // во сколько увеличили X умножая его на 2
    var diff = x * multiplierByTwo - y // разница, которую нужно покрыть вычитанием единиц
    var countDecrementByOne = diff / multiplierByTwo // столько вычитаний единиц ДО умножений на 2
    diff -= countDecrementByOne * multiplierByTwo // на столько уменьшился diff из-за вычитаний единиц до умножений на 2
    countDecrementByOne += diff.toString(2).count { c -> c == '1' } // считаем количество единиц в двоичной записи
                                                             // ...оствшегося значения diff - это остальные вычитания 1
    return countMultiplyingBy2 + countDecrementByOne // складываем все операции
}

fun findMinOperationCountRecursive(x : Int, y : Int) : Int {
    return findMinOperationCountRecursive(x, y, 0, mutableMapOf())
}

fun findMinOperationCountRecursive(x: Int, y: Int, depth : Int, depthOfX: MutableMap<Int, Int>): Int {
    if (x < 1) return Int.MAX_VALUE / 2
    if (x > y) return x - y
    if (x == y) return 0
    if (x in depthOfX && depthOfX[x]!! < depth) return Int.MAX_VALUE / 2
    depthOfX[x] = depth
    return 1 + min(findMinOperationCountRecursive(x - 1, y, depth + 1, depthOfX),
                    findMinOperationCountRecursive(x * 2, y, depth + 1, depthOfX))
}

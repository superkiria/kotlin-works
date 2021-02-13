package unilecs

import java.lang.Integer.max
import java.lang.Integer.min

fun getShortestDistanceToChar(s: String, c: Char): IntArray {
    val length = s.length
    val result = IntArray(length) { length }
    var previousSymbolPosition = -length
    var nextSymbolPosition = s.indexOf(c)
    do {
        for (i in max(0, previousSymbolPosition)..min(length - 1, nextSymbolPosition)) {
            result[i] = min(i - previousSymbolPosition, nextSymbolPosition - i)
        }
        previousSymbolPosition = nextSymbolPosition
        nextSymbolPosition = s.indexOf(c, nextSymbolPosition + 1)
        nextSymbolPosition = if (nextSymbolPosition > 0) { nextSymbolPosition } else length * 2
    } while (previousSymbolPosition < length)
    return result
}
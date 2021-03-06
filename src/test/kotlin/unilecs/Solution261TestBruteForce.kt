package unilecs

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Solution261TestBruteForce {

    @Test
    fun solution261TestBruteForce_01() {
        Assertions.assertEquals(18, findMaxAreaBruteForce(intArrayOf(1, 6, 5, 4, 8, 3, 2, 1)))
        Assertions.assertEquals(8, findMaxAreaBruteForce(intArrayOf(2, 1, 1, 1, 2)))
        Assertions.assertEquals(0, findMaxAreaBruteForce(intArrayOf(0, 2000, 0, 0, 0)))
        Assertions.assertEquals(0, findMaxAreaBruteForce(intArrayOf(0, 2000, 0, 0, -2000)))
        Assertions.assertEquals(49, findMaxAreaBruteForce(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
        Assertions.assertEquals(2, findMaxAreaBruteForce(intArrayOf(1, 3, 1)))
        Assertions.assertEquals(36, findMaxAreaBruteForce(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)))
        Assertions.assertEquals(28, findMaxAreaBruteForce(intArrayOf(1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3, 2, 1)))
    }

    @Test
    fun solution261TestBruteForce_02() {
        Assertions.assertEquals(99999, findMaxAreaBruteForce(IntArray(100000) { 1 }))
    }

    @Test
    fun solution261TestBruteForce_03() {
        Assertions.assertEquals(250000, findMaxAreaBruteForce(IntArray(1001) { i -> i }))
    }

    @Test
    fun solution261TestBruteForce_04() {
        Assertions.assertEquals(249995000, findMaxAreaBruteForce(IntArray(100000) { i -> i / 10 }))
    }

    @Test
    fun solution261TestBruteForce_05() {
        Assertions.assertEquals(9890100, findMaxAreaBruteForce(IntArray(100000) { i -> i % 100 }))
    }
}
package unilecs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

public class Solution260Test {

    @Test
    fun solution260Test_00() {
        val functionsList = listOf<(x : Int, y : Int) -> Int>(::findMinOperationCount, ::findMinOperationCountRecursive)
        functionsList.forEach { func -> solution260Test_01(func) }
    }

    private fun solution260Test_01(func : (x : Int, y : Int) -> Int) {
        assertEquals(2, func(2, 3), "$func")
        assertEquals(2, func(5, 8), "$func")
        assertEquals(3, func(1, 3), "$func")
        assertEquals(2, func(1, 4), "$func")
        assertEquals(5, func(1, 5), "$func")
        assertEquals(4, func(4, 10), "$func")
        assertEquals(1, func(4, 8), "$func")
        assertEquals(2, func(4, 16), "$func")
        assertEquals(7, func(4, 17), "$func")
        assertEquals(5, func(4, 128), "$func")
        assertEquals(14, func(27, 28), "$func")
        assertEquals(5, func(28, 100), "$func")
        assertEquals(22, func(32, 534), "$func")
        assertEquals(23, func(33, 534), "$func")
        assertEquals(6, func(34, 534), "$func")
        assertEquals(7, func(35, 534), "$func")
        assertEquals(8, func(36, 534), "$func")
        assertEquals(9, func(37, 534), "$func")
        assertEquals(10, func(38, 534), "$func")
        assertEquals(11, func(39, 534), "$func")
        assertEquals(12, func(40, 534), "$func")
        assertEquals(7, func(5, 21), "$func")
        assertEquals(28, func(53, 1000), "$func")
        assertEquals(500, func(999, 1000), "$func")
    }
}

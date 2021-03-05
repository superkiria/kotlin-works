package unilecs

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

class Solution261Test {

    @Test
    fun solution261Test_01() {
        Assertions.assertEquals(18, findMaxArea(intArrayOf(1, 6, 5, 4, 8, 3, 2, 1)))
        Assertions.assertEquals(8, findMaxArea(intArrayOf(2, 1, 1, 1, 2)))
        Assertions.assertEquals(0, findMaxArea(intArrayOf(0, 2000, 0, 0, 0)))
        Assertions.assertEquals(0, findMaxArea(intArrayOf(0, 2000, 0, 0, -2000)))
        Assertions.assertEquals(49, findMaxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
        Assertions.assertEquals(2, findMaxArea(intArrayOf(1, 3, 1)))
        Assertions.assertEquals(36, findMaxArea(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)))
        Assertions.assertEquals(28, findMaxArea(intArrayOf(1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3, 2, 1)))
    }

    @Test
    fun solution261Test_02() {
        Assertions.assertEquals(99999, findMaxArea(IntArray(100000) { 1 }))
    }

    @Test
    fun solution261Test_03() {
        val executor = ThreadPoolExecutor(0, Int.MAX_VALUE,
            60L, TimeUnit.SECONDS,
            SynchronousQueue<Runnable>()
        )
        for(size in 1..92683) {
            val worker = Runnable {
                if (
                    findMaxArea(IntArray(size) { i -> i + 1 }) != (size / 2) * ((size / 2) + size % 2)
                ) {
                    println(size.toString())
                }
            }
            while (executor.activeCount >= 12) {
//                Thread.sleep(10)
            }
            executor.submit(worker)
        }
        while (executor.activeCount > 0) {
            Thread.sleep(10)
        }
    }

    @Test
    fun solution261Test_04() {
        Assertions.assertEquals(249995000, findMaxArea(IntArray(100000) { i -> i / 10 }))
    }

    @Test
    fun solution261Test_05() {
        Assertions.assertEquals(9890100, findMaxArea(IntArray(100000) { i -> i % 100 }))
    }
}
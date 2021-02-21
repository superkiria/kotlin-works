package unilecs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Solution259Test {
    @Test
    fun solution259Test_01() {
        assertEquals(5, getLongestHarmonicSubsequence(arrayOf(2, 4, 3, 3, 6, 3, 4, 8)))
        assertEquals(2, getLongestHarmonicSubsequence(arrayOf(1, 2, 3, 4)))
        assertEquals(0, getLongestHarmonicSubsequence(arrayOf(1, 1, 1, 1)))

    }

    @Test
    fun solution259Test_02() {
        assertEquals(3, getLongestHarmonicSubsequence(arrayOf(1, 1, 2, 3, 4, 5)))
        assertEquals(2, getLongestHarmonicSubsequence(arrayOf(1, 2, 3, 4, 5)))
        assertEquals(8, getLongestHarmonicSubsequence(arrayOf(2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4)))
    }
}

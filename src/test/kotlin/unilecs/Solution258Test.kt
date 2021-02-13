package unilecs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Solution258Test {
    @Test
    fun solution258Test_01() {
        assertThat(getShortestDistanceToChar("unilecs", 'e').contentToString().equals("[4, 3, 2, 1, 0, 1, 2]"))
        assertThat(getShortestDistanceToChar("loveunilecs", 'e').contentToString().equals("[3, 2, 1, 0, 1, 2, 2, 1, 0, 1, 2]"))
        assertThat(getShortestDistanceToChar("aaab", 'b').contentToString().equals("[3, 2, 1, 0]"))
        assertThat(getShortestDistanceToChar("aaab", 'a').contentToString().equals("[0, 0, 0, 1]"))
        assertThat(getShortestDistanceToChar("a", 'a').contentToString().equals("[0]"))
        assertThat(getShortestDistanceToChar("abbbbbbbbb", 'a').contentToString().equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"))
        assertThat(getShortestDistanceToChar("aaaaaaa", 'a').contentToString().equals("[0, 0, 0, 0, 0, 0, 0]"))
        assertThat(getShortestDistanceToChar("aaaavaaa", 'v').contentToString().equals("[4, 3, 2, 1, 0, 1, 2, 3]"))
    }
}
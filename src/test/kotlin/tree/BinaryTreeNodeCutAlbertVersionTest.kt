package tree

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BinaryTreeNodeCutAlbertVersionTest {
    @Test
    @DisplayName("Test for cutting elements from binary tree - static version 01")
    fun cutTest01() {
        val bt = BinaryTree<Int>()
        bt.add(50)
        bt.add(45)
        bt.add(51)
        bt.add(20)
        bt.add(30)
        bt.add(30)
        bt.add(30)
        bt.add(47)
        bt.add(70)
        bt.add(60)
        assertThat(bt.toListString()).isEqualTo("ll=20 llr=30 l=45 lr=47 =50 r=51 rrl=60 rr=70")
        bt.cutA(46, 51)
        assertThat(bt.toListString()).isEqualTo("l=47 =50 r=51")
    }

    @Test
    @DisplayName("Test for cutting elements from binary tree - static version 02")
    fun cutTest02() {
        val bt = BinaryTree<Int>()
        bt.add(50)
        bt.add(45)
        bt.add(51)
        bt.add(20)
        bt.add(30)
        bt.add(30)
        bt.add(30)
        bt.add(47)
        bt.add(70)
        bt.add(60)
        assertThat(bt.toListString()).isEqualTo("ll=20 llr=30 l=45 lr=47 =50 r=51 rrl=60 rr=70")
        bt.cutA(21, 48)
        assertThat(bt.toListString()).isEqualTo("l=30 =45 r=47")
    }

    @Test
    @DisplayName("Test for cutting elements from binary tree - static version 03")
    fun cutTest03() {
        val bt = BinaryTree<Int>()
        bt.add(50)
        bt.add(45)
        bt.add(51)
        bt.add(20)
        bt.add(30)
        bt.add(30)
        bt.add(30)
        bt.add(47)
        bt.add(70)
        bt.add(60)
        assertThat(bt.toListString()).isEqualTo("ll=20 llr=30 l=45 lr=47 =50 r=51 rrl=60 rr=70")
        bt.cutA(55, 70)
        assertThat(bt.toListString()).isEqualTo("l=60 =70")
    }

    @Test
    @DisplayName("Test for cutting elements from binary tree - static version 04")
    fun cutTest04() {
        val bt = BinaryTree<Int>()
        bt.add(50)
        bt.add(45)
        bt.add(20)
        bt.add(30)
        bt.add(30)
        bt.add(30)
        bt.add(47)
        bt.add(70)
        bt.add(60)
        bt.add(80)
        bt.add(75)
        assertThat(bt.toListString()).isEqualTo("ll=20 llr=30 l=45 lr=47 =50 rl=60 r=70 rrl=75 rr=80")
        bt.cutA(31, 70)
        assertThat(bt.toListString()).isEqualTo("l=45 lr=47 =50 rl=60 r=70")
    }

}

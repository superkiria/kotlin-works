package tree

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BinaryTreeNodeCutTest {
    @Test
    @DisplayName("Test for cutting elements from binary tree 01")
    fun cutTest01() {
        val bt = BinaryTreeNode(50, null)
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
        bt.cut(46, 51)
        assertThat(bt.toListString()).isEqualTo("l=47 =50 r=51")
    }

    @Test
    @DisplayName("Test for cutting elements from binary tree 02")
    fun cutTest02() {
        val bt = BinaryTreeNode(50, null)
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
        bt.cut(21, 48)
        assertThat(bt.toListString()).isEqualTo("ll=30 l=45 =47")
    }

    @Test
    @DisplayName("Test for cutting elements from binary tree 03")
    fun cutTest03() {
        val bt = BinaryTreeNode(50, null)
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
        bt.cut(55, 70)
        assertThat(bt.toListString()).isEqualTo("=60 r=70")
    }

    @Test
    @DisplayName("Test for cutting elements from binary tree 04")
    fun cutTest04() {
        val bt = BinaryTreeNode(50, null)
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
        bt.cut(31, 70)
        assertThat(bt.toListString()).isEqualTo("l=45 lr=47 =50 rl=60 r=70")
    }
}
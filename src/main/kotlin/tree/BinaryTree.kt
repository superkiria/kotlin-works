package tree

class BinaryTree<T : Comparable<T>> {
    var head: BinaryTreeNode<T>? = null

    fun add(value: T) {
        if (head == null) {
            head = BinaryTreeNode(value, null)
        } else {
            head!!.add(value)
        }
    }

    fun remove(value: T) : Boolean {
        return head?.remove(value) ?: true
    }

    fun toListString(): String {
        return head?.toListString() ?: "="
    }

    fun cut(min : T, max : T) {
        head?.cutBottom(min)
        head?.cutTop(max)
    }

    fun cutA(min: T, max: T) {
        head = cutA(head, min, max)
    }

    fun cutA(root: BinaryTreeNode<T>?, min: T, max: T) : BinaryTreeNode<T>? {
        if (root == null) {
            return null
        }
        if (root.value!! < min) {
            return cutA(root.right, min, max)
        } else if (root.value!! > max) {
            return cutA(root.left, min, max)
        }
        root.left = cutA(root.left, min, max)
        root.right = cutA(root.right, min, max)
        return root
    }

}
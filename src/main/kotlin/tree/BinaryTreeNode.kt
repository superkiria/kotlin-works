package tree

class BinaryTreeNode <T : Comparable<T>>(var value: T?, var parent: BinaryTreeNode<T>?) {
    var left: BinaryTreeNode<T>? = null
    var right: BinaryTreeNode<T>? = null

    fun toListString() : String {
        return toListString("").trim()
    }

    private fun toListString(prefix : String) : String {
        val leftListString = left?.toListString("${prefix}l") ?: ""
        val rightListString = right?.toListString("${prefix}r") ?: ""
        return "$leftListString$prefix=$value $rightListString"
    }

    private fun isEndLeaf() : Boolean {
        return left == null && right == null
    }

    fun add(value: T) {
        if (this.value == null) {
            this.value = value
            return
        }
        if (this.value!! < value) {
            right = right?: BinaryTreeNode(value, this)
            right!!.add(value)
        }
        if (this.value!! > value) {
            left = left?: BinaryTreeNode(value, this)
            left!!.add(value)
        }
    }

    fun get(value: T): BinaryTreeNode<T>? {
        if (value == this.value!!) {
            return this
        }
        if (value > this.value!!) {
            return this.right?.get(value)
        }
        if (value < this.value!!) {
            return this.left?.get(value)
        }
        return null
    }

    private fun getMinValue(): T {
        return left?.getMinValue() ?: value!!
    }

    private fun getMaxValue(): T {
        return right?.getMaxValue() ?: value!!
    }

    fun remove(value: T) : Boolean {
        if (value == this.value) {
            if (isEndLeaf()) {
                this.value = null
                if (parent?.left == this) {
                    parent!!.left = null
                } else if (parent?.right == this) {
                    parent!!.right = null
                }
                return true
            }
            if (left != null) {
                val maxLeftValue = left!!.getMaxValue()
                this.remove(maxLeftValue)
                this.value = maxLeftValue
            } else if (right != null) {
                val maxRightValue = right!!.getMinValue()
                this.remove(maxRightValue)
                this.value = maxRightValue
            }
        }
        if (value > this.value!!) {
            return this.right?.remove(value) ?: false
        }
        if (value < this.value!!) {
            return this.left?.remove(value) ?: false
        }
        return false
    }

    fun cutBottom(min : T) {
        if (value!! <= min) {
            left = null
        }
        if (value!! < min) {
            remove(value!!)
            if (value != null) {
                this.cutBottom(min)
            }
        }
        if (left != null) {
            left!!.cutBottom(min)
        }
    }

    fun cutTop(max : T) {
        if (value!! >= max) {
            right = null
        }
        if (value!! > max) {
            remove(value!!)
            if (value != null) {
                this.cutTop(max)
            }
        }
        if (right != null) {
            right!!.cutTop(max)
        }
    }

}

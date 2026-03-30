class Solution {
    class Node(
        val index: Int,
        val x: Int,
        val y: Int,
        var left: Node? = null,
        var right: Node? = null
    ) {
        fun insert(node: Node) {
            if(node.x < this.x) {
                if (this.left == null) this.left = node
                else this.left?.insert(node)
            } else {
                if (this.right == null) this.right = node
                else this.right?.insert(node)
            }
        }
    }
    
    fun preOrder(node: Node?, list: MutableList<Int>) {
        if (node == null) return
        list.add(node.index)
        preOrder(node.left, list)
        preOrder(node.right, list)
    }
        
    fun postOrder(node: Node?, list: MutableList<Int>) {
        if (node == null) return
        postOrder(node.left, list)
        postOrder(node.right, list)
        list.add(node.index)
    }
    
    fun solution(nodeinfo: Array<IntArray>): Array<IntArray> {
        val sortedInfo = nodeinfo.mapIndexed { index, (x, y) ->
            Node(index + 1, x, y)
        }.sortedWith(
            compareByDescending<Node>{ it.y }.thenBy { it.x }
        )
        
        val root = sortedInfo[0]
        
        for (i in 1 until sortedInfo.size) {
            root.insert(sortedInfo[i])
        }
        
        val preOrderList = mutableListOf<Int>()
        val postOrderList = mutableListOf<Int>()
        
        preOrder(root, preOrderList)
        postOrder(root, postOrderList)
        
        return arrayOf(
            preOrderList.toIntArray(),
            postOrderList.toIntArray()
        )
    }
}
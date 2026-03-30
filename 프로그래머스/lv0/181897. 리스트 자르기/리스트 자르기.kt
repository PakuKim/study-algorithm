class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
 
        return slicer.let { (a,b,c) ->
            when(n) {
                1 -> { num_list.slice(0..b) }
                2 -> { num_list.slice(a..num_list.lastIndex) }
                3 -> { num_list.slice(a..b) }
                else -> { num_list.slice(a..b step c) }
            }.toIntArray()
        }
    }
}
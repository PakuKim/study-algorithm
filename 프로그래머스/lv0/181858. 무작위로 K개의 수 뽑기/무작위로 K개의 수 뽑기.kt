class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return arr.distinct().take(k).toMutableList().apply { 
            if (size < k) {
                repeat(k - size) {
                    add(-1)
                }
            }
        }.toIntArray()
    }
}
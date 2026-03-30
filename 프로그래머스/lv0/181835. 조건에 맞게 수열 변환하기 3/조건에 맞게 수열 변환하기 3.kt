class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return arr.map {
            if (k % 2 == 1) {
                it * k
            } else {
                it + k
            }
        }.toIntArray()
    }
}
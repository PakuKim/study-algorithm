class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        return array.count { it > height }
    }
}
class Solution {
    fun solution(array: IntArray): Int {
        val center = array.size / 2
        return array.sorted()[center]
    }
}
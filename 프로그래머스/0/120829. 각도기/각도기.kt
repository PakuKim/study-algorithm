class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        return when {
            angle < 90 -> 1
            angle == 90 -> 2
            angle < 180 -> 3
            else -> 4
        }
    }
}
class Solution {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0
        return strArr.groupBy { it.length }.values.maxOf { it.size }
    }
}
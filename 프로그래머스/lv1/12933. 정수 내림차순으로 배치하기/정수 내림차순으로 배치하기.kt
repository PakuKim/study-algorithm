class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        return n.toString().toList().sortedDescending().joinToString("").toLong()
    }
}
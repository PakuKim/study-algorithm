class Solution {
    fun solution(X: String, Y: String): String {
        val answer = mutableListOf<Int>()
        val countX = X.groupingBy { it }.eachCount()
        val countY = Y.groupingBy { it }.eachCount()
        
        for (d in '0'..'9') {
            val count = Math.min(countX[d] ?: 0, countY[d] ?: 0)
            repeat(count) { answer.add(d.digitToInt()) }
        }
        
        val result = answer.sortedDescending().joinToString("")
        
        return when {
            result.isEmpty() || result == "0" -> "-1"
            result.all { it == '0' } -> "0"
            else -> result
        }
    }
}
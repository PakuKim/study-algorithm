class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        queries.forEach { (start, end, min) ->
            arr.slice(start..end).filter { it > min }.minByOrNull { it }.let {
                answer += it ?: -1
            }
        }
        
        return answer
    }
}
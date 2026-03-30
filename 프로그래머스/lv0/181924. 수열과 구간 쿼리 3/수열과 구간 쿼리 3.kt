class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        for (query in queries) {
            val a = answer[query[0]]
            val b = answer[query[1]]
            answer[query[0]] = b
            answer[query[1]] = a
        }
        
        return answer
    }
}
class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.map { (s, e) -> 
            (s..e).forEach {
                answer[it]++
            }
        }
        
        return answer
    }
}
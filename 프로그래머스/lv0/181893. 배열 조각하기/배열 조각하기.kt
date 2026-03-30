class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = arr
        
        query.mapIndexed { index, q ->
            answer = if(index % 2 == 0) {
                answer.slice(0..q)
            } else {
                answer.slice(q..answer.lastIndex)
            }.toIntArray()
        }
        
        return answer
    }
}
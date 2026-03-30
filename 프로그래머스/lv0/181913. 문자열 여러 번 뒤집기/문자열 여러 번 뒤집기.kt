class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        queries.forEach { (start, end) ->
            val a = answer.substring(start..end)
            answer = answer.replaceRange(start..end, a.reversed())
        }
        
        return answer
    }
}
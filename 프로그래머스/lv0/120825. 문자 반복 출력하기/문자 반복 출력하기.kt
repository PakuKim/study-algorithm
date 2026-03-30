class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
       
        my_string.forEach { a ->
            repeat(n) {
                answer += a
            }
        }
        
        return answer
    }
}
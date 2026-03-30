class Solution {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        val a = num_str.toList()
        
        for(i in a.indices) {
            answer += a[i].digitToInt()
        }
        
        return answer
    }
}
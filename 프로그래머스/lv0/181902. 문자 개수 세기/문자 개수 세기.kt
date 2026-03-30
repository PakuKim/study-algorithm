class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        
        ('A'..'z').forEach {
            if (it.isLetter()) answer += my_string.count { a -> it == a }
        }
        return answer
    }
}
class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        my_string.let { string ->
            repeat(string.length) {
                answer += string.substring(it, string.length)
            }
        }
        
        return answer.sortedArray()
    }
}
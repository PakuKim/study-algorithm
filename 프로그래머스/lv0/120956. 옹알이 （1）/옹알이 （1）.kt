class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        
        babbling.forEach {
            val result = it.split("aya", "ye", "woo", "ma")
            if (result.all { it == ""}) {
                answer++
            }
        }
        
        return answer
    }
}
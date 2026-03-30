class Solution {
    fun solution(age: Int): String {
        var answer: String = ""
        val alp = ('a' .. 'j').toList()
        
        age.toString().forEach {
            answer += alp[it.digitToInt()]
        }
        
        return answer
    }
}
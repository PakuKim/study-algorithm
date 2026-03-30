class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        val a = my_string.replace(" ", "\n")
        
        a.lines().onEach {
            if (it != "") {
               answer += it
            }
            
        }
        
        return answer
    }
}
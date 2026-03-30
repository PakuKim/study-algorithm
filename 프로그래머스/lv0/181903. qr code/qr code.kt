class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        
        return code.mapIndexed { index, n ->
            if (index % q == r) n
            else ""
        }.joinToString("")
    }
}
class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        var rotate = s.toMutableList()
        for (i in 0 until s.length - 1) {
            if (check(rotate)) answer++
            rotate.add(rotate.lastIndex, rotate.removeAt(0))
        }
        
        return answer
    }
    
     fun check(rotate: List<Char>): Boolean {
        var text = rotate.joinToString("")
        val regex = Regex("\\(\\)|\\[\\]|\\{\\}")
        while(regex.containsMatchIn(text)) {
            text = text.replace(regex, "")
        }
        
        return text.isEmpty()
    }
}
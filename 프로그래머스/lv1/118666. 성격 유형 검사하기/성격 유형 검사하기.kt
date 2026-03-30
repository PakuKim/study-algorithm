class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val answer = mutableMapOf<Char, Int>()
        
        for ((index, a) in survey.withIndex()) {
            val p1 = a[0]
            val p2 = a[1]
            val choice = choices[index]
            
            if (choice >= 4) answer[p2] = (answer[p2] ?: 0) + Math.abs(choice - 4)
            else answer[p1] = (answer[p1] ?: 0) + Math.abs(choice - 4)
        }
        
        return buildString {
            if (((answer['R'] ?: 0) - (answer['T'] ?: 0)) >= 0) append("R") 
            else append("T")
            
            if (((answer['C'] ?: 0) - (answer['F'] ?: 0)) >= 0) append("C") 
            else append("F")
            
            if (((answer['J'] ?: 0) - (answer['M'] ?: 0)) >= 0) append("J") 
            else append("M")
            
            if (((answer['A'] ?: 0) - (answer['N'] ?: 0)) >= 0) append("A") 
            else append("N")
        }
    }
}
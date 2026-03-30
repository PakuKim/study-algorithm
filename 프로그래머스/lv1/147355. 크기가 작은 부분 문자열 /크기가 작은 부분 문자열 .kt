class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val comparator = p.toLong() 
        
        (0 .. (t.length - p.length)).forEach {
            val a = t.substring(it .. (it + p.length - 1)).toLong()
            
            if (comparator >= a) {
                answer++
            }
        }
        
        return answer
    }
}
class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        var new = ""
        for (i in myString) {
            new += if (i == 'A') 'B' else 'A'
        }
        
        return new.contains(pat).let { if(it) 1 else 0 }
    }
}
class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var remain = n
        
        while (remain >= a) {
            val obtain = remain / a * b
            remain -= remain / a * a
            remain += obtain
            answer += obtain
        }
        
        return answer
    }
}
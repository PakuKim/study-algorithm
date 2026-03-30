class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        val a = total / num
        val start = if (num % 2 == 1) {
            num / 2
        } else {
            num / 2 - 1
        }
        
        (a - start .. a + num / 2).forEach {
            answer += it
        }
        
        return answer
    }
}
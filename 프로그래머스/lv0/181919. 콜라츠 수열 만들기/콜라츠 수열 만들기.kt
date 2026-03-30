class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var value = n
        while(value != 1) {
            answer += value 
            
            value = if (value % 2 == 0) {
                value / 2
            } else {
                3 * value + 1
            }
        }
        
        return answer + 1
    }
}
class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var number = num.toLong()
        
        while(number != 1L) {
            if (answer == 500) return -1
            
            number = if (number % 2 == 0L) {
                number / 2
            } else {
                number * 3 + 1
            }
            
            answer++
        }
        
        return answer
    }
}
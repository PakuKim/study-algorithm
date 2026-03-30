class Solution {
    fun solution(storey: Int): Int {
        var answer = 0
        var n = storey
        
        while(n > 0) {
            val digit = n % 10
            n /= 10
            
            if (digit < 5) {
                answer += digit
            } else if (digit > 5) {
                answer += (10 - digit)
                n++
            } else {
                if (n % 10 >= 5) {
                    n++
                } 
                answer += 5
            }
        }
        
        return answer
    }
}
class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        return if(check(b / gcp(a,b))) 1 else 2
    }
    
    fun gcp(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcp(b, a % b)
    }
    
    fun check(n: Int): Boolean {
        var num = n
        var div = 2
        while (num > 1) {
            if (num % div == 0) {
                num /= div
                when {
                    div == 2 || div == 5 -> continue
                    else -> return false
                }
            } else {
                div++
            }
        }
        
        return true
    }
}
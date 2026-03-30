class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
 
        for (i in 0 until nums.size) {
            for (j in (i + 1) until nums.size) {
                for (k in (j + 1) until nums.size) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++
                }
            }
        }

        return answer
    }
    
    fun isPrime(num: Int): Boolean {
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        return true
    }
}
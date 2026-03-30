class Solution {
    fun solution(numbers: String): Int {
        val nums = numbers.toCharArray()
        val visited = BooleanArray(nums.size)
        val primes = mutableSetOf<Int>()
        
        tailrec fun dfs(cur: String) {
            if (cur.isNotEmpty()) {
                val num = cur.toInt()
                if (num >= 2) primes.add(num)
            }
  
            for (i in nums.indices) {
                if (visited[i]) continue
                
                visited[i] = true
                dfs(cur + nums[i])
                visited[i] = false
            }
        }
        
        dfs("")
        
        return primes.count { isPrime(it) }
    }
    

    fun isPrime(num: Int): Boolean {
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }
}
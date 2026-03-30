class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        
        n.toString(k).split('0').forEach {
            if (it.isEmpty() || it == "1") return@forEach
            if (it.toBigInteger().isProbablePrime(1)) answer++
        }
        
        return answer
    }
    
    fun checkPrime(n: Long): Boolean {
        for (i in 2 .. Math.sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) return false
        }
        return true
    }
}
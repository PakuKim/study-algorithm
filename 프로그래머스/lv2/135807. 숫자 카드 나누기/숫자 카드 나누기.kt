class Solution {
    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        val a = check(arrayA.reduce { acc, i -> gcd(acc, i) }, arrayB)
        val b = check(arrayB.reduce { acc, i -> gcd(acc, i) }, arrayA)
        
        return maxOf(a, b)
    }
    
    tailrec fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b) 
    }
    
    fun check(a: Int, opponent: IntArray): Int {
        for (b in opponent) {
            if (b % a == 0) return 0
        }
        return a
    }
}
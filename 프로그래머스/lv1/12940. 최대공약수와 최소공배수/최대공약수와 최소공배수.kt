class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        return (gcd(n,m)).let {
            intArrayOf(it, (n * m) / it)
        }
    }
    
    fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        else return gcd (b, a % b)
    } 
}
class Solution {
    fun solution(arr: IntArray): Int {
        val sortedArr = arr.sortedByDescending { it }
        var answer = arr[0]
        for (i in 1 until arr.size) {
             val next = arr[i]
             answer = (answer * next) / gcd(answer, next)
        }
        return answer
    }
    
    fun gcd(a: Int, b: Int): Int {
        return if (b != 0) gcd(b, a % b) else a
    }
}
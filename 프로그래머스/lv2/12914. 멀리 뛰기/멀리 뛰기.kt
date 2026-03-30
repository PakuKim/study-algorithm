class Solution {
    fun solution(n: Int): Long {
        return fibo(n, 0, 1)
    }

    tailrec fun fibo(n: Int, a: Long, b: Long): Long {
        val sum = (a + b) % 1234567L
        return if (n <= 1) return sum
        else fibo(n - 1, b, sum)
    }
}
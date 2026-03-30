class Solution {
    fun solution(polynomial: String): String {
        var answer: String = ""
        return polynomial.split(" ").let {
            val a = it.filter { it.contains("x") }.map {
                it.replace("x", "").let { if (it.isBlank()) 1 else it.toInt() }
            }.sum()

            val b = it.filter { it.all { it.isDigit() } }.sumOf { it.toInt() }

            when {
                a == 0 -> "$b"
                b == 0 -> a.let { if (it > 1) "${a}x" else "x" }
                else -> a.let { if (it > 1) "${a}x + $b" else "x + $b" }
            }
        }
    }
}
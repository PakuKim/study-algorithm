class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        return binomial.split(" ").let { (a, op, b) -> 
            val intA = a.toInt()
            val intB = b.toInt()
            when(op) {
                "-" -> intA -intB
                "*" -> intA * intB
                else -> intA + intB
            }
        }
    }
}
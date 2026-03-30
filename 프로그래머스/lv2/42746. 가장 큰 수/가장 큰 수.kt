class Solution {
    fun solution(numbers: IntArray): String {
        return numbers.map(Int::toString).sortedWith { a, b ->
            (b + a).compareTo(a + b)
        }.joinToString("").let {
            if (it[0] == '0') "0" else it
        }
    }
}
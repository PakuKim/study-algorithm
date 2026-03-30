class Solution {
    fun solution(s: String): IntArray {
        return s.substring(2 until s.length-2)
            .split("},{")
            .map { it.split(",").map { num -> num.toInt() } }
            .sortedBy { it.size }
            .flatten()
            .distinct()
            .toIntArray()
    }
}
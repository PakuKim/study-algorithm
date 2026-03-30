class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        return (left..right).map { 
            (Math.max(it % n, it / n) + 1).toInt() 
        }.toIntArray()
    }
}
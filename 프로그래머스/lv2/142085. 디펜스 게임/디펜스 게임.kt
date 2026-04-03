import java.util.*

class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var answer = 0
        var remain = n
        var shield = k
        val pq = PriorityQueue<Int> { a, b -> b - a }
        for (e in enemy) {
            pq.add(e)
            if (remain - e < 0) {
                if (shield > 0) {
                    remain += pq.poll()!!
                    shield--
                } else {
                    break
                }
            }
            remain -= e
            answer++
        }

        return answer
    }
}
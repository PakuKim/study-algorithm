class Solution {
    fun solution(weights: IntArray): Long {
        var answer: Long = 0
        val map = mutableMapOf<Int, Long>()
        
        weights.sort()
        for (weight in weights) {
            answer += map.getOrDefault(weight, 0)
            if (weight % 2 == 0) {
                answer += map.getOrDefault(weight / 2, 0)
            }
            if (weight * 2 % 3 == 0) {
                answer += map.getOrDefault(weight * 2 / 3, 0)
            }
            if (weight * 3 % 4 == 0) {
                answer += map.getOrDefault(weight * 3 / 4, 0)
            }
            map[weight] = map.getOrDefault(weight, 0) + 1
        }
        return answer
    }
}
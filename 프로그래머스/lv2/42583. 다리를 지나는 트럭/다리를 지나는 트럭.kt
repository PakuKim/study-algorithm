class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val queue = ArrayDeque<Int>().apply { repeat(bridge_length) { addLast(0) } }
        var index = 0
        var currentWeight = 0
        
        while (index < truck_weights.size) {
            answer++
            currentWeight -= queue.removeFirst()
            
            val truck = truck_weights[index]
            if (currentWeight + truck <= weight) {
                queue.addLast(truck)
                currentWeight += truck
                index++
            } else {
                queue.addLast(0)
            }
        }
        
        return answer + bridge_length
    }
}
import java.util.PriorityQueue
import java.util.TreeMap

class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = IntArray(2)
        
        val map = TreeMap<Int, Int>()
        for (operation in operations) {
            when(operation) {
                
                "D 1" -> {
                    if (map.isEmpty()) continue 
                    val key = map.lastKey()
                    val count = map[key]!!
                    if (count == 1) map.pollLastEntry()
                    else map[key] = count - 1
                }
                "D -1" -> {
                    if (map.isEmpty()) continue 
                    val key = map.firstKey()
                    val count = map[key]!!
                    if (count == 1) map.pollFirstEntry()
                    else map[key] = count - 1
                }
                else -> operation.replace("I ", "").toInt().let {
                    map[it] = map.getOrDefault(it, 0) + 1
                }
            }
        }
        if (map.isEmpty()) return intArrayOf(0, 0)
        return intArrayOf(map.lastKey(), map.firstKey())
        
//         val minQueue = PriorityQueue<Int>()
//         val maxQueue = PriorityQueue<Int> { a, b -> b - a }
//         for (operation in operations) {
//             when(operation) {
//                 "D 1" -> {
//                     val max = maxQueue.poll() ?: continue
//                     minQueue.remove(max)
//                 }
//                 "D -1" -> {
//                     val min = minQueue.poll() ?: continue
//                     maxQueue.remove(min)
//                 }
//                 else -> operation.replace("I ", "").toInt().let {
//                     maxQueue.add(it)
//                     minQueue.add(it)
//                 }
//             }
//         }
        
//         answer[0] = maxQueue.peek() ?: 0
//         answer[1] = minQueue.peek() ?: 0
        
        return answer
    }
}
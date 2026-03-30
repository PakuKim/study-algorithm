class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = IntArray(progresses.size)
        
        val queue = ArrayDeque<Int>().apply {
            add(calculate(progresses[0], speeds[0]))
        }
        
        var count = 0
        while(queue.isNotEmpty()) {
            val days = queue.removeFirst()
            val next = answer.sum()
            
            for (i in next until progresses.size) {
                val result = progresses[i] + (days * speeds[i])
                if (result >= 100) {
                    answer[count]++
                } else {
                    queue.add(calculate(progresses[i], speeds[i]))
                    break
                }
            }
            
            count++
        }

        return answer.toMutableList().apply { removeAll { it == 0 } }.toIntArray()
    }
    
    fun calculate(progress: Int, speed: Int): Int {
        return (100 - progress).run { (this + speed - 1) / speed }
    }
}
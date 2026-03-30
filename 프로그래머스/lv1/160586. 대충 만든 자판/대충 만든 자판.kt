class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = IntArray(targets.size)
        
        val max = keymap.maxOf { it.length } + 1
        for ((i, target) in targets.withIndex()) {
            for (alp in target) {
                var index = 0
                while (index < max) {
                    if (keymap.any { it.getOrNull(index) == alp }) break
                    else index++
                }
                
                if (index == max) {
                    answer[i] = -1
                    break
                } else {
                    answer[i] += (index + 1)
                }
            }
        }
        
        return answer
    }
}
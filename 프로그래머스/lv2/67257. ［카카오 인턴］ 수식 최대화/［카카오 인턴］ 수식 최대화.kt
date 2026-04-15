class Solution {
    private val numbers = mutableListOf<Long>()
    private val operators = mutableListOf<Char>()
    
    fun solution(expression: String): Long {
        var answer: Long = 0
        val numTemp = StringBuilder()
        for (c in expression) {
            when (c) {
                '*', '+', '-' -> {
                    operators.add(c)
                    numbers.add(numTemp.toString().toLong())
                    numTemp.clear()
                }
                else -> numTemp.append(c)
            }
        }
        numbers.add(numTemp.toString().toLong())
        
        val ops = operators.distinct()
        val visited = BooleanArray(ops.size)
        val priority = mutableListOf<Char>()
        fun dfs(depth: Int) {
            if (depth == ops.size) {
                answer = maxOf(answer, calc(priority))
                return
            }
            
            for (i in ops.indices) {
                if (!visited[i]) {
                    visited[i] = true
                    priority.add(ops[i])
                    
                    dfs(depth + 1)
                    
                    priority.removeLast()
                    visited[i] = false
                }
            }
        }
        dfs(0)
        
        return answer
    }
    
    private fun calc(priority: List<Char>): Long {
        val nums = numbers.toMutableList()
        val ops = operators.toMutableList()

        for (p in priority) {
            var i = 0
            while (i < ops.size) {
                if (ops[i] == p) {
                    nums[i] = when(p) {
                        '*' -> nums[i] * nums[i + 1]
                        '+' -> nums[i] + nums[i + 1]
                        '-' -> nums[i] - nums[i + 1]
                        else -> 0
                    }
                    nums.removeAt(i + 1)
                    ops.removeAt(i)
                } else {
                    i++
                }
            }
        }

        return Math.abs(nums[0])
    }
}
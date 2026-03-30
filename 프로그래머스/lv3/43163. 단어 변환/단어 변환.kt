class Solution {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (!words.contains(target)) return 0
        
        val visited = BooleanArray(words.size)
        val queue = ArrayDeque<Pair<String,Int>>().apply {
            add(begin to 0)
        }
        
        fun check(a: String, b: String): Boolean {
            var diff = 0
            for (i in a.indices) {
                if (a[i] != b[i]) diff++ 
            }
            
            return diff == 1
        }
        
        while(queue.isNotEmpty()) {
            val (cur, count) = queue.removeFirst()
            if (cur == target) return count
            
            for (i in words.indices) {
                if (!visited[i] && check(cur, words[i])) {
                    visited[i] = true
                    queue.add(words[i] to count + 1)
                }
            }
        }
        
        return 0
    }
}
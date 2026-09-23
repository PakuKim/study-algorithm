class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        tickets.sortBy { it[1] }
        val visited = BooleanArray(tickets.size)
        val path = mutableListOf<String>()

        fun dfs(from: String): Boolean {
            path.add(from)
            if (path.size == tickets.size + 1) return true

            for (i in tickets.indices) {
                val (start, end) = tickets[i]
                if (start == from && !visited[i]) {
                    visited[i] = true
                    if (dfs(end)) return true
                    visited[i] = false
                }
            }

            path.removeAt(path.lastIndex)
            return false
        }

        dfs("ICN")
        return path.toTypedArray()
    }
}
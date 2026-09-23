class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val path = mutableListOf<String>()
        val visited = BooleanArray(tickets.size)
        tickets.sortBy { it[1] }

        fun dfs(from: String) {
            if (path.size == tickets.size) {
                path.add(from)
            }

            for(i in tickets.indices) {
                val (start, end) = tickets[i]

                if (start == from && !visited[i]) {
                    visited[i] = true
                    path.add(start)
                    dfs(end)
                    if (path.size < tickets.size) {
                        path.removeAt(path.lastIndex)
                        visited[i] = false
                    }
                }
            }
        }

        dfs("ICN")
        
        return path.toTypedArray()
    }
}
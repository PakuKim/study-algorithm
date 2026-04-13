class Solution {
        private lateinit var sketch: Array<CharArray>
        private val maxRow by lazy { sketch.size }
        private val maxCol by lazy { sketch[0].size }
        private val visited by lazy { Array(maxRow) { BooleanArray(maxCol) } }

        fun solution(maps: Array<String>): IntArray {
            sketch = maps.map { it.toCharArray() }.toTypedArray()
            val answer = mutableListOf<Int>()

            for (r in 0 until maxRow) {
                for (c in 0 until maxCol) {
                    if (sketch[r][c] == 'X' || visited[r][c]) continue
                    answer.add(dfs(r, c))
                }
            }

            return answer.ifEmpty { mutableListOf(-1) }.sorted().toIntArray()
        }

        fun dfs(r: Int, c: Int): Int {
            if (r !in 0 until maxRow || c !in 0 until maxCol || 
                sketch[r][c] == 'X' || visited[r][c]
            ) return 0
            
            visited[r][c] = true
            var sum = sketch[r][c].digitToInt()

            sum += dfs(r - 1, c)
            sum += dfs(r + 1, c)
            sum += dfs(r, c - 1)
            sum += dfs(r, c + 1)

            return sum
        }
    }
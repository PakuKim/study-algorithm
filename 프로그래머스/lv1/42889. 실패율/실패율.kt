class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val average = DoubleArray(N)
        repeat(N) {
            val stage = (it + 1)
            val current = stages.count { it == stage }.toDouble()
            val total = stages.count { it >= stage }.toDouble()

            average[it] = (current / total).takeIf { !it.isNaN() } ?: 0.0
        }

        return average.mapIndexed { index, a -> (index + 1) to a }
            .sortedWith(compareByDescending<Pair<Int, Double>> 
                    { it.second }.thenBy { it.first })
            .map { it.first }
            .toIntArray()
    }
}
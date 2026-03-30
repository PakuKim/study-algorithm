class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        return score.map {
            it.average()
        }.let { average ->
            
            average.map { a ->
                average.count { it > a } + 1
            }.toIntArray()
        }
    }
}
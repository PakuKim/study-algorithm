class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer: Int = 0
        return rank.filterIndexed { index, _ -> 
            attendance[index]
        }.sorted().take(3).let { (a, b, c) -> 
            (rank.indexOf(a) * 10_000) + (rank.indexOf(b) * 100) + rank.indexOf(c)
        }
    }
}
class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        return s.split(" ").let {
            it.mapIndexed { index, a ->
                if (a == "Z") it[index - 1].toInt().let { it - (it + it) }
                else a.toInt()
            }.sum()
        }
    }
}
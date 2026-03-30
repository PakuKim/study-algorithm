class Solution {
    fun solution(n: Int): String {
        var answer = "박수"
        return (1 .. n).map {
            answer[it % 2]
        }.joinToString("")
    }
}
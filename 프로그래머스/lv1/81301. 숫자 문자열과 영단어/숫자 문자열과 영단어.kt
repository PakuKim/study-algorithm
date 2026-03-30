class Solution {
    fun solution(s: String): Int {
        var answer = s
        val numStringList = listOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
        )
        for (i in 0 until 10) {
            answer = answer.replace(numStringList[i], i.toString())
        }
        return answer.toInt()
    }
}
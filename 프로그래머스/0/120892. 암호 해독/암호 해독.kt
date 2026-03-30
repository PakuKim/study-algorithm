class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        return cipher.mapIndexed { index, c ->
            if ((index + 1) % code == 0) c
            else ""
        }.joinToString("")
    }
}
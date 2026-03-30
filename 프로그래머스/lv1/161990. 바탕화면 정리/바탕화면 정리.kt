class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer = IntArray(4) { 0 }
        
        answer[0] = 51
        answer[1] = 51
        
        wallpaper.forEachIndexed { index, word ->
            val l = word.indexOfFirst { it == '#' }.takeIf { it >= 0 } ?: return@forEachIndexed
            val r = word.indexOfLast { it == '#' }.takeIf { it >= 0 } ?: return@forEachIndexed

            if (answer[0] > index) {
                answer[0] = index
            }
            if (answer[1] > l) {
                answer[1] = l
            }
            if (answer[2] <= index) {
                answer[2] = index + 1
            }
            if (answer[3] <= r) {
                answer[3] = r + 1
            }
        }
        
        return answer
    }
}
class Solution {
    fun solution(message: String, spoiler_ranges: Array<IntArray>): Int {
        val length = message.length
        val isSpoiler = BooleanArray(length)

        for ((start, end) in spoiler_ranges) {
            (start..end).forEach { isSpoiler[it] = true }
        }

        val spoilers = mutableSetOf<String>()
        val words = mutableSetOf<String>()
        var start = 0
        var hasSpoiler = false

        for (i in 0..length) {
            if (i == length || message[i] == ' ') {
                val word = message.substring(start, i)
                if (hasSpoiler) spoilers.add(word)
                else words.add(word)

                start = i + 1
                hasSpoiler = false
            } else {
                if (isSpoiler[i]) hasSpoiler = true
            }
        }

        return spoilers.count { it !in words }
    }
}
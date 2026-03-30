class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return names.toList().chunked(5).map {
            it[0]
        }.toTypedArray()
    }
}
class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return myStr.split('a', 'b', 'c').toMutableList().apply { 
            removeAll { it.isBlank() }
        }.ifEmpty { listOf("EMPTY") }.toTypedArray()
    }
}
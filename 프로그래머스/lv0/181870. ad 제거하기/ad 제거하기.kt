class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return strArr.toMutableList().apply { 
            removeAll { it.contains("ad") }
        }.toTypedArray()
    }
}
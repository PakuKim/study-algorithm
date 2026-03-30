class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return strArr.mapIndexed { index, a ->
            if (index % 2 == 0) a.lowercase() else a.uppercase()
        }.toTypedArray()
    }
}
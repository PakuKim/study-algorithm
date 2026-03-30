class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()

        my_string.toCharArray().onEach {
            if (it.isDigit()) answer += Character.getNumericValue(it)
        }

        return answer.sortedArray()
    }
}
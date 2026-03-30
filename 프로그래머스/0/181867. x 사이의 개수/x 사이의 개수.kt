class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        return myString.split("x").map { 
            it.length
        }.toIntArray()
    }
}
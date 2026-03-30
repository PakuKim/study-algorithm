class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        return arr.map {
            if (it >= 50) {
                if (it % 2 == 0) {
                    it / 2
                } else {
                    it
                }
            } else {
                if (it % 2 == 1) {
                    it * 2
                } else {
                    it
                }
            }
        }.toIntArray()
    }
}
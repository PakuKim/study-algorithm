class Solution {
    fun solution(myString: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return myString.split("x").map {
            it.replace("x", "")
        }.toMutableList().apply {
            this.removeAll { it.isBlank() }
        }.toTypedArray().sortedArray()
    }
}
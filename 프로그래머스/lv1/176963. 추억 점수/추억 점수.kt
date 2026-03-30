class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val table = HashMap<String, Int>().apply {
            name.forEachIndexed { index, a ->
                this.put(a, yearning[index])
            }
        }

        return photo.map { 
            it.sumOf { 
                table[it] ?: 0
            }
        }.toIntArray()
    }
}
class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val table = hashMapOf<Char, Int>()
        
        return s.mapIndexed { index, c ->
            var n = -1
            if (table.contains(c)) {
                n = index - table[c]!!
            }
            table[c] = index
            
            n
        }.toIntArray()
    }
}
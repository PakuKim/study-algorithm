class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 0
        return dic.any {
            it.toList().containsAll(spell.map { it[0] })
        }.let { 
            if (it) 1 else 2
        }
    }
}
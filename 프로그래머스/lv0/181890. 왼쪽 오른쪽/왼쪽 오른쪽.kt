class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val i = str_list.indexOfFirst { it == "l" || it == "r" }
        
        if (i == -1) return emptyArray()
        
        return str_list.let {
            if (it[i] == "l") it.slice(0..i - 1)
            else it.slice(i + 1..it.lastIndex)
        }.toTypedArray()
    }
}
class Solution {
    fun solution(new_id: String): String {
        var answer: String = new_id.lowercase()
            
        val allowedList = listOf('_', '-', '.')
        val list = mutableListOf<Char>()
        for (c in answer) {
            if ((c.isLetterOrDigit() || allowedList.contains(c))) {
                if ((c == '.' && list.lastOrNull() == '.') ||
                        (c == '.' && list.isEmpty())) {
                    continue
                } else {
                    list.add(c)
                }
            }
            
            if (list.size >= 15) break
        }
        
        if (list.lastOrNull() == '.') list.removeLast()
        
        if (list.size < 3) {
            repeat(3 - list.size) { list.add(list.lastOrNull() ?: 'a') }
        }
        
        return list.joinToString("")
    }
}
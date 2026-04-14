class Solution {
    fun solution(p: String): String {
        return toCorrectParenthesis(p)
    }

    fun toCorrectParenthesis(w: String): String {
        if (w.isEmpty()) return w
        
        val (u, v) = splitText(w)
        
        return if (isCorrectParenthesis(u)) {
            u + toCorrectParenthesis(v)
        } else {
            "(" + toCorrectParenthesis(v) + ")" + reverseText(u)
        }
    }

    fun splitText(w: String): Pair<String, String> {
        var openerCount = 0
        for ((i, c) in w.withIndex()) {
            openerCount += if (c == '(') 1 else -1
            if (openerCount == 0) return w.substring(0, i + 1) to w.substring(i + 1)
        }
        return w to ""
    }

    fun reverseText(w: String): String {
        val temp = StringBuilder()
        for (i in 1 until w.length - 1) {
            temp.append(if (w[i] == '(') ')' else '(')
        }
        return temp.toString()
    }

    fun isCorrectParenthesis(parenthesis: String): Boolean {
        var openerCount = 0
        for (c in parenthesis) {
            openerCount += if (c == '(') 1 else -1
            if (openerCount < 0) return false
        }
        return true
    }
}
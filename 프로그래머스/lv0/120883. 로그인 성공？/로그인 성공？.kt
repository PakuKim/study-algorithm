class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        return when {
            db.any { it.contentEquals(id_pw) } -> "login"
            db.any { id_pw[0] == it[0] } -> "wrong pw"
            else -> "fail"
            //db.none { it.contentEquals(id_pw) } -> "fail"
            //else -> ""
        }
    }
}
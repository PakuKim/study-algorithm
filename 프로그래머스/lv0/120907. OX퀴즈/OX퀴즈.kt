class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return quiz.map {
            it.split(" ").let { (a, op, b, _, t) ->
                val intA = a.toInt()
                val intB = b.toInt()
                val intT = t.toInt()
                if (op == "-") {
                    if (intA - intB == intT) "O"
                    else "X"
                } else {
                    if (intA + intB == intT) "O"
                    else "X"
                }
            }
        }.toTypedArray()
    }
}
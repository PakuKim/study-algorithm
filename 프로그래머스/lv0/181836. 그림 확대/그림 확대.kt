class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return picture.flatMap { word ->
            (0 until k).map {
                word.flatMap { w ->
                    (0 until k).map { 
                        w
                    }
                }.joinToString("")
            }
        }.toTypedArray()
    }
}
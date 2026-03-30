import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        
        return arrayOf(a,b,c,d).groupBy {it}.let { group ->
            when(group.size) {
                1 -> { a * 1111 }
                2 -> { 
                    val max = group.maxByOrNull { it.value.size } ?: return 0
                    val min = group.filter { it != max }.keys.first()

                    if (max.value.size == 3) {
                        (10 * max.key + min).let { it * it }
                    } else {
                        (max.key + min) * abs(max.key - min)
                    }
                }
                3 -> { 
                    group.filter { 
                        group.maxOf { it.value.size } != it.value.size
                    }.keys.reduce { total, a -> total * a }
                }
                else -> group.minOf { it.key }
            }
        }
    }
}
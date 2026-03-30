class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        
        return lines.map { (a,b) ->
            (a..b)
        }.let { (a, b, c) ->
            val ab = (a.count { b.contains(it) } - 1).takeIf { it > 0 } ?: 0
            val bc = (b.count { c.contains(it) } - 1).takeIf { it > 0 } ?: 0
            val ca = (c.count { a.contains(it) } - 1).takeIf { it > 0 } ?: 0

            val duplicated = (a + b + c)
                .groupBy { it }
                .filter { it.value.size == 3 }
                .let { it.size - 1 }
                .takeIf { it > 0 } ?: 0
            
            println(ab)
            println(bc)
            println(ca)
            println(duplicated)
            
            ab + bc + ca - (duplicated * 2)
        }
    }
}
/*
[0,1,2]
    [2,3,4,5]
      [3,4,5,6,7,8,9]

-1,0,1
     1,2,3
         3,4,5,6,7,8,9,0

0,1,2,3,4,5
      3,4,5,6,7,8,9
  1,2,3,4,5,6,7,8,9,10,11,12,13
2 + 4 + 7 == 13 - (5) = 8

12 - ? = 8

*/
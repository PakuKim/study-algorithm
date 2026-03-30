import java.util.*

class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        val times = book_time.map { (start, end) ->
            val startMin = start.split(":").let { (h,m) ->
                h.toInt() * 60 + m.toInt()
            }
            val endMin = end.split(":").let { (h,m) ->
                h.toInt() * 60 + m.toInt() + 10
            }
            startMin to endMin
        }.sortedBy { it.first }
        
        val rooms = PriorityQueue<Int>()
        for ((start, end) in times) {
            if (rooms.isNotEmpty() && rooms.peek() <= start) {
                rooms.poll()
            }
            rooms.add(end)
        }
        
        return rooms.size
    }
}
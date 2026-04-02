class Solution {
    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        val menu = mutableMapOf<String, Int>()
        fun dfs(start: Int, cur: String, order: String, size: Int) {
            if (cur.length == size) {
                menu[cur] = menu.getOrDefault(cur, 0) + 1
                return
            }

            for (i in start until order.length) {
                dfs(i + 1, cur + order[i], order, size)
            }
        }

        for (order in orders) {
            val sortedOrder = order.toList().sorted().joinToString("")
            for (size in course) {
                if (order.length > size) dfs(0, "", sortedOrder, size)
                else if (order.length == size) menu[sortedOrder] = menu.getOrDefault(sortedOrder, 0) + 1
                else continue
            }
        }

        return menu
            .filter { it.value > 1 }
            .entries
            .groupBy { it.key.length }
            .flatMap { (_, entries) -> 
                val max = entries.maxOf { it.value }
                entries.filter { it.value == max }
            }
            .map { it.key }
            .sorted()
            .toTypedArray()
    }
}
class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return todo_list.filterIndexed { index, _ -> !finished[index] }.toTypedArray()
    }
}
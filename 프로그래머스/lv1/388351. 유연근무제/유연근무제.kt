class Solution {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        var answer = 0
        for (i in 0 until schedules.size) {
            val schedule = schedules[i]
            var success = 0
            for (j in 0 until timelogs[i].size) {
                val today = (startday + j) % 7
                
                if (today == 6 || today == 0) continue
                
                var time = schedule + 10
                if (time % 100 >= 60) {
                    time += 40
                }
                
                if (time >= timelogs[i][j]) {
                    success += 1
                }
            }
            if (success == 5) answer++
        }
        return answer
    }
}


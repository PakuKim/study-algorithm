class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        val videoLenSec = video_len.toSecond()
        val posSec = pos.toSecond()
        val opStartSec = op_start.toSecond()
        val opEndSec = op_end.toSecond()
        
        var currentSec = posSec
        
        if (currentSec >= opStartSec && currentSec <= opEndSec) {
            currentSec = opEndSec
        }
        
        for (i in commands.indices) {
            if (commands[i] == "prev") {
                currentSec -= 10
            } else if (commands[i] == "next") {
                currentSec += 10
            }
            
            if (currentSec < 0) {
                currentSec = 0
            } else if (currentSec > videoLenSec) {
                currentSec = videoLenSec
            }
            
            if (currentSec >= opStartSec && currentSec <= opEndSec) {
                currentSec = opEndSec
            }
        }

        return currentSec.let {
            "${String.format("%02d", it / 60)}:${String.format("%02d", it % 60)}"
        }
    }
    
    fun String.toSecond(): Int {
        return this.split(":").let {
           it.first().toInt() * 60 + it.last().toInt()
       }
    }
}
class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val timeTable = hashMapOf<String, Int>()
        val feeTable = hashMapOf<String, Int>()
        
        for (record in records) {
            val (timeString, car, type) = record.split(" ")
            val (hour, minute) = timeString.split(":")
            val time = hour.toInt() * 60 + minute.toInt()
            
            when(type) {
                "IN" -> timeTable[car] = time
                "OUT" -> {
                    feeTable[car] = (feeTable[car] ?: 0) + (time - timeTable[car]!!)
                    timeTable.remove(car)
                }
                else -> continue
            }
        }
        
        timeTable.forEach { (car, time) ->
            feeTable[car] = (feeTable[car] ?: 0) + (1439 - time)
        }
        
        val (default, defaultFee, unit, unitFee) = fees
        return feeTable.entries.sortedBy { it.key }.map { (_, value) ->
            if (value - default > 0) {
                defaultFee + 
                Math.ceil((value - default).toDouble() / unit).toInt() * unitFee
            } else {
                defaultFee
            }
        }.toIntArray()
    }
}
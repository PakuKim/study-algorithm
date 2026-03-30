class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        
        var coupon = chicken / 10
        var remain = chicken % 10
        
        while (coupon > 0) {
            answer += coupon
            remain += coupon % 10
            coupon /= 10
        }
        
        print(remain)
        answer += (remain / 10) + (remain / 10 + remain % 10) / 10
        
        return answer
    }
}
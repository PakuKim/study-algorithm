class Solution {
    public int solution(int[] wallet, int[] bill) {
            int answer = 0;
        
            while (true) {
                int max = Math.max(bill[0], bill[1]);
                int min = Math.min(bill[0], bill[1]);
                
                if ((max <= wallet[0] && min <= wallet[1]) || (max <= wallet[1] && min <= wallet[0])) {
                    break;
                } else {
                    bill = new int[]{max / 2, min};
                }
                answer++;
            }

            return answer;
    }
}   
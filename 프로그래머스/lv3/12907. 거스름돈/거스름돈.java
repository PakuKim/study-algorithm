class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        
        for (int i = 0; i < money.length; i++) {
            int coin = money[i];
            for (int j = coin; j <= n; j++) {
                dp[j] += dp[j - coin] % 1_000_000_007;
            }
        }
        
        return (int) dp[n];
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        int now = 0;
        Arrays.sort(d);

        for (int a: d) {
            if (a + now > budget) {
                break;
            } else {
                now += a;
                answer++;
            }
        }

        return answer;
    }
}
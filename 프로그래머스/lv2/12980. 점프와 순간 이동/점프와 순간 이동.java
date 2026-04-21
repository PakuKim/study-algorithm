import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int cur = n;
        while (cur > 0) {
            if (cur % 2 == 1) answer++;
            cur /= 2;
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> used = new HashSet<>();
        char last = words[0].charAt(0);
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) != last || !used.add(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            last = words[i].charAt(words[i].length() - 1);
        }

        return answer;
    }
}
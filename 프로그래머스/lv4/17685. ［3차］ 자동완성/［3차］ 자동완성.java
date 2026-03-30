import java.util.Arrays;

class Solution {
    public int solution(String[] words) {
        Arrays.sort(words);
        
        int total = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String prev = (i > 0) ? words[i - 1] : "";
            String next = (i < words.length - 1) ? words[i + 1] : "";

            int commonWithPrev = commonPrefixLength(word, prev);
            int commonWithNext = commonPrefixLength(word, next);

            total += Math.max(commonWithPrev, commonWithNext);
        }

        return total;
    }
    
    private static int commonPrefixLength(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        for (int i = 0; i < minLen; i++) {
            if (a.charAt(i) != b.charAt(i)) return i + 1;
        }
        if (minLen == a.length()) {
            return minLen;
        } else {
            return minLen + 1;
        }
    }
}
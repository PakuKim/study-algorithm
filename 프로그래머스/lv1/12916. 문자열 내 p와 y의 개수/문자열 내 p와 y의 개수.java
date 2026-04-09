class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        char[] ca = s.toLowerCase().toCharArray();
        for (char c: ca) {
            if (c == 'p') p++;
            else if (c == 'y') y++;
        }

        return p == y;
    }
}
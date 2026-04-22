import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        int answer = 0;
        List<String> cached = new ArrayList<>(cacheSize);

        for (String s : cities) {
            String city = s.toLowerCase();

            if (cached.contains(city)) answer++;
            else answer += 5;

            cached.remove(city);
            if (cached.size() == cacheSize) {
                cached.remove(0);
            }

            cached.add(city);
        }

        return answer;
    }
}
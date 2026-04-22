import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        int answer = 0;
        List<String> cached = new ArrayList<>(cacheSize);

        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cached.remove(city)) {
                answer += 1;
            } else {
                answer += 5;
                if (cached.size() == cacheSize) {
                    cached.remove(0);
                }
            }

            cached.add(city);
        }
        
        return answer;
    }
}
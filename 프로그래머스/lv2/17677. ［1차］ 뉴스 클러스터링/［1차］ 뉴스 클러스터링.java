import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = makeElement(str1);
        Map<String, Integer> map2 = makeElement(str2);
        if (map1.isEmpty() && map2.isEmpty()) return 65536;

        int intersection = 0, union = 0;
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        for (String key: keys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }

        return (int) ((double) intersection / union * 65536);
    }

    private Map<String, Integer> makeElement(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = Character.toLowerCase(str.charAt(i));
            char c2 = Character.toLowerCase(str.charAt(i + 1));

            if (Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                String temp = c1 + "" + c2;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        return map;
    }
}
class Solution{
    public int solution(String s) {
        String newString = s;
        while (true) {
            if (newString.isEmpty()) return 1;
            StringBuilder tempString = new StringBuilder();

            for (int i = 0; i < newString.length(); i++) {
                char c = newString.charAt(i);
                if (tempString.length() > 0 && tempString.charAt(tempString.length() - 1) == c) {
                    tempString.deleteCharAt(tempString.length() - 1);
                    continue;
                }
                tempString.append(c);
            }

            if (tempString.toString().equals(newString)) break;
            newString = tempString.toString();
        }

        return 0;
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int combined = arr1[i] | arr2[i];
            for (int j = n - 1; j >= 0; j--) {
                sb.append(((combined >> j) & 1) == 1 ? "#" : " ");
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}
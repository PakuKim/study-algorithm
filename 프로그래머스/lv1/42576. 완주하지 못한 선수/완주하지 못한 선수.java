import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++){
            if(participant[i].equals(completion[i])){
                participant[i] = "";
            }
        }
        int i = participant.length;
        
        while(i > 0){
            if(participant[i-1] != ""){
                answer = participant[i-1];
            }
            i--;
        }

        return answer;
    }
}
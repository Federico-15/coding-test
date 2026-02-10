import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        int part_length = participant.length;
        int compl_length = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < compl_length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                
                break;
            }
        }
        
        if(answer.isEmpty()){
            answer = participant[part_length-1];
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String>q1 = new LinkedList<>();
        Queue<String>q2 = new LinkedList<>();
        Queue<String>q3 = new LinkedList<>();
        
        int length1 = cards1.length;
        int length2 = cards2.length;
        int length3 = goal.length;
        
        for(int i = 0; i < length1; i++){
            q1.add(cards1[i]);
        }
        
        for(int i = 0; i < length2; i++){
            q2.add(cards2[i]);
        }
        
        for(int i = 0; i< length3; i++){
            q3.add(goal[i]);
        }
        
        while(!q3.isEmpty()){
            
            if(q3.peek().equals(q1.peek())){
            q3.poll();
            q1.poll();
            continue;
            }
            
            else if(q3.peek().equals(q2.peek())){
                q3.poll();
                q2.poll();
                continue;
            }
            
            else{
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int length = prices.length;
        int[] answer = new int[length];
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < length; i++){
            q.add(prices[i]);    
        }
        
        for(int i = 0; i < length; i++){
            int number = q.poll();
            int a = 0;
            
            if(i != length){
            for(int j = i+1; j < length; j++){
                a++;
                if(number > prices[j]){
                    break;
                }
                     
                }
            
            answer[i] = a;
            
        }
        }
        
        
        return answer;
    }
}
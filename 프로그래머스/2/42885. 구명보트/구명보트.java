import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int length = people.length;
        Arrays.sort(people);
        
        
         int start = 0;
         int end = length-1;
         while(start <= end){
            if(people[start] + people[end] <= limit){
                start += 1;
                end -= 1;
                answer++;
            }
             else{
                 answer++;
                 end -= 1;
             }
         }   
        
        return answer;
    }
}
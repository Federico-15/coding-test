import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] answer_array = new String[numbers.length]; 
        
        
        for(int i = 0; i < numbers.length; i++){
            answer_array[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(answer_array,(o1,o2) -> {
            return (o1+o2).compareTo(o2+o1);
        });
        
        if (answer_array[numbers.length-1].equals("0")) {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        
        
        for(int i = numbers.length-1; i >= 0; i--){
            answer.append(answer_array[i]);
        }
        
        return answer.toString();
       }
}
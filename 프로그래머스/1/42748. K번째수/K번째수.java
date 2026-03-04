import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int a_length = array.length;
        
        int new_array_length = 0;
        
        int[] answer = new int[commands.length];
                
        for(int i = 0; i < commands.length; i++){
            
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];
            
            int[] sub_array = Arrays.copyOfRange(array,x-1,y);
            
            Arrays.sort(sub_array);
                      
            answer[i] = sub_array[z-1];
        }
        
        return answer;
    }
}
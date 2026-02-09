import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 접두어가 있으면 false , 없으면 true
        int length = phone_book.length;
        
        Arrays.sort(phone_book);
        
        for(int i = 0; i < length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
            } 
        }
        
        return answer;
    }
}
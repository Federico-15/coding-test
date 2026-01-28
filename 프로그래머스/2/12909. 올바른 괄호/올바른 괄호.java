import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int length = s.length();
        
        // ')' 개수 담을 변수
        int a = 0;
        
        // '(' 개수 담을 변수
        int b = 0;
        
        Queue<Character> queue = new LinkedList<>();
        
        // ')' 로 시작하거나, length-1 이 '('로 끝나면 false
        if(s.charAt(0) == ')' || s.charAt(length-1) == '('){
            answer = false;
        }
        
        else {
        for(int i = 0; i < length; i++){
            if(s.charAt(i) ==  '('){
                a++;
            }
            else if (s.charAt(i) == ')'){
                b++;
            }
            
            if(b>a){
                answer = false;
                break;
            }
            }
        }
        
        if(a!=b){
            answer = false;
        }
        return answer;
    }
}
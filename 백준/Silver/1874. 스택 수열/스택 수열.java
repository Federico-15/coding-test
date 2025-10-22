import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); 
        
        Stack<Integer> stack = new Stack<>();
        int[] list = new int[N];
        
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        StringBuffer bf = new StringBuffer(); // 결과 문자열 저장
        int num = 1;  // 스택에 넣을 숫자
        boolean result = true;

        for (int i = 0; i < list.length; i++) {
            int currentNum = list[i];  // 현재 비교할 숫자
            
            if (currentNum >= num) {  
                while (num <= currentNum) {  // 스택에 넣을 숫자가 현재 숫자보다 작거나 같으면 push
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop(); // 현재 숫자와 같아졌으면 pop
                bf.append("-\n");
            } 
            else {  
                int n = stack.pop(); // 스택에서 pop
                
                if (n > currentNum) { // 수열이 불가능한 경우
                    System.out.println("NO");
                    result = false;
                    break;
                } 
                else {
                    bf.append("-\n");
                }
            }
        }
        
        if (result) {
            System.out.println(bf.toString());
        }
    }
}

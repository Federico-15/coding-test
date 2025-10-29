import java.util.Scanner;
import java.util.*;


// BOJ -> Main
// SWEA Solution
class Solution {
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		
        int T;
        
        T=sc.nextInt();

        String str;
		        
		for(int test_case = 1; test_case <= T; test_case++)
		{   
            str = sc.next();

            // 반복되는 마디의 길이
            int result = 0;

            for(int L = 1; L <= 10; L ++){

                String pattern = str.substring(0,L);

                String nextChunk = str.substring(L, L + L);

                if(pattern.equals(nextChunk)){
                    result = L;
                    break;
                }
            }
            
            System.out.println("#" + test_case + " " + result);
        }	
    }
}
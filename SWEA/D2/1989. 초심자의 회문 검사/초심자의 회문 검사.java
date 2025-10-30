import java.util.Scanner;
import java.util.*;


// BOJ -> Main
// SWEA Solution
class Solution {

	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);

        int T;

        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            String str = sc.next();

            StringBuilder sb = new StringBuilder();
            int result = 0;

            for (int i = str.length() - 1; i >= 0; i--){
                sb.append(str.charAt(i));
            }

            String str1 = sb.toString();

            if(str.equals(str1)){
                result = 1;
            }

            else {
                result = 0;
            }
            
            System.out.println("#" + test_case +" " + result);
        }
    }


			
}

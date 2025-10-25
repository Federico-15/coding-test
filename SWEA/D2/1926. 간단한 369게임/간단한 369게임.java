import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{   
            String str = Integer.toString(test_case);
            int clapCount = 0;

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);

                if(ch == '3' || ch =='6' || ch =='9'){
                    clapCount++;
                }
            }

            if(clapCount > 0){
                for(int j = 0; j < clapCount; j++){
                    System.out.print("-");
                }
            }
            
            else{
                System.out.print((test_case));
            }
        

        System.out.print(" ");

        
		}

    }
}
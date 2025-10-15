import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{	
            double result = 0;
            double sum = 0;
            int[] numbers = new int[10];
            
           
            for(int i = 0; i < 10; i++) {
            	numbers[i] = sc.nextInt();
              	}
            
			Arrays.sort(numbers);
            
            for(int i = 1; i <9; i++){
            sum += numbers[i];
            }
            
            result = sum / 8;
            
            
            	
			System.out.println("#" + test_case + " " + Math.round(result));
		}
	}
}
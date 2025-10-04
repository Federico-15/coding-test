import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int caseNum = sc.nextInt();             
            int[] students = new int[1000];
            int[] numbers = new int[101];
            
            for(int i =0; i < 1000; i++) 
            {
            students[i] = sc.nextInt();
            numbers[students[i]]++;  
            }
       
            int max = 0;
            int frequency_numbers = 0;
            
            for(int i = 0; i < 101; i ++)
            {
                if (numbers[i] >= max){
                    max = numbers[i];
					frequency_numbers = i;
                }
            }
            
            System.out.println("#" + test_case +" " + frequency_numbers);
	}
}
}
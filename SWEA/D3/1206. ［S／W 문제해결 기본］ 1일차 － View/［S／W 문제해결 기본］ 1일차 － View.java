import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int n = sc.nextInt();
            int[] buildings = new int[n];
            
            int result = 0;
            
			for (int i = 0; i < n; i++){
                buildings[i] = sc.nextInt();
            }
            for (int i = 2; i < n-2; i++){
            	int leftMax = Math.max(buildings[i-2], buildings[i-1]);
                int rightMax = Math.max(buildings[i+1], buildings[i+2]);
                
                int max = Math.max(leftMax, rightMax);
                
                if(buildings[i] - max > 0){
                	result += buildings[i] - max;
                }
            }
            System.out.println("#" + test_case + " " + result);
		}
	}
}
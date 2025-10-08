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
            int n = sc.nextInt();
            int m = sc.nextInt();
        
            int[][] num = new int[n+1][n+1];
            
			for(int i = 1; i <= n ; i++){
            	for(int j =1; j <= n; j++){
                    num[i][j] = sc.nextInt();
                }
            }
            
            // 누적합
            int[][] prefix = new int[n+1][n+1];
            
            int max = 0;

                
                for (int i=1; i <= n; i++){
                	for(int j=1; j <= n; j++){
                    	
                       prefix[i][j] = num[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];

                    }
                }
            
        
        
       		for (int i = m; i <= n; i++) {
            	for (int j = m; j <= n; j++){
                    int sum = prefix[i][j] - prefix[i-m][j] - prefix[i][j-m] + prefix[i-m][j-m];
                    
                    max = Math.max(sum,max);
            	}
       			}
        
		System.out.println("#" + test_case + " " + max);
        
        }
    }
}
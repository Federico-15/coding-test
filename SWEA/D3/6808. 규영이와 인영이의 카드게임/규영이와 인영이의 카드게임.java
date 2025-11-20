import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	static int[] arr;
	static int[] arr1;
	
	static boolean[] card;
	static int winNum;
	static int loseNum;
	static int winPoint;
	static int losePoint;
	
	static boolean[] visited;
	
	static int[] perm;
	
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			arr = new int[9];
			perm = new int[9];
			card = new boolean[18];
			
			visited = new boolean[9];
			
			for(int i = 0 ; i < 9; i++) {
				arr[i] = sc.nextInt();
				card[arr[i] - 1] = true;
			}
			
			arr1 = new int[9];
			
			for(int i = 0; i < 9; i++) {
				for(int j = 0 ; j < 18; j++) {
					if(!card[j]) {
						arr1[i] = j+1;
						card[j] = true;
						break;
					}
				}
			}
			
			winNum = 0;
			loseNum = 0;
			
			dfs(0);
			
			System.out.println("#" + test_case + " " + winNum + " " + loseNum);			
		}
	}
	
	static void dfs(int depth) {
		
		if(depth == 9) {
			
			winPoint = 0;
			losePoint = 0;
			
			for(int i = 0; i < 9; i++) {
				if(arr[i] > perm[i]) {
					winPoint += arr[i] + perm[i];
				}
				else
					losePoint += arr[i] + perm[i];
			}
			
			if(winPoint > losePoint) {
				winNum++;
			}
			
			else
				loseNum++;
			
			return;
		}
		
		
		for(int i = 0; i < 9; i++) {
			
			
			if(!visited[i]) {
				visited[i] = true;
				
				perm[depth] = arr1[i];

				dfs(depth+1);
				
				visited[i] = false;
			}
		}
	
	
}
}
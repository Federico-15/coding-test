import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

// swea
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			// x가 0일때의 결과
			int result1 = 0;
			
			// x가 0이 아니고, y가 0이 아닐 때
			int result2 = 0;
			int N = sc.nextInt();
			
			// y가 0일 때
			int result3 = 0;
			
			
			
			// x 가 0일때 (양수만 더 함)
			for(int i = 1; i <= N; i++) {
				result1++;
			}
			
			// (음수일 때, 0일 때 더하기)
			result1 = 2 * result1;
			
			// x가 1일 떄, 2일때 .... 등을 구해서 그 수에 2곱하면 됨  (y=1 아님)
			for(int x = 1; x <= N; x++) {
				for(int y = 1; y <= N; y++) {
					if(x*x + y*y <= N*N) {
						result2++;
					}
				}
			}
			
			result2 = 4 * result2;
			
			for(int i = 1; i <= N; i++) {
				result3++;
			}
			
			result3 = 2 * result3;
			
			int result = result1 + result2 + result3 + 1;
			
			
			System.out.println("#" + test_case + " " + result);
		}
	}
}
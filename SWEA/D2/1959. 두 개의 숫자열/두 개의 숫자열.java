import java.util.Scanner;
import java.io.FileInputStream;

// swea
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr1 = new int[N];
			int[] arr2 = new int[M];
			
			for(int i = 0; i < N; i++) {
				arr1[i] = sc.nextInt();
			}
			
			for(int i = 0; i < M; i++) {
				arr2[i] = sc.nextInt();
			}
			
			// 경우의 수

			int K = 0;
			
			// 제일 큰 값 찾기
			int max = 0;
			
			// N 이 더 작을 때 (arr1의 크기가 더 작음)
			if(M-N >= 0) {
				K = M-N+1;
				
				int[] arr3 = new int[K];
				
				for(int i = 0; i < K; i++) {
					for(int j = 0; j < N; j++) {
						arr3[i] += arr1[j] * arr2[j+i];
					}
				}
				
				for(int i = 0; i < K; i++) {
					if(max <= arr3[i]) {
						max = arr3[i];
					}
				}
			}
			
			// M 이 더 작음.(arr2의 크기가 더 작음)
			else {
				K = N-M+1;
				
				int[] arr3 = new int[K];
				
				for(int i = 0; i < K; i++) {
					for(int j = 0; j < M; j++) {
						arr3[i] += arr2[j] * arr1[j+i];
					}
				}
				
				for(int i = 0; i < K; i++) {
					if(max <= arr3[i]) {
						max = arr3[i];
					}
				}
			}
			
						
			System.out.println("#" + test_case + " " + max);
		}
	}
}
import java.util.Arrays;
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
			
			// 경우의 수 개수
			int num = 0;
			
			int[] arr = new int[N];
			
			int K = (N * (N-1)) / 2;
					
			// 경우의 수 담아둔 배열
			int[] arr2 = new int[K];
			
			// 과자 봉지 무게 배열 입력받기
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			
			// 두 개 합치기
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					arr2[num] = arr[i] + arr[j];
					num++;
				}
			}
			
			// 오름차순으로 만들기
			Arrays.sort(arr2);
			
			int max = 0;
			
			for(int i = 0; i < K; i++) {
				if(arr2[i] >= max && arr2[i] <= M) {
					max = arr2[i];
				}
			}
			
			if(max != 0) {

				System.out.println("#" + test_case + " " + max);
			}
				
			else {
				System.out.println("#" + test_case + " -1");
			}
			}
	}
}
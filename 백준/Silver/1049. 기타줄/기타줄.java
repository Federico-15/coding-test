
import java.io.*;
import java.util.*;

// swea
class Main
{ 
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[M][2];
	
		
		for(int i = 0; i < M; i++) {
			for(int j = 0 ; j < 2; j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		
		// 패키지 중에 가장 싼 거
		int min1 = arr[0][0];
		
		//낱개 중에 가장 싼 거
		int min2 = arr[0][1];
		
		for(int i = 0; i < M; i++) {
			min1 = Math.min(min1, arr[i][0]);
			min2 = Math.min(min2, arr[i][1]);
		}
		
		// 낱개로 사야하는 가격
		int count2 = N * min2;

		// 패키지로 사야하는 가격 측정 (패키지를 몇개 사야하는지)
		int pack = 0;
		pack = (N/6) + 1;
		if (N % 6 == 0) {
			pack--;
		}
		
		// 패키지로 산 경우
		int count1 = pack * min1;
		
		int count3 = 0;
		
		if(N % 6 == 0) {
			count3 = --pack * min1 + 6 * min2;
		}
		else
			count3 = --pack * min1 + (N % 6) * min2;
		
		
		int min = Math.min(count1, count2);
		min = Math.min(min, count3);
		
		System.out.println(min);
	}
	
}


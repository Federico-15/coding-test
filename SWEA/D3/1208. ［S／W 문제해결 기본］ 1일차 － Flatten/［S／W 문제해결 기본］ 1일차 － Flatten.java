
import java.util.*;

//SWEA 제출 시 클래스 이름은 Solution 이어야 합니다.
class Solution {
	
static int result;

	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		// 최고점과 최저점의 높이차이
		for(int test_case = 1 ; test_case <= 10; test_case++) {
			
			int N = sc.nextInt();
			
			int[] arr = new int[100];
			
			int result = 0;
			
			for(int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}

			for(int i = 0; i < N; i++) {
				Arrays.sort(arr);
				result = arr[99] - arr[0];
				if(result <= 1) {
					break;
				}
				
				arr[99] -= 1;
				arr[0] += 1;	
			}
			
			Arrays.sort(arr);
			result = arr[99] - arr[0];
			
			System.out.println("#" + test_case + " " + result);
		}
			
	}
}

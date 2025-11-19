import java.util.*;

//SWEA 제출 시 클래스 이름은 Solution 이어야 합니다.
class Solution {
	
	static int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1 ; test_case <= T; test_case++) {
			
			int[] count = new int[8];
			
			int money = sc.nextInt();
			int i = 0;
			
			while(money > 0 && i < arr.length) {
				
				if(arr[i] > money) {
					i++;
				}
				
				else {
					money -= arr[i];
					count[i]++;
			}
		}
			
			System.out.println("#" + test_case);
			for(int j = 0; j < 8; j++) {
				System.out.print(count[j]+ " ");
			}
			System.out.println();
			
			}
		}
	
}
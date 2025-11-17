import java.util.*;

//SWEA 제출 시 클래스 이름은 Solution 이어야 합니다.
class Solution {

 public static void main(String args[]) throws Exception {
	 Scanner sc = new Scanner(System.in);
	 
	 int T = sc.nextInt();
	 
	 for(int test_case= 1; test_case <=T ; test_case++) {
		 
		 int N = sc.nextInt();
		 int M = sc.nextInt();
		 int K = sc.nextInt();
		 
		 // 손님 N명이 언제 오는지
		 int[] arr = new int[N];
		 	 
		 for(int i = 0; i < N; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 Arrays.sort(arr);
		 int bung = 0;
		 
		 boolean answer = true;
		 
		 for(int i = 0; i < arr.length; i++) {
			 bung = (arr[i]/M) * K;
			 int people = i + 1;
			 
			 if(people > bung) {
				 answer = false;
				 break;
			 }
			 
		 }
		 
		 if(answer) {
			 System.out.println("#" + test_case + " " + "Possible");
		 }
		 
		 else
			 System.out.println("#" + test_case + " " + "Impossible");
	
	
	 }
 }

 // 유틸: swap 함수
}
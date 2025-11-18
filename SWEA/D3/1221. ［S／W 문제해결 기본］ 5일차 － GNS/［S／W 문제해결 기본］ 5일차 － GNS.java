import java.util.*;

//SWEA 제출 시 클래스 이름은 Solution 이어야 합니다.
class Solution {

	static String[] arr = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

 
public static void main(String args[]) throws Exception {

	 Scanner sc = new Scanner(System.in);
	 
	 int T = sc.nextInt();
	 
	 for(int test_case= 1; test_case <=T ; test_case++) {
		 
		 HashMap<String, Integer> map = new HashMap<>();
		 
		 map.put("ZRO", 0);
		 map.put("ONE", 0);
		 map.put("TWO", 0);
		 map.put("THR", 0);
		 map.put("FOR", 0);
		 map.put("FIV", 0);
		 map.put("SIX", 0);
		 map.put("SVN", 0);
		 map.put("EGT", 0);
		 map.put("NIN", 0);
	

		 String b = sc.next();
		 
		 int N = sc.nextInt();
 		 
		 for(int i = 0; i < N; i++) {
			 String str = sc.next();
			 
			 // 값 넣기
			 map.put(str, map.get(str)+1);
			 
			 
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 
		 
		 for(String a : arr) {
			 int count = map.get(a);
			 
			 for(int i = 0 ; i < count; i++) {
				 sb.append(a).append(" ");
			 }
		 }
		
		 
		 
		 System.out.println(b+ " " + sb);
	 }
}
}
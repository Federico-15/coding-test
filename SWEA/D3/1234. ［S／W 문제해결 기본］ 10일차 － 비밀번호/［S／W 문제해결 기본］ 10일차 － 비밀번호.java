import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;

/*
사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
*/
class Solution
{
	
static boolean[] visited;
static int[] password;
static ArrayList<Integer> num;
static int length;

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N = sc.nextInt();

			num = new ArrayList<Integer>();
			
			String str = sc.next();
			
			for(int i = 0 ; i < N; i++) {
				num.add(str.charAt(i) - '0');
			}
			
			dfs(0);
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < num.size(); i++) {
				sb.append(num.get(i));
			}
			
			System.out.println("#" + test_case + " " + sb);
		}
	}
	
	static void dfs(int x) {
		
		length = num.size();
		
		boolean removed = false;
		
		for(int i = 0; i < length - 1; i++) {
			if(num.get(i).equals(num.get(i+1))) {
				num.remove(i);
				num.remove(i);
				removed = true;
				break;
			}
		}
		
		if(removed) {
			dfs(++x);
		}
		
		}
}
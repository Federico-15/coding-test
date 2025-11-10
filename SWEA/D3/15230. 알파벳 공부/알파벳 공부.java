
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
			char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			
			String str = sc.next();
		
			int num = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if(arr[i] == str.charAt(i)) {
					num++;
				}
				
				else {
					break;
				}
			}
			
			System.out.println("#" + test_case + " " + num);
		}
	}
}
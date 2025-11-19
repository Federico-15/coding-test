import java.io.*;
import java.util.*;

// swea
class Main
{ 
	static boolean[] check;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String result;

		check = new boolean[N];
		
		int num = 0;
		
		// 단어 N개 입력받기
		for(int tc = 0; tc < N; tc++) {
			
			String[] str = new String[N];
			
			str[tc] = sc.next();
			
			char swap;
			
			// tc번째 단어를 String형으로 넣음.
			String word = str[tc];

			char[] arr = new char[word.length()];
			
			// char 형 배열에 넣었어.
				for(int j = 0; j < word.length(); j++) {					
					arr[j] = word.charAt(j);
				}
				
				for(int j = 0; j < word.length() - 1; j++) {				
				
					if(arr[j] != arr[j+1]) {
						swap = arr[j];
						
						for(int k = j + 1; k < word.length(); k++) {
							if(swap == arr[k]) {
								check[tc] = true;
								break;
							}
						}
					
					}
				}
		}
		
		for(int tc = 0; tc < N; tc++) {
			if(check[tc] == false) {
				num++;
			}
		}
		
		
		System.out.print(num);
		
		}
}


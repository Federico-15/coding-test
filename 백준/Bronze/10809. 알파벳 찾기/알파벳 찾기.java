import java.util.Scanner;
import java.util.*;


// BOJ -> Main
// SWEA Solution
class Main {

	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);

        String word;

        word = sc.next();

        int[] arr = new int[26];

        // 알파벳 인덱스 배열 -1로 초기화 해두기
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }


        for(int i = word.length() - 1; i >= 0; i--){
            
            // 단어를 숫자로 변환
            int a = word.charAt(i) - 'a';
            
            // 그 단어의 배열에 인덱스에 삽입
            arr[a] = i;
        }

        for(int i = 0; i < 26; i ++){
            System.out.print(arr[i] + " ");
        }
        
    }		
}

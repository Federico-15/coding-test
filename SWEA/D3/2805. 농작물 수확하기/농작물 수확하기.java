import java.util.Scanner;
import java.io.BufferedReader;
import java.util.*;


// BOJ -> Main
// SWEA Solution
class Solution {

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){

            int N = sc.nextInt();

            int result = 0;

            // 1일 때
            if (N == 1){
                int[] arr = new int[1];
                arr[0] = sc.nextInt();

                result = arr[0];
            }


            // 1이 아닐 때
            else {
    
                int[][] arr = new int[N][N];

                String str = new String();

                // 배열 입력
                for (int i = 0; i < N; i++){
                    str = sc.next();
                    for(int j = 0; j < N; j++){
                        arr[i][j] = str.charAt(j) - '0';
                    }
                }

                // 위쪽 밭
                for(int i = 0; i <= N/2; i++){
                    
                    // i 인덱스와 같게 - + 해야 함.
                    for(int j = 0; j < N; j++){
                        if(j >= N/2 - i && j <= N/2 + i){
                        result += arr[i][j];    
                        }
                    }
                }

                int a = N/2-1;
                    
                //아래쪽 밭
                for(int i = N/2 + 1; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if(j >= N/2 - a && j <= N/2 + a){
                        result += arr[i][j];
                        }
                    }
                    a--;
                }
            


            }

            System.out.println("#" + test_case + " " + result);
        }

    }
}

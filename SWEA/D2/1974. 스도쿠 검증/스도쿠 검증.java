import java.util.Scanner;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{	Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
     	for(int test_case = 1; test_case <= T; test_case++){

            int arr[][] = new int[9][9];

            boolean result = true;

            // 배열 입력받기    
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            // 가로 배열
            int ga_arr[][] = new int[9][9];

            // 세로 배열
            int se_arr[][] = new int[9][9];

            // 한 칸 배열
            int kan_arr[][] = new int[9][9];

            // 가로,세로 배열 만들기
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    ga_arr[i][j] = arr[i][j];
                    se_arr[i][j] = arr[j][i];
                }
            }
            int k = 0;
            
            int m = 0;

            // 한 칸 배열 만들기 (k = 0,1,2)
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    kan_arr[k][m] = arr[i][j];        
                    m++;
                }
            }
            
            k++;
            m=0;
            
            for(int i = 0; i < 3; i++) {
                for(int j = 3; j < 6; j++) {
                    kan_arr[k][m] = arr[i][j];
                    m++;        
                }
            }

            k++;
            m=0;

            for(int i = 0; i < 3; i++) {
                for(int j = 6; j < 9; j++) {
                    kan_arr[k][m] = arr[i][j];
                    m++;        
                }
            }

            k++;
            m=0;

                        // 한 칸 배열 만들기 (k = 3,4,5)
            for(int i = 3; i < 6; i++) {
                for(int j = 0; j < 3; j++) {
                    kan_arr[k][m] = arr[i][j];        
                    m++;
                }
            }
            
            k++;
            m=0;

            for(int i = 3; i < 6; i++) {
                for(int j = 3; j < 6; j++) {
                    kan_arr[k][m] = arr[i][j];
                    m++;        
                }
            }

            k++;
            m=0;

            for(int i = 3; i < 6; i++) {
                for(int j = 6; j < 9; j++) {
                    kan_arr[k][m] = arr[i][j];
                    m++;        
                }
            }

            k++;
            m=0;
                        // 한 칸 배열 만들기 (k = 6,7,8)
            for(int i = 6; i < 9; i++) {
                for(int j = 0; j < 3; j++) {
                    kan_arr[k][m] = arr[i][j];        
                    m++;
                }
            }
            
            k++;
            m=0;
            
            for(int i = 6; i < 9; i++) {
                for(int j = 3; j < 6; j++) {
                    kan_arr[k][m] = arr[i][j];
                    m++;        
                }
            }

            k++;
            m=0;

            for(int i = 6; i < 9; i++) {
                for(int j = 6; j < 9; j++) {
                    kan_arr[k][m] = arr[i][j];
                    m++;        
                }
            }

            // 정렬
            for(int i = 0; i < 9; i++){
                Arrays.sort(ga_arr[i]);
                Arrays.sort(se_arr[i]);
                Arrays.sort(kan_arr[i]);    
            }


            for(int i = 0; i < 9; i++){
                
                int num1 = 0;
                int num2 = 0;
                int num3 = 0;


                for(int j = 0; j < 9; j++) {
                    
                    if(ga_arr[i][j] == j + 1){
                        num1++;
                    }

                    if(se_arr[i][j] == j + 1){
                        num2++;
                    }

                    if(kan_arr[i][j] == j + 1){
                        num3++;
                    }
                }

                if(num1 != 9 || num2 != 9 || num3 != 9){
                    result = false;
                }
        }

        if(result) {
            System.out.println("#" + test_case + " 1");

        }   

        else {
            System.out.println("#" + test_case + " 0");
        }
    }
}
}
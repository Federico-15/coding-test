import java.util.Scanner;
import java.util.*;

// SWEA -> Solution
// BOJ -> Main
class Solution
{
    
	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();

            int[][] arr = new int[N][N];

            int num = 1;

            int x = 0;
            int y = 0;

            int[] dx = {0,1,0,-1};
            int[] dy = {1,0,-1,0};

            
            int dir = 0;

            while(num <= N*N) {
                arr[x][y] = num;
                num++;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx < 0 || nx >= N || ny < 0 || ny >=N || arr[nx][ny] != 0){
                    dir = (dir+1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }

            System.out.println("#" + test_case);
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}

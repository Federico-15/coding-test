import java.util.Scanner;
import java.util.*;

// SWEA -> Solution
// BOJ -> Main
class Main
{
    static boolean[][] visited;
    static int[]dx = {-1,1,0,0};
    static int[]dy = {0,0,-1,1};
    static int N;
    static int[][] arr;
    
    // 단지 수 몇개인지
    static int count;

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        arr = new int[N][N];
        visited = new boolean[N][N];


        ArrayList<Integer> aparts = new ArrayList<>();

        // 배열 입력받기
        for (int i = 0; i < N; i++){
            String Line = sc.next();
            for(int j = 0; j < N; j++){
                arr[i][j] = Line.charAt(j) - '0';
            }
        }

        // 아파트 단지 수
        int apartNums = 0;

        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(arr[i][j] == 1 && visited[i][j] == false){
                    
                    count = 0;
                    DFS(i,j);
                    aparts.add(count);

                    apartNums++;
                }
            }
        }

        Collections.sort(aparts);

        System.out.println(apartNums);
        for(int count : aparts){
            System.out.println(count);
        }
    }

    static void DFS(int x, int y) {

        visited[x][y] = true;
        count++;

        for(int  i = 0; i < 4; i++){
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(nx >= 0 && ny >= 0 && nx < N && ny < N && visited[nx][ny] == false && arr[nx][ny] == 1) {
            DFS(nx,ny);
        }
    }
        
    }

}


import java.util.Scanner;
import java.io.BufferedReader;
import java.util.*;
import java.lang.Math;
import java.awt.Point;


// BOJ -> Main
// SWEA Solution
class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean visited[][];
    static int farm[][];
    static int M;
    static int N;
    static int K;

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();

        // 테스트 케이스
        for(int test_case = 1; test_case <=T; test_case++) {

        // 배추밭의 가로 길이
        M = sc.nextInt();

        // 배추밭의 세로길이
        N = sc.nextInt();

        // 배추 개수
        K = sc.nextInt();
        
        // 배추 밭
        farm = new int[N][M];
        visited = new boolean[N][M];


        // 배추 개수만큼 입력받기
        for(int i = 0; i < K; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();

            farm[k][j] = 1;
        }

        int count = 0;

        for(int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){

                if(farm[i][j] == 1 && visited[i][j] == false){
                    count++;

                    bfs(i,j);
                }
            }
        }
        
        System.out.println(count);

    }

    }

    static void bfs(int x, int y){

        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(x,y));
        visited[x][y] = true;

        int num = 0;

        while(!queue.isEmpty()){
            Point p = queue.poll();

            for(int i = 0; i< 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];          

                if(nx >= 0 && nx < N && ny >=0 && ny < M && visited[nx][ny] == false && farm[nx][ny] == 1){
                    queue.add(new Point(nx, ny));

                    visited[nx][ny] = true;
                }
            }
        }

    }
}


import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;

class Main {
    
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int n, m;
    static int arr[][];
    static boolean visited[][];

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        m = sc.nextInt();
        
        visited = new boolean[n][m];
        arr = new int[n][m];

        sc.nextLine();
        
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            for (int j = 0; j < m; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    
    }


    
        static void bfs(int x, int y){
            Queue<Point> queue = new LinkedList<>();
            queue.add(new Point(x,y));
            visited[x][y] = true;

            while(!queue.isEmpty()){
                Point p = queue.poll();
                for(int i = 0; i<4; i++){
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];

                    if(nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny]>0 && !visited[nx][ny]){
                        queue.add(new Point(nx,ny));

                        visited[nx][ny] = true;
                        arr[nx][ny] = arr[p.x][p.y] + 1;
                        
                    }       
                }
            }
    }
}
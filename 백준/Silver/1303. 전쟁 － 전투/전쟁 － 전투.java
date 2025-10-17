import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Point;

class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int n,m;

    static char color[][];

    static boolean visited[][];
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        n = sc.nextInt(); // 가로
        m = sc.nextInt(); // 세로
        
        sc.nextLine();

        color = new char[m][n];
        visited = new boolean[m][n];

        int wNum = 0;
        int bNum = 0;

        
        for(int i = 0; i < m; i++){
            String colors = sc.nextLine();
            for(int j = 0; j < n; j++){
            color[i][j] = colors.charAt(j);         
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int size = bfs(i, j);
                    if (color[i][j] == 'W') wNum += size * size;
                    else bNum += size * size;
                }
            }
        }
        
        System.out.println(wNum + " " + bNum);

        

        
    }


    static int bfs(int x, int y){
        char team = color[x][y];
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        visited[x][y] = true;

        int num = 1;
        

        while(!queue.isEmpty()){
            Point p = queue.poll();
            
            for(int i =0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[nx][ny] && team == color[nx][ny]){
                    queue.add(new Point(nx,ny));

                    visited[nx][ny] = true;
                    num++;

                }
            }
            
        }

        return num;
        
        
    }
}
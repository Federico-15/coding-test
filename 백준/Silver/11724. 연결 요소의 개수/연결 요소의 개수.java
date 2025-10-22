import java.util.Scanner;
import java.util.*;

// SWEA -> Solution
// BOJ -> Main
class Main
{
    static ArrayList<Integer>[] A;

    static boolean visited[];

    static int count;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();

        int count = 0;

        A = new ArrayList[N + 1];

        visited = new boolean[N + 1];

        for(int i = 1; i < N + 1; i++){
            A[i] = new ArrayList<Integer>();        
        }

        // 인접리스트 만들기
        for(int i = 0; i < M; i++) {
            sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            A[a].add(b);
            A[b].add(a);
        }

        for(int i = 1; i <N+1; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }


    // DFS
        static void DFS(int x){
            
            if(visited[x]){
                return;
            }

            visited[x] = true;

            for(int i : A[x]){

                if(visited[i] == false){
                    DFS(i);
                }    
            }
        }
}

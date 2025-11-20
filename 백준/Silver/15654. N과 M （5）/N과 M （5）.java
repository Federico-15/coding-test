import java.io.*;
import java.util.*;

// swea
class Main
{ 
	static int N;
	static int M;
	static int[] arr;
	static boolean[] visited;
	static int[] arr1;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N];
		visited = new boolean[N];
		arr1 = new int[N];
		for(int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		
		dfs(0);
	}
	
	static void dfs(int depth) {
		
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(arr1[i]+ " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i = 0 ; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr1[depth] = arr[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
	
}


import java.util.Scanner;
import java.util.*;

// SWEA -> Solution
// BOJ -> Main
class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                maxHeap.add(arr[i][j]);
            }
        }

        for(int i = 0; i < N-1; i++){
            maxHeap.poll();
        }

        System.out.println(maxHeap.poll());
    }
}
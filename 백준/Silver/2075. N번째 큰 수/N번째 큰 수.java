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

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0; i < N*N; i++){
            int num = sc.nextInt();

            if(minHeap.size() < N){
                minHeap.add(num);
            }
            else {
                if(num > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(num);
                }
            }
        }

        System.out.println(minHeap.peek());

    }
}
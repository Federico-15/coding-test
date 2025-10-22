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

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if(x == 0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }

                else {
                    System.out.println(pq.poll());
                }
            }

            else {
                pq.add(x);
            }
        }
    }
}
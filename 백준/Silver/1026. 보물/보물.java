import java.util.*;

public class Main{
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N ; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int[] reverse_A = new int[N];
		
		for(int i = 1; i <= N; i++) {
			reverse_A[i - 1] = A[N-i];
		}
		
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			result += reverse_A[i] * B[i];
		}
		
		System.out.println(result);
		
	}
}

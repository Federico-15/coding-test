import java.util.*;

public class Main{
	
static int N;
static int M;
static char[][] board;
static int num1;
static int num2;
static boolean[][] visited;
static int MinNum;
static int result;

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		M = sc.nextInt();
		
		board = new char[N][M];
		
		result = 64;
		
		for(int i = 0; i < N; i++) {
			String str = sc.next();
			for(int j = 0 ; j < M; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				dfs(j,i);
			}
		}
		
		System.out.println(result);
		
		
	}
	
	static void dfs(int x, int y) {
		
	
		if (x + 8 <= M && y + 8 <= N) {
			
			num1 = 0;
			num2 = 0;
			
			for(int i = y; i < y + 8; i++) {
				for(int j = x; j < x + 8; j++) {
					
					if((i + j) % 2 == 0) {
						if(board[i][j] != 'B') {
							num1++;
						}
					}
					else {
						if(board[i][j] != 'W') {
							num1++;
						}
					}
					
				}
			}
			
			for(int i = y; i < y + 8; i++) {
				for(int j = x; j < x + 8; j++) {
					
					if((i + j) % 2 == 0) {
						if(board[i][j] != 'W') {
							num2++;
						}
					}
					else {
						if(board[i][j] != 'B') {
							num2++;
						}
					}
					
				}
			}
			
			MinNum = Math.min(num1, num2);
			result = Math.min(MinNum, result);
		}

		else 
			return;
	}
}


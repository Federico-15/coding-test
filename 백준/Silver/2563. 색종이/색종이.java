import java.util.Scanner;
import java.io.BufferedReader;
import java.util.*;
import java.lang.Math;
import java.awt.Point;


// BOJ -> Main
// SWEA Solution
class Main {

    static boolean visited[][];
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        visited = new boolean[100][100];
        
        int num = 0;

        int result = N * 100;

        for(int i = 0; i < N; i++){
            int ga = sc.nextInt();
            int se = sc.nextInt();

            for(int j = ga; j < ga + 10; j++){
                for(int k = se; k < se + 10; k++){
                    
                    if(visited[j][k] == true){
                        num++;
                    }

                    else
                    visited[j][k] = true;
                }
            }
        }

        System.out.println(result-num);
    }

}


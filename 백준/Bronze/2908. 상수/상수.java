import java.util.Scanner;
import java.util.*;


// BOJ -> Main
// SWEA Solution
class Main {

	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String A1;
        int new_A = 0;

        String B = sc.next();
        String B1;
        int new_B = 0;
    
        StringBuilder sbA = new StringBuilder();

        //A 변환
        for(int i = A.length()-1 ; i >= 0; i--){
            sbA.append(A.charAt(i));
        }

        A1 = sbA.toString();

        StringBuilder sbB = new StringBuilder();
        // B 변환
        for(int i = B.length()-1 ; i >= 0; i--){
            sbB.append(B.charAt(i));
        }

        B1 = sbB.toString();

        new_A = Integer.parseInt(A1);
        new_B = Integer.parseInt(B1);
           

        if(new_A > new_B){
            System.out.println(new_A);
        }

        else{
            System.out.println(new_B);
        }

    }


			
}

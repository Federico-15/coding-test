import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{	Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
     	for(int test_case = 1; test_case <= T; test_case++)
		{

            int N = sc.nextInt();

            int two[] = new int[T+1];
            int three[] = new int[T+1];
            int five[] = new int[T+1];
            int seven[] = new int[T+1];
            int eleven[] = new int[T+1];
            

            while(N != 1) {

                if(N % 2 ==0){
                N /= 2;
                two[test_case]++;
                }

                else if(N % 3 == 0){
                    N /= 3;
                    three[test_case]++;
                }

                else if(N % 5 == 0){
                    N /=5;
                    five[test_case]++;
                }

                else if(N % 7 == 0){
                N /= 7;
                seven[test_case]++;
                }

                else if(N % 11 == 0){
                N /= 11;
                eleven[test_case]++;
                }
                
                }

            System.out.println("#" + test_case + " " + two[test_case] + " " + three[test_case] + " " + five[test_case] + " " + seven[test_case] + " " + eleven[test_case]);
		}
    }
}

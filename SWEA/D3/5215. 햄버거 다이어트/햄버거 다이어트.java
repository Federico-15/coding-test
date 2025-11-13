import java.util.Scanner;

// swea
class Solution {
    
    static int N, L; // 재료의 수, 제한 칼로리
    static int[] scores; // 점수 배열
    static int[] calories; // 칼로리 배열
    static int maxScore; // 최대 점수 (정답)

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt(); // 재료 수
            L = sc.nextInt(); // 제한 칼로리

            scores = new int[N];
            calories = new int[N];
            
            // 1. 각 테스트 케이스마다 maxScore를 0으로 초기화
            maxScore = 0; 

            // 2. 재료 정보 입력
            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                calories[i] = sc.nextInt();
            }


            dfs(0, 0, 0); 
            
            // 4. 결과 출력
            System.out.println("#" + test_case + " " + maxScore);
        }
    }


    static void dfs(int index, int currentScore, int currentCalorie) {
        
        if (currentCalorie > L) {
            return;
        }

        if (index == N) {
            maxScore = Math.max(maxScore, currentScore);
            return;
        }

        
        dfs(index + 1, currentScore, currentCalorie);
        dfs(index + 1, currentScore + scores[index], currentCalorie + calories[index]);
    }
}
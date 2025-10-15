import java.io.*;
import java.util.*;


public class Main {
    static int n;  // 컴퓨터의 수
    static int[][] network;  // 네트워크 연결 정보
    static boolean[] visited;  // 방문 여부 체크
    static int count = 0;  // 감염된 컴퓨터 수

    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄: 컴퓨터 수 입력
        n = Integer.parseInt(br.readLine());
        // 둘째 줄: 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수 입력
        int m = Integer.parseInt(br.readLine());

        // 네트워크 정보 초기화
        network = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        // m개의 연결 정보 입력
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            network[a][b] = 1;  // a와 b가 연결됨
            network[b][a] = 1;  // 양방향이므로 반대쪽도 연결
        }

        // DFS 탐색 시작 (1번 컴퓨터에서 시작)
        dfs(1);

        // 1번 컴퓨터는 제외하고 카운트해야 하므로 count - 1 출력
        System.out.println(count - 1);
    }

    // DFS 탐색 함수
    static void dfs(int node) {
        visited[node] = true;  // 현재 컴퓨터 방문 처리
        count++;  // 감염된 컴퓨터 수 증가

        // 현재 노드와 연결된 다른 노드들을 탐색
        for (int i = 1; i <= n; i++) {
            if (network[node][i] == 1 && !visited[i]) {
                dfs(i);  // 연결된 노드에 대해 재귀적으로 탐색
            }
        }
    }
}

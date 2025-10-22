import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 맨 앞의 카드 제거
            queue.offer(queue.poll()); // 다음 카드를 뒤로 이동
        }

        System.out.println(queue.peek()); // 마지막 남은 카드 출력
    }
}

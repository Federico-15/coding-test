import java.util.*;

//SWEA 제출 시 클래스 이름은 Solution 이어야 합니다.
class Solution {

	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			
			int[] arr = new int[8];
			int lan = sc.nextInt();
			
			Queue <Integer> queue = new LinkedList<>();
			
			for(int i = 0; i < 8; i++) {
				queue.offer(sc.nextInt());
			}
			
			int value = 1;
			
			while(true) {
				// poll은 큐에서 가장 앞에 빼는거
				int num = queue.poll();
				
				num -= value;
				
				if(num <= 0) {
					num = 0;
					queue.offer(num);
					break;
				}
				
				queue.offer(num);
				
				value++;
				
				value = value % 5;
				if(value == 0) {
					value = 5;
				}
			}
			
			// 출력
            System.out.print("#" + tc + " ");
            for(int num : queue) {
                System.out.print(num + " ");
            }
            System.out.println(); // 줄바꿈
			
		}
		
	}
	
}
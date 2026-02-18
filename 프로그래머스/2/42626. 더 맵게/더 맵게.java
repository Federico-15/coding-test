import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        
        for(int i = 0; i < scoville.length; i++){
            minHeap.offer(scoville[i]);
        }
        
        while(minHeap.size() >= 2 && minHeap.peek() < K){
            int a = minHeap.poll();
            int b = minHeap.poll();
            minHeap.offer(a + 2*b);
            answer++;
            
        }
        if(minHeap.peek() < K){
            answer = -1;
        }
        
        
        return answer;
    }
}
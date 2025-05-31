import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int s : scoville) {
            queue.add(s);
        }
        
        int count =0;
        while(queue.size() >=2 && queue.peek() < K) {
            int s1 = queue.poll();
            int s2 = queue.poll();
            int new_s = s1 + (s2*2);
            count++;
            queue.add(new_s);

        }
        
        return queue.peek()>=K? count: -1;
    }
}
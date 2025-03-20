import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> mon = new HashSet();
        
        for(int n : nums) {
            mon.add(n);
        }
        
        return mon.size() > nums.length/2? nums.length/2: mon.size();
    }
}
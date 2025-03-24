import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] c1 = new int[sizes.length];
        int[] c2 = new int[sizes.length];
        
        for(int i=0; i < sizes.length; i++) {
           c1[i] = sizes[i][0];
           c2[i] = sizes[i][1];  
            
            if(c1[i] > c2[i]) {
                int tmp;
                tmp = c1[i];
                c1[i] = c2[i];
                c2[i] = tmp;
            }
        }
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        answer = c1[sizes.length-1] * c2[sizes.length-1];
        return answer;
    }
}
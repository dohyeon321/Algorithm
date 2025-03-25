import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int i = 0;
        st.add(arr[i++]);
        while(--n>0) {
            if(arr[i] != st.peek()) {
                st.push(arr[i]);
            }
            i++;
        }
        int size = st.size();
        int[] answer = new int[size];
        
        for(int j=size -1; j>-1; j--) {
            answer[j] = st.pop();
        }

        return answer;
    }
}
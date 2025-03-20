import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        
        HashMap<String,Integer> map = new HashMap<>();
        for(String p : participant) {
            int n = 0;
            if(map.containsKey(p)){
                n = map.get(p);
                map.put(p, ++n);
            }
            map.put(p,n);
        }
        // getOrDefault(key, defalut) 쓰면 간단! 
        for(String p : completion) {
            if(map.containsKey(p)){
                int n = map.get(p);
                map.put(p, --n);

            }
        }
                
        for(String p: participant) {
            if(map.get(p) == 0) answer=p;
        }
        
        
        return answer;
    }
}

class Solution {
    public int solution(int n, int[][] computers) {
        
        boolean isvisit[] = new boolean[n];
        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(!isvisit[i]) {
                dfs(i, n, computers, isvisit);
                answer++; 
            }
        }
        return answer;
    }
    
    
    void dfs(int current,int n, int[][] computers, boolean isvisit[]) {
        isvisit[current] = true;
        
        for(int i = 0; i < n; i++) {
            if(!isvisit[i] && computers[current][i] == 1 && i != current) {
                dfs(i, n, computers, isvisit);
            }
        }
        
    }
    
    
}
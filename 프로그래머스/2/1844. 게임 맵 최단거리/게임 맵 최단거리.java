import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        
        boolean[][] visit = new boolean[n][m];
    
        visit[0][0] = true;
        
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {0,0,1});
        
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            int dist = now[2];
            
            if(x == n-1 && y == m-1) {
                return dist;
            }
            
            for(int i = 0; i< 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >=0 && nx < n && ny >=0 && ny < m ) {
                    if(maps[nx][ny] == 1 && !visit[nx][ny]) {visit[nx][ny] = true;
                        queue.offer(new int[] {nx, ny, dist+1});
                    }
                }
                
            }
            
            
        }
        
        return -1;
    }
}
import java.util.*;

class Solution {
    
    final int max = 500001;
    int[] dst;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] am = new int[N][N];
        dst = new int[N];
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                am[i][j] = max;
            }
        }
        
        for (int[] arr : road) {
            int x = arr[0]-1;
            int y = arr[1]-1;
            am[x][y] = Math.min(am[x][y], arr[2]);
            am[y][x] = Math.min(am[y][x], arr[2]);
        }
        
        dst(0, am);
        for (int i : dst) {
            if (i<=K) answer++;
        }
        return answer;
    }
    
    void dst (int node, int[][] am) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        boolean[] v = new boolean[am.length];
        for (int i=0; i<dst.length; i++) {
            dst[i] = max;
        }
        dst[node] = 0;
        pq.add(new int[]{0, node});
    
        while(!pq.isEmpty()) {
            int[] map = pq.poll();
            if (v[map[1]]) continue;
            v[map[1]] = true;
            for (int j=0; j<dst.length; j++) {
                if (dst[j] > dst[map[1]] + am[map[1]][j]) {
                    dst[j] = dst[map[1]] + am[map[1]][j];
                    pq.add(new int[]{dst[j], j});
                }            
            }
        }
    }
}
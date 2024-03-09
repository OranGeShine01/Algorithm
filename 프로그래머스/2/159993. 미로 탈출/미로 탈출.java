import java.util.*;

class Solution {
    
    public int solution(String[] maps) {
        int len = maps[0].length();
        int[] s = {};
        int[] l = {};
        int[] e = {};
        
        for (int i=0; i<maps.length; i++) {
            for (int j=0; j<len; j++) {
                char ch = maps[i].charAt(j);
                if (ch=='S') s = new int[]{i, j};
                if (ch=='L') l = new int[]{i, j};
                if (ch=='E') e = new int[]{i, j};
            }
        }
        int sl = bfs(s, l, maps);
        int le = bfs(l, e, maps);
        return (sl==-1 || le==-1) ? -1 : sl+le;
    }
    
    int bfs (int[] start, int[] end, String[] maps) {
        final int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        int cnt = 0;
        int len = maps[0].length();
        
        boolean[][] v = new boolean[maps.length][len];
        v[start[0]][start[1]] = true;
        q.add(start);
        
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                int[] cur = q.poll();
                if (Arrays.equals(cur, end)) return cnt;
                for (int[] arr : move) {
                    int x = cur[0] + arr[0];
                    int y = cur[1] + arr[1];
                    if (x<0 || x>=maps.length || y<0 || y>=len
                        || v[x][y] || maps[x].charAt(y)=='X') continue;
                    q.add(new int[]{x, y});
                    v[x][y] = true;
                }
            }
            cnt++;
        }
        
        return -1;
    }
}
import java.util.*;

class Solution {
    
    public String[] solution(int[][] line) {
        String[] answer = {};
        int len = line.length;
        long[][] range = {{Long.MAX_VALUE, Long.MAX_VALUE}, {Long.MIN_VALUE, Long.MIN_VALUE}};
        Queue<long[]> q = new LinkedList<>();
        boolean[][] xy;
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len; j++) {
                long a = line[i][0], b = line[i][1], e = line[i][2];
                long c = line[j][0], d = line[j][1], f = line[j][2];
                long adbc = a * d - b * c;
                if (adbc == 0) continue;
                double dx = (b * f - e * d) / adbc;
                double dy = (e * c - a * f) / adbc;
                
                if ((b * f - e * d) % adbc == 0 && (e * c - a * f) % adbc == 0) {
                    long x = (long) dx;
                    long y = (long) dy;
                    range[0][0] = Math.min(range[0][0], x);
                    range[0][1] = Math.min(range[0][1], y);
                    range[1][0] = Math.max(range[1][0], x);
                    range[1][1] = Math.max(range[1][1], y);
                
                    q.add(new long[]{x, y});
                }
            }
        }
        
        int xLen = (int)(range[1][0] - range[0][0] + 1);
        int yLen = (int)(range[1][1] - range[0][1] + 1);
        
        char[][] map = new char[yLen][xLen];
        for(int i = 0; i < yLen; i++) {
    		for(int j = 0; j < xLen; j++) {
    			map[i][j] = '.';
    		}
    	}
        
        while (!q.isEmpty()) {
            long[] arr = q.poll();
            map[(int)(arr[1] - range[0][1])][(int)(arr[0] - range[0][0])] = '*';
        }
        
        answer = new String[yLen];
        
        for (int i = 0; i < yLen; i++) {
            answer[i] = new String(map[yLen - i - 1]);
        }
        
        return answer;
    }
}
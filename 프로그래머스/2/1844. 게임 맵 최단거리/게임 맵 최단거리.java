import java.util.*;

class Solution {
    
    final int[][] movingPatterns = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] minArr;
    
    public int solution(int[][] maps) {
        minArr = new int[maps.length][maps[0].length];
        int lastX = maps.length - 1;
        int lastY = maps[0].length - 1;
        bfs(maps);        
        return (minArr[lastX][lastY] == 0) ? -1 : minArr[lastX][lastY];
    }
    
    public void bfs(int[][] maps) {            
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        minArr[0][0] = 1;
        int lenX = maps.length;
        int lenY = maps[0].length;
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currX = curr[0];
            int currY = curr[1];
            for (int[] movingPattern : movingPatterns) {
                int nextX = currX + movingPattern[0];
                int nextY = currY + movingPattern[1];
                if (nextX >= 0 && nextY >= 0 && nextX < lenX && nextY < lenY && minArr[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
                    minArr[nextX][nextY] = minArr[currX][currY] + 1;
                    q.add(new int[]{nextX, nextY});
                }
            }
        }
    }
}
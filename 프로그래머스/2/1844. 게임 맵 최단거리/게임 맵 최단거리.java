import java.util.*;

class Solution {
    
    public int[][] arr;
    public int[] row = {1, 0, -1, 0};
    public int[] col = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        arr = new int[maps.length][maps[0].length];
        arr[0][0] = 1;
        bfs(maps);
        return (arr[maps.length-1][maps[0].length-1]==0) ? -1 : arr[maps.length-1][maps[0].length-1];
    }
    
    public void bfs(int[][] maps) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            for (int i=0; i<row.length; i++) {
            int x = xy[0]+row[i];
            int y = xy[1]+col[i];
            if (x>=0 && y>=0 && x<arr.length && y<arr[0].length && maps[x][y]==1 && arr[x][y]==0) {
                arr[x][y] = arr[xy[0]][xy[1]]+1;
                queue.add(new int[]{x, y});
            }
        }    
        }
        
        
    }
}
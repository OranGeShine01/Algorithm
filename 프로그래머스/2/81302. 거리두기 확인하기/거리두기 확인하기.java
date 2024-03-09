import java.util.*;

class Solution {

    int row;
    int col;

    public int[] solution(String[][] places) {
        row = places[0].length;
        col = places[0][0].length();
        int[] answer = new int[places.length];
        for (int i=0; i<places.length; i++) {
            boolean bl = true;
            for (int j=0; j<row; j++) {
                for (int k=0; k<col; k++) {
                    char ch = places[i][j].charAt(k);
                    if (ch=='P' && !bfs(j, k, places[i])) bl = false;
                }
            }
            answer[i] = bl ? 1 : 0;
        }

        return answer;
    }

    boolean bfs(int r, int c, String[] place) {

        final int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int cnt = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] v = new boolean[row][col];
        q.add(new int[]{r, c});
        v[r][c] = true;

        while(!q.isEmpty()) {

            int size = q.size();
            for (int i=0; i<size; i++) {
                int[] cur = q.poll();
                for (int[] arr : move) {
                    int x = cur[0] + arr[0];
                    int y = cur[1] + arr[1];
                    int d = Math.abs(x-r) + Math.abs(y-c);
                    if (x<0 || x>=row || y<0 || y>=col || v[x][y]) continue;
                    char ch = place[x].charAt(y);
                    if (ch=='P' && d<=2) return false;
                    if (ch=='O' && d<2) {
                    q.add(new int[]{x, y});
                    v[x][y] = true;
                    }
                }
            }
        }
        return true;
    }
}
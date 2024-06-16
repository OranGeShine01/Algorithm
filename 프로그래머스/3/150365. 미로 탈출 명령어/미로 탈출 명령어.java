import java.util.*;

class Solution {
    int[][] movings = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};
    char[] command = {'d', 'l', 'r', 'u'};
    String answer = null;
    StringBuilder sb;


    // global
    int gr;
    int gc;
    int gn;
    int gm;
    int gk;

    public String solution(int n, int m, int x, int y, int r, int c, int k) {

        gr = r;
        gc = c;
        gn = n;
        gm = m;
        gk = k;

        sb = new StringBuilder();

        int distance = calculateDistance(x, y);
        if ((k - distance) % 2 == 1 || k < distance) return "impossible";
        dfs(x, y, 0);

        return answer;
    }

    private int calculateDistance(int x, int y) {
        return Math.abs(x - gr) + Math.abs(y - gc);
    }

    private void dfs(int x, int y, int depth) {
        // 이미 도달한 경로가 있는경우
        if (answer != null) return;
        // 현재거리 + 남은거리 > 최종거리인 경우
        if (depth + calculateDistance(x, y) > gk) return;
        // 도달시 탐색 중단
        if (gk == depth) {
            answer = sb.toString();
            return;
        }

        for ( int i = 0; i < movings.length; i++) {

            int curX = x + movings[i][0];
            int curY = y + movings[i][1];

            if (isRange(curX, curY)) {
                sb.append(command[i]);
                dfs(curX, curY, depth + 1);
                sb.delete(depth, depth + 1);
            }
        }
    }

    private boolean isRange(int x, int y) {
        return (x > 0 && x <= gn && y > 0 && y <= gm);
    }
}
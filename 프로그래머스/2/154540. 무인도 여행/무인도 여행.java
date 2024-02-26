import java.util.*;

class Solution {

    boolean[][] visited;
    List<Integer> list;

    public int[] solution(String[] maps) {
        int l = maps[0].length();
        visited = new boolean[maps.length][l];
        list = new ArrayList<>();

        for (int i=0; i<maps.length; i++) {
            for (int j=0; j<l; j++) {
                bfs(i, j, maps);
            }
        }

        if (list.size()==0) return new int[]{-1};
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    void bfs(int x, int y, String[] maps) {
        if (visited[x][y]) return;
        visited[x][y] = true;
        char ch = maps[x].charAt(y); 
        if (ch=='X') {
            return;
        }

        int l = maps[0].length();
        int cnt = Character.getNumericValue(ch);
        int[][] move = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            for (int[] arr : move) {
                int r = xy[0] + arr[0];
                int c = xy[1] + arr[1];
                if (r>=0 && r<maps.length && c>=0 && c<l) {
                    char ch2 = maps[r].charAt(c);
                    if (ch2=='X' || visited[r][c]) {
                        continue;
                    } else {
                        visited[r][c] = true;
                        queue.add(new int[]{r, c});
                        cnt+=Character.getNumericValue(ch2);
                    }
                }
            }
        }
        list.add(cnt);
    }
}
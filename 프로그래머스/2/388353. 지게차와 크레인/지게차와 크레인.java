import java.util.*;

class Solution {
    public int solution(String[] storage, String[] requests) {
        int n = storage.length;
        int m = storage[0].length();
        int answer = n * m;
        
        char[][] arr = new char[n + 2][m + 2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = '.';
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i + 1][j + 1] = storage[i].charAt(j);
            }
        }
        
        for (String req : requests) {
            if (req.length() == 2) {
                char val = req.charAt(0);
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        if (arr[i][j] == val) {
                            arr[i][j] = '.';
                            answer--;
                        }
                    }
                }
            } else {
                int[][] movings = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                Queue<int[]> q = new LinkedList<>();
                List<int[]> outList = new ArrayList<>();
                boolean[][] visited = new boolean[n + 2][m + 2];
                
                q.add(new int[]{0, 0});
                visited[0][0] = true;
                
                while (!q.isEmpty()) {
                    int[] curr = q.poll();
                    for (int[] moving : movings) {
                        int l = curr[0] + moving[0];
                        int r = curr[1] + moving[1];
                        if (l >= 0 && l < n + 2 && r >= 0 && r < m + 2 && !visited[l][r]) {
                            visited[l][r] = true;
                            if (arr[l][r] == '.') {
                                q.add(new int[]{l, r});
                            } else if (req.charAt(0) == arr[l][r]) {
                                outList.add(new int[]{l, r});
                            }
                        }
                    }
                }
                
                for (int[] list : outList) {
                    arr[list[0]][list[1]] = '.';
                    answer--;
                }
                
            }
        }
        
        return answer;
    }
}
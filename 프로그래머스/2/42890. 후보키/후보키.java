import java.util.*;

class Solution {

    // 후보키 저장
    Set<String> set;
    // Global로 사용할 relation
    String[][] gRelation;
    // columns, rows
    int tupleLen;
    int relLen;

    public int solution(String[][] relation) {
        tupleLen = relation.length;
        relLen = relation[0].length;
        gRelation = relation;
        set = new HashSet<>();

        for (int i=1; i<=relLen; i++) {
            boolean[] visited = new boolean[relLen];
            dfs(0, 0, i, visited);
        }

        return set.size();
    }

    // 각 속성조합을 구하기 위한 dfs
    void dfs(int idx, int depth, int max, boolean[] visited) {
        if (depth == max) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<visited.length; i++) {
                if (visited[i]) sb.append(i);
            }
            String cols = sb.toString();
            if (isPossible(cols)) set.add(cols);
            return;
        }

        if (idx >= relLen) return;

        visited[idx] = true;
        dfs(idx + 1, depth + 1, max, visited);
        visited[idx] = false;
        dfs(idx + 1, depth, max, visited);
    }

    // 유일성과 최소성 판별
    boolean isPossible(String cols) {
        // 최소성 판별
        for (String s : set) {
            boolean flag = true;
            int len = s.length();
            for (int i=0; i<len; i++) {
                if (!cols.contains(String.valueOf(s.charAt(i)))) flag = false;
            }
            if (flag) return false;
        }

        //유일성 판별
        Set<String> uniqueSet = new HashSet<>();
        for (int i=0; i<tupleLen; i++) {
            StringBuilder sb = new StringBuilder();
            int colsLen = cols.length();
            for (int j=0; j<colsLen; j++) {
                int row = cols.charAt(j) - '0';
                sb.append(gRelation[i][row]);
            }
            String str = sb.toString();
            if (uniqueSet.contains(str)) return false;
            uniqueSet.add(str);
        }
        return true;
    }
}
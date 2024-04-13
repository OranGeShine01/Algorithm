class Solution {
    
    int[] answer;
    final int scoreLength = 11;
    int maxScoreDiff = 0;
    
    public int[] solution(int n, int[] info) {
        
        answer = new int[scoreLength];
        dfs(0, 0, info, new int[scoreLength], n);
        return (maxScoreDiff > 0) ? answer : new int[]{-1};
    }
    
    void dfs (int depth, int scoreDiff, int[] info, int[] lion, int n) {
        if (depth == scoreLength) {
            if (scoreDiff > maxScoreDiff || (scoreDiff == maxScoreDiff && isBetter(lion))) {
                if (n > 0) lion[scoreLength - 1] += n;
                answer = lion.clone();
                maxScoreDiff = scoreDiff;
                if (n > 0) lion[scoreLength - 1] -= n;
            }
            return;
        }
        
        int score = 10 - depth;
        
        // 라이언이 점수를 가져가는 경우
        if (n > info[depth]) {
            lion[depth] = info[depth] + 1;
            dfs(depth + 1, scoreDiff + score, info, lion, n - lion[depth]);
            lion[depth] = 0;
        }
        
        // 라이언이 점수를 가져가지 않는 경우
        if (info[depth] == 0) {
            dfs(depth + 1, scoreDiff, info, lion, n);    
        } else {
            dfs(depth + 1, scoreDiff - score, info, lion, n);    
        }
    }
    
    boolean isBetter(int[] lion) {
        for (int i = scoreLength - 1; i >= 0; i--) {
            if (lion[i] > answer[i]) return true;
            else if (lion[i] < answer[i]) return false;
        }
        return false;
    }
}
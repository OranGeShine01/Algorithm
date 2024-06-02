class Solution {
    
    // 원활한 dfs를 위해 info, edges global 처리
    int[] gInfo;
    int[][] gEdges;
    int answer = 0;
    
    public int solution(int[] info, int[][] edges) {
        gInfo = info;
        gEdges = edges;
        int visitedBit = 0;
        dfs(0, visitedBit, 0, 0);
        return answer;
    }
    
    private void dfs(int idx, int visitedBit, int sheep, int wolf) {
        visitedBit |= (1 << idx);
        if (gInfo[idx] == 0) {
            sheep++;
            if (answer < sheep) answer = sheep;
        } else {
            wolf++;
        }
        
        if (sheep <= wolf) return;
        
        for (int[] edge : gEdges) {
            if ((visitedBit & (1 << edge[0])) != 0 && (visitedBit & (1 << edge[1])) == 0) {
                dfs(edge[1], visitedBit, sheep, wolf);
            }
        }
    }
}
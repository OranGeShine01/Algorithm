class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        int edgeCount = 0;
        for (int[] edge : edges) {
            edgeCount = Math.max(Math.max(edgeCount, edge[0]),edge[1]);
        }
        
        int[][] countArr = new int[edgeCount + 1][2];
        
        for (int[] edge : edges) {
            countArr[edge[0]][1]++;
            countArr[edge[1]][0]++;
        }
        
        for (int i = 1; i <= edgeCount; i++) {
            if (countArr[i][0] == 0 && countArr[i][1] >= 2) answer[0] = i;
            else if (countArr[i][0] > 0 && countArr[i][1] == 0) answer[2]++;
            else if (countArr[i][0] >= 2 && countArr[i][1] == 2) answer[3]++;
        }
        
        answer[1] = countArr[answer[0]][1] - answer[2] - answer[3];
        
        return answer;
    }
}
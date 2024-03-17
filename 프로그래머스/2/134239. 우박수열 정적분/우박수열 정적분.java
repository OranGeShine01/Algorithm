import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        Queue<Double> q = new LinkedList<>();
        double[] collatz;
        double[] prefixSum;
        
        q.add((double)k);
        
        while (k != 1) {
            if (k % 2 == 0) k /= 2;
            else k = k * 3 + 1;
            q.add((double)k);
        }
        int len = q.size();
        collatz = new double[len];
        for (int i=0; i<len; i++) {
            collatz[i] = q.poll();
        }
        
        prefixSum = new double[len];
        for (int i=1; i<len; i++) {
            prefixSum[i] = prefixSum[i-1] + (collatz[i] + collatz[i-1])/2;
        }
        
        for (int i=0; i<answer.length; i++) {
            int n = len - 1;
            if (n + ranges[i][1] < 0 || n+ranges[i][1]<ranges[i][0]) answer[i] = -1;
            else answer[i] = prefixSum[n + ranges[i][1]] - prefixSum[ranges[i][0]];
        }
        return answer;
    }
}
class Solution {
    
    int n;
    int[] weak;
    int[] dist;
    int[][] rotationWeakness;
    int weakLen;
    int distLen;
    boolean isFinished;
    int answer;
    
    public int solution(int n, int[] weak, int[] dist) {
        this.n = n;
        this.weak = weak;
        this.dist = dist;
        weakLen = weak.length;
        distLen = dist.length;
        answer = distLen + 1;
        
        setRotationWeakness();
        
        int[] distCombination = new int[distLen];
        dfsDist(0, new boolean[distLen], distCombination);
        return (answer == distLen + 1) ? -1 : answer;
    }
    
    private void setRotationWeakness() {
        rotationWeakness = new int[weakLen][weakLen];
        rotationWeakness[0] = weak;
        for (int i = 1; i < weakLen; i++) {
            rotationWeakness[i] = rotate(i);
        }
    }
    
    private int[] rotate(int rotateCount) {
        int[] result = new int[weakLen];
        for (int i = 0; i < weakLen; i++) {
            int idx = i + rotateCount;
            result[i] = (idx >= weakLen) ? weak[idx - weakLen] + n : weak[idx];
        }
        return result;
    }
    
    private void dfsDist(int depth, boolean[] isVisited, int[] distCombination) {
        if (depth == distLen) {
            for (int[] rotatedWeakness: rotationWeakness)
            check(distCombination, rotatedWeakness);
            return;
        }
        for (int i = 0; i < distLen; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                distCombination[depth] = dist[i];
                dfsDist(depth + 1, isVisited, distCombination);
                distCombination[depth] = 0;
                isVisited[i] = false;
            }
        }
    }
    
    private void check(int[] distCombination, int[] rotatedWeakness) {
        int weakIdx = 0;
        int distIdx = 0;
        while (weakIdx < weakLen && distIdx < distLen) {
            int cover = rotatedWeakness[weakIdx] + distCombination[distIdx];
            int nextWeakIdx = weakIdx + 1;
            while (nextWeakIdx < weakLen && 
                cover >= rotatedWeakness[nextWeakIdx]) {
                nextWeakIdx++;
            }
            weakIdx = nextWeakIdx;
            distIdx++;
        }
        if (weakIdx == weakLen) answer = Math.min(answer, distIdx);        
    }
}
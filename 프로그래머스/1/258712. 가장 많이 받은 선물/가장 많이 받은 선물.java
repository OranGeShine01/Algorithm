import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        int fLen = friends.length;
        for (int i = 0; i < fLen; i++) {
            map.put(friends[i], i);
        }
        
        int[][] graph = new int[fLen][fLen];
        
        for (String g : gifts) {
            String[] arr = g.split(" ");
            String giving = arr[0];
            String taking = arr[1];
            graph[map.get(giving)][map.get(taking)]++;
        }
        
        int[] giftIdx = new int[fLen];
        
        for (int i = 0; i < fLen; i++) {
            int cnt = 0;
            for (int j = 0; j < fLen; j++) {
                cnt += graph[i][j];
                cnt -= graph[j][i];
            }
            giftIdx[i] = cnt;
        }
        
        int[] nextGift = new int[fLen];
        
        for (int i = 0; i < fLen - 1; i++) {
            for (int j = i + 1; j < fLen; j++) {
                if (graph[i][j] > graph[j][i]) nextGift[i]++;
                else if (graph[i][j] < graph[j][i]) nextGift[j]++;
                else {
                    if (giftIdx[i] > giftIdx[j]) nextGift[i]++;
                    else if (giftIdx[j] > giftIdx[i]) nextGift[j]++;
                }
            }
        }
        
        for (int i : nextGift) {
            answer = Math.max(answer, i);
        }
        
        return answer;
    }
}
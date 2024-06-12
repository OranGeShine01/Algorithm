import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        final int dice = 6;
        int answer = 0;
        
        // 주사위당 나온 횟수
        int[] counts = new int[dice + 1];
        
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;
        
        // 주사위 숫자별 나온 갯수
        Map<Integer, Integer> map = new HashMap<>();
        map.put(counts[a], map.getOrDefault(counts[a], 0) + 1);
        map.put(counts[b], map.getOrDefault(counts[b], 0) + 1);
        map.put(counts[c], map.getOrDefault(counts[c], 0) + 1);
        map.put(counts[d], map.getOrDefault(counts[d], 0) + 1);   
        
        int p = 0;
        int q = 0;
        
        if (map.containsKey(4)) return 1111 * a;
        else if (map.containsKey(3)) {
            for (int i = 1; i < counts.length; i++) {
                if (counts[i] == 3) p = i;
                else if (counts[i] == 1) q = i;
                if (p != 0 && q != 0) break;
            }
            int pq = 10 * p + q;
            return pq * pq;
        }
        else if (map.containsKey(2)) {
            if (map.get(2) == 4) {
                for (int i = 1; i < counts.length; i++) {
                    if (counts[i] == 2) {
                        if (p == 0) p = i;
                        else {
                            q = i;
                            break;
                        }
                    }
                }
                return (p + q) * Math.abs(p - q);
            } else {
                for (int i = 1; i < counts.length; i++) {
                    if (counts[i] == 1) {
                        if (p == 0) p = i;
                        else {
                            q = i;
                            break;
                        }
                    }
                }
                return p * q;
            }
        }
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }
}
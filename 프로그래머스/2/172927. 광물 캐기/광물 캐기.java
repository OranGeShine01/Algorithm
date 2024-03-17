import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        final int[][] fatigue = {{1, 1, 1}, {5, 1, 1}, {25, 5, 1}};
        final int unit = 5;
        ArrayList<int[]> list = new ArrayList<>();
        int answer = 0;
        int sum = 0;
        for (int i : picks) {
            sum+=i;
        }
        for (int i=0; i<minerals.length; i+=unit) {
            if (sum==0) break;
            int[] cnt = new int[3];
            for (int j=i; j<i+unit; j++) {
                if (j>=minerals.length) break;
                int val = 0;
                switch (minerals[j]) {
                    case "diamond" :
                        val = 0;
                        break;
                    case "iron" :
                        val = 1;
                        break;
                    case "stone" :
                        val = 2;
                        break;
                }
                for (int k=0; k<cnt.length; k++) {
                    cnt[k]+=fatigue[k][val];
                }
            }
            list.add(cnt);
            sum--;
        }
        
        Collections.sort(list, (o1, o2) -> (o2[2] - o1[2]));
        
        int size = list.size();
        for (int[] arr : list) {
            for (int i=0; i<picks.length; i++) {
                if (picks[i]>0) {
                    answer+=arr[i];
                    picks[i]--;
                    break;
                }
            }
        }
        return answer;
    }
}
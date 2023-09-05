import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[][] score) {
        int l = score.length;
        int[] answer = new int[l];
        float [][] arr = new float[l][2];
        for (int i=0; i<l; i++) {
            arr[i][0] = i;
            arr[i][1] = (float)((score[i][0] + score[i][1])/2.0);
        }

        Arrays.sort(arr, new Comparator<float[]>() {
            @Override
            public int compare(float[] o1, float[] o2) {
                int comp = Float.compare(o2[1], o1[0]);
                if (comp==0) return Float.compare(o1[0], o2[0]);
                else return Float.compare(o2[1], o1[1]);
            }
        });

        Map<Float, Integer> map = new HashMap<>();
        int count = 0; // 중복순위여부를 판단
        for (int i=0; i<l; i++) {
            if (!map.containsKey(arr[i][1])) {
                map.put(arr[i][1], i+1);
            }
        }

        for (int i=0; i<l; i++) {
            answer[(int)arr[i][0]] = map.get(arr[i][1]);
        }

        return answer;
    }
}
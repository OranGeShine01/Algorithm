import java.util.*;

class Solution {
    
    final float s1 = 2.0f;
    final float s2 = 3.0f;
    final float s3 = 4.0f;
    
    public long solution(int[] weights) {
        long answer = 0;
        Map<Float, Integer> map = new HashMap<>();
        float[] arr = {1.0f, s1/s2, s2/s3, s1/s3};
        
        Arrays.sort(weights);
        
        for (int i : weights) {
            for (float f : arr) {
                float key = i*f;
                if (map.containsKey(key)) answer+=map.get(key);
            }
            map.put((float)i, map.getOrDefault((float)i, 0)+1);
        }
        
        return answer;
    }
}
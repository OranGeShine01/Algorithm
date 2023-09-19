import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        int l1 = want.length;
        int l2 = discount.length;
        for (int i=0; i<l2-9; i++) {
            for (int j=0; j<l1; j++) {
                map.put(want[j], number[j]);
            }
            int count = 10;
            for (int k=0; k<10; k++) {
                String str = discount[i+k];
                if (map.containsKey(str)) {
                    int temp = map.get(str);
                    if (temp>0) {
                        map.put(str, temp-1);
                        count--;
                    }   
                    else break;
                }
                else break;
            }
            if (count==0) answer++;
        }
        return answer;
    }
}
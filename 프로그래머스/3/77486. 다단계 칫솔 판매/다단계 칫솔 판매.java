import java.util.*;

class Solution {
    
    final int price = 100;
    final int rate = 10;
    
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        // 판매원의 index를 저장하는 map
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            map.put(enroll[i], i);
        }
        
        // amount 할당
        for (int i = 0; i < seller.length; i++) {
            int cnt = amount[i] * price;
            String getter = seller[i];
            while (!getter.equals("-") && cnt >= 1) {
                // 부모 금액
                int parentCnt = cnt / rate;
                // 자식의 이익금
                int newCnt = cnt - parentCnt;
                
                int idx = map.get(getter);
                
                // 자식 이익금 할당
                answer[idx] += newCnt;
                
                // 다음 노드를 위한 세팅
                getter = referral[idx];
                cnt /= rate;
            }
        }
        
        return answer;
    }
}
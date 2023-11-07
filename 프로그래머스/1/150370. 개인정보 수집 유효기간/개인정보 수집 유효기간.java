import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        int[] todayArr = new int[3];
        StringTokenizer st = new StringTokenizer(today, ".");
        for (int i=0; i<todayArr.length; i++) {
            todayArr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Character, Integer> map = new HashMap<>();

        for (String str : terms) {
            st = new StringTokenizer(str);
            char ch = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());
            
            map.put(ch, t);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<privacies.length; i++) {
            String[] strArr = privacies[i].split("[. ]");
            int[] privArr = new int[3];
            for (int j=0; j<privArr.length; j++) {
                privArr[j] = Integer.parseInt(strArr[j]);
            }
            
            privArr[1]+=map.get(strArr[3].charAt(0));
            if (privArr[1]>12) {
                privArr[0]+=(privArr[1]/12);
                privArr[1]%=12;
                if (privArr[1]==0) {
                    privArr[0]--;
                    privArr[1]=12;
                }
            }

            char ch = strArr[3].charAt(0);       
            
            if (privArr[0]<todayArr[0] ||
                    (privArr[0]==todayArr[0] &&
                            (privArr[1]<todayArr[1] ||
                                    (privArr[1]==todayArr[1] && privArr[2]<=todayArr[2])))) queue.add(i+1);
        }

        answer = new int[queue.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        boolean[] pn = new boolean[n+1]; // 소수판별배열
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<=n; i++) {
        	if (i<=1) {
        		pn[i] = true;
        		continue;
        	}
        	
        	if (pn[i]) {
    			continue;
    		}
        	
        	for (int j=i*i; j<=n; j+=i) {
        			 pn[j] = true;
        	}
        }
        
        for (int i=2; i<=n; i++) {
           	if (!pn[i] && n%i==0) {
           		queue.add(i);
           	}
        }        
        
        int l = queue.size(); // 소인수의 양
        answer = new int[l];
        
        for (int i=0; i<l; i++) {
        	answer[i] = queue.poll();
        }        
        return answer;
    }
}
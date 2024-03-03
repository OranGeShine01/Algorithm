import java.util.*;

class Solution {

    final int range = 20;
    
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        long[] fact = new long[range+1];
        ArrayList<Integer> list = new ArrayList<>();
        long cnt = k-1;
        int idx = 0;
        
        for (int i=1; i<=n; i++) {
            list.add(i);
        }
        
        fact[0] = 1;
        fact[1] = 1;
        for (int i=2; i<fact.length; i++) {
            fact[i] = fact[i-1]*i;
        }

        while (n>0) {
            int temp = (int)( cnt / fact[n-1] );
            answer[idx] = list.get(temp);
            list.remove(temp);
            cnt %= fact[n-1];
            idx++;
            n--;
        }

        return answer;
    }
}
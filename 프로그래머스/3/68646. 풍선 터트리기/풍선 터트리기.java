class Solution {
    public int solution(int[] a) {
        int answer = 2;
        int len = a.length;
        // 배열 앞부터 최소값 저장하는 dp
        int[] dpFront = new int[len];
        // 배열 뒤부터 최소값 저장하는 dp
        int[] dpEnd = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0) dpFront[i] = Math.min(a[i], dpFront[i - 1]);
            else dpFront[i] = a[i];
            int idx = len - 1 - i;
            if (i > 0) dpEnd[idx] = Math.min(a[idx], dpEnd[idx + 1]);
            else dpEnd[idx] = a[idx];
        }
        
        for (int i = 1; i < len - 1; i++) {
            if (a[i] < dpFront[i - 1] || a[i] < dpEnd[i + 1]) answer++;    
        }
        
        return answer;
    }
}
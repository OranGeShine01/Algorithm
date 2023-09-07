class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] count = new int[n]; // 각 학생의 체육복 수를 count
        for (int i : lost) {
            count[i-1]--;
        }
        for (int i : reserve) {
            count[i-1]++;
        }
        for (int i=0; i<n; i++) {
            if (count[i]<0) {
                if (i!=0 && count[i-1]>0) {
                    count[i-1]--;
                    count[i]++;
                } else if (i!=n-1 && count[i+1]>0) {
                    count[i+1]--;
                    count[i]++;
                }
            }
        }
        for (int i=0; i<n; i++) {
            if (count[i]>=0) answer++;
        }
        return answer;
    }
}
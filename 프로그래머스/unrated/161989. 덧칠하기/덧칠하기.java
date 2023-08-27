class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int l = section.length;
        // section에 색칠여부를 판별하는 배열
        boolean[] roller = new boolean[l];
        for (int i=0; i<l; i++) {
            if (!roller[i]) {
                answer++;
                roller[i] = true;
                for (int j=i; j<l; j++) {
                    if (section[i]+m>section[j]) {
                        roller[j] = true;
                    }
                }
            }
        }
        return answer;
    }
}
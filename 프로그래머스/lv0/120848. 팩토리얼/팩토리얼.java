class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] f = new int[10]; // 팩토리얼 (10!까지)
        f[0] = 1;
        for (int i=1; i<f.length; i++) {
            f[i] = f[i-1] * (i+1);
        }
        for (int i=0; i<f.length; i++) {
            if (n<f[i]) {
                answer = i;
                break;
            } else if (n==f[i]) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
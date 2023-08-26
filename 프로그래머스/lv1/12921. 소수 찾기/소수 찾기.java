class Solution {

    public int solution(int n) {
        boolean[] prime = prime(n);
        int answer = 0;
        for (boolean i : prime) {
            if (!i) {
                answer++;
            }
        }

        return answer;
    }

    // n까지의 소수 여부를 판별하는 method, 소수면 false
    boolean[] prime(int n) {
        boolean[] pr = new boolean[n+1];
        int rn = (int)Math.sqrt(n);
        pr[0] = true;
        pr[1] = true;
        for (int i=2; i<=rn; i++) {
            for (int j=i*i; j<=n; j+=i) {
                pr[j] = true;
            }
        }

        return pr;
    }

}
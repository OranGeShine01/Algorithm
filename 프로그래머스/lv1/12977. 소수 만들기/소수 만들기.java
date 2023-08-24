class Solution {

    public int solution(int[] nums) {
        int l = nums.length;
        boolean[] prime = prime(3000);
        int answer = 0;
        for (int i=0; i<l-2; i++) {
            for (int j=i+1; j<l-1; j++) {
                for (int k=j+1; k<l; k++) {
                    int n = nums[i]+nums[j]+nums[k];
                    if (!prime[n]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    // n까지의 소수 여부를 판별하는 method, 소수면 false
    boolean[] prime(int n) {
        boolean[] pr = new boolean[n+1];
        int rn = (int)Math.sqrt(n);

        for (int i=2; i<=rn; i++) {
            for (int j=i*i; j<=n; j+=i) {
                pr[j] = true;
            }
        }

        return pr;
    }

}
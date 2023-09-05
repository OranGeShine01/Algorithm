class Solution {
    public int solution(int a, int b) {
        if (a>b) b/=gcd(b, a);
        else b/=gcd(a, b);
        if (b==1) return 1;
        else if (b%2==0 || b%5==0) {
            boolean[] prime = prime(b);
            for (int i=3; i<=b; i++) {
                if (!prime[i] && b%i==0 && i!=5) {
                    return 2;
                }
            }
            return 1;
        }
        return 2;
    }

    public boolean[] prime(int b) {
        boolean[] prime = new boolean[b+1];
        for (int i=2; i<=b; i++) {
            for (int j=i*i; j<=b; j+=i) {
                prime[j]=true;
            }
        }
        return prime;
    }

    public int gcd(int small, int big) {
        int div = big%small;
        if(div==0) {
            return small;
        }
        return gcd(div, small);
    }

}
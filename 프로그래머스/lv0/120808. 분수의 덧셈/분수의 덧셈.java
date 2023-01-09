class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1*denom2 + numer2 * denom1;
        int b = denom1*denom2;
        int gcd=1;
        if (a>b) {
            gcd = gcd(b, a);
        } else {
            gcd = gcd(a, b);
        }
        answer[0] = a/gcd;
        answer[1] = b/gcd;
        return answer;
    }
    
    public int gcd(int minor, int major) {
        while (minor!=0) {
            int temp = minor;
            minor = major%minor;
            major = temp;
        }
        return major;
    }
}
class Solution {
    public int[] solution(int n, int m) {
        if (n>m) {
            int temp = n;
            n = m;
            m = temp;
        }
        int[] answer = {gcd(n, m), n * m / gcd(n, m)};
        return answer;
    }
    
    public int gcd(int a, int b) {
        while (a!=0) {
            int temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }
}
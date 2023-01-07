class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n>=6) {
            answer = n / gcd(6, n);
        } else {
            answer = n / gcd(n, 6);
        }
        return answer;
    }
    
    public static int gcd(int a, int b) {
        while (a!=0) {
            int temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }
}
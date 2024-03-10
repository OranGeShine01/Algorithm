class Solution {
    public long solution(int w, int h) {
        long answer = (long) w * h;
        if (w>h) {
            int temp = w;
            w = h;
            h = temp;
        }
        int gcd = gcd(w, h);
        w/=gcd;
        h/=gcd;
        
        answer-=(long)gcd * (w + h - 1);
        return answer;
    }
    
    int gcd (int a, int b) {
        return (b%a==0) ? a : gcd(b%a, a);
    }
}
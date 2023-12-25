class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] arr = notation(n, k).split("0+");
        for (String str : arr) {
            if (prime(str)) answer++;
        }
        return answer;
    }
    
    public String notation(int n, int k) {
        if (k==10) return String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
            sb.append(n%k);
            n/=k;
        }
        return sb.reverse().toString();
    }
    
    public boolean prime(String str) {
        long l = Long.parseLong(str);
        if (l<=1) return false;
        Double l2 = Math.sqrt(l);
        for (long i = 2; i<=l2; i++) {
            if (l%i==0) return false;
        }
        return true;
    }
    
}
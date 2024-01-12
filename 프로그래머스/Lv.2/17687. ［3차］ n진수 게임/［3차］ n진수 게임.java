class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int l = m*t;
        while (sb.length()<l) {
            sb.append(Integer.toString(i++, n));
        }
        System.out.println(sb);
        p--;
        StringBuilder sb2 = new StringBuilder();
        for (int j=0; j<l; j+=m) {
            sb2.append(sb.charAt(j+p));
        }
        return sb2.toString().toUpperCase();
    }
    
}
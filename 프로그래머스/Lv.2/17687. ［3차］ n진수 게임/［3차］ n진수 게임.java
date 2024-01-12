class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        String str = game(n, m*t+p);
        System.out.println(str);
        p--;
        int l = str.length();
        for (int i=0; i<t; i++) {
            sb.append(str.charAt(i*m+p));
        }
        return sb.toString();
    }
    
    public String game(int n, int l) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (sb.length()<l) {
            sb.append(notation(n, i));
            i++;
        }
        return sb.toString();
    }
    
    public String notation (int n, int t) {
        StringBuilder sb = new StringBuilder();
        if (t==0) return String.valueOf(t);
        while (t!=0) {
            sb.append(one(t%n));
            t/=n;
        }
        return sb.reverse().toString();
    }
    
    public String one (int t) {
        if (t<10) return String.valueOf(t);
        else return String.valueOf((char)(t-10+'A'));
    }
}